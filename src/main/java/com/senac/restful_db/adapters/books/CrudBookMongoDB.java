package com.senac.restful_db.adapters.books;

import com.senac.restful_db.adapters.database.domain.BookDTO;
import com.senac.restful_db.adapters.database.domain.BookMongo;
import com.senac.restful_db.adapters.database.repositories.MongoDbBookRepository;
import com.senac.restful_db.usecase.ucbooks.models.DatabaseType;
import com.senac.restful_db.usecase.ucbooks.port.CrudRequest;
import com.senac.restful_db.usecase.ucbooks.port.CrudResponse;
import com.senac.restful_db.usecase.ucbooks.port.IBookStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@Primary
public class CrudBookMongoDB implements IBookStrategy {

    private final MongoDbBookRepository mongoDbBookRepository;

    @Override
    public boolean selector(final DatabaseType databaseType) {
        return DatabaseType.MONGODB == databaseType;
    }

    @Override
    public CrudResponse getAllBooks() {
        var responseDb = mongoDbBookRepository.findAll();
        var dtos = responseDb.stream().map(resp -> resp.toBookDTO(resp)).toList();
        return CrudResponse.builder().books(dtos).build();
    }

    @Override
    public CrudResponse getBook(CrudRequest request) {
        var responseDb = mongoDbBookRepository.findById(request.getId());
        if(responseDb.isPresent()){
            var bookMongo = responseDb.get();
            return CrudResponse.builder().books(List.of(responseDb.get().toBookDTO(bookMongo))).build();
        }
        return CrudResponse.builder().books(new ArrayList<>()).build();
    }

    @Override
    public CrudResponse saveBook(CrudRequest request) {
        var response = mongoDbBookRepository.save(new BookMongo().toEntity(request));
        var book = new CrudResponse().toBookDto(response.getId(), response.getTitle(),
                response.getPublishedAt(), response.getIsbn(), response.getPrice());
        return CrudResponse.builder().books(List.of(book)).build();
    }

}
