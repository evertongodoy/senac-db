package com.senac.restful_db.adapters.books;


import com.senac.restful_db.adapters.database.domain.BookDTO;
import com.senac.restful_db.adapters.database.domain.BookMySQL;
import com.senac.restful_db.adapters.database.repositories.MySqlBookRepository;
import com.senac.restful_db.usecase.ucbooks.models.DatabaseType;
import com.senac.restful_db.usecase.ucbooks.port.CrudRequest;
import com.senac.restful_db.usecase.ucbooks.port.CrudResponse;
import com.senac.restful_db.usecase.ucbooks.port.IBookStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class CrudBookMySQL implements IBookStrategy {

    private final MySqlBookRepository mySqlBookRepository;

    @Override
    public boolean selector(final DatabaseType databaseType) {
        return DatabaseType.MYSQL == databaseType;
    }

    @Override
    public CrudResponse getAllBooks() {
        var responseDb = mySqlBookRepository.findAll();
        var dtos = responseDb.stream().map(resp -> resp.toBookDTO(resp)).toList();
        return CrudResponse.builder().books(dtos).build();
    }

    @Override
    public CrudResponse getBook(CrudRequest request) {
        var responseDb = mySqlBookRepository.findById(Long.parseLong(request.getId()));
        if(responseDb.isPresent()){
            var bookMysql = responseDb.get();
            return CrudResponse.builder().books(List.of(responseDb.get().toBookDTO(bookMysql))).build();
        }
        return CrudResponse.builder().books(new ArrayList<>()).build();
    }

    @Override
    public CrudResponse saveBook(CrudRequest request) {
        var response = mySqlBookRepository.save(new BookMySQL().toEntity(request));
        var bookDTO = this.prepareBookDTO(response);
        return CrudResponse.builder().books(List.of(bookDTO)).build();
    }

    @Override
    public CrudResponse editBook(CrudRequest request) {
        var responseDb = mySqlBookRepository.findById(Long.parseLong(request.getId()));
        if(responseDb.isPresent()){
            this.buildBookMySQL(request, responseDb.get());
            var response = mySqlBookRepository.save(new BookMySQL().toEntity(request));
            var bookDTO = this.prepareBookDTO(response);
            return CrudResponse.builder().books(List.of(bookDTO)).build();
        }
        throw new RuntimeException("ID Book MYSQL does not exists");
    }

    @Override
    public void deleteBook(CrudRequest request) {
        var responseDb = mySqlBookRepository.findById(Long.parseLong(request.getId()));
        if(responseDb.isPresent()){
            var bookMysql = responseDb.get();
            mySqlBookRepository.delete(bookMysql);
            return;
        }
        throw new RuntimeException("ID Book MYSQL does not exists");
    }

    private BookDTO prepareBookDTO(BookMySQL entity){
        return new CrudResponse().toBookDto(String.valueOf(entity.getId()),
                entity.getTitle(), entity.getPublishedAt(), entity.getIsbn(), entity.getPrice());
    }

    private void buildBookMySQL(CrudRequest request, BookMySQL bookMySQL){
        request.setTitle((Objects.isNull(request.getTitle()) || request.getTitle().trim().length() == 0) ? bookMySQL.getTitle() : request.getTitle());
        request.setPublishedAt(Objects.isNull(request.getPublishedAt()) ? bookMySQL.getPublishedAt() : request.getPublishedAt());
        request.setIsbn((Objects.isNull(request.getIsbn()) || request.getIsbn().trim().length() == 0) ? bookMySQL.getIsbn() : request.getIsbn());
        request.setPrice(Objects.isNull(request.getPrice()) ? bookMySQL.getPrice() : request.getPrice());
    }

}