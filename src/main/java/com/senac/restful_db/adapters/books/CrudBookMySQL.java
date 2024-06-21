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
        var book = new CrudResponse().toBookDto(String.valueOf(response.getId()),
                response.getTitle(), response.getPublishedAt(), response.getIsbn(), response.getPrice());
        return CrudResponse.builder().books(List.of(book)).build();
    }

}