package com.senac.restful_db.adapters.books;

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

import java.util.Optional;

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
        return null;
    }

    @Override
    public CrudResponse getBook(CrudRequest request) {
        var responseDb = mongoDbBookRepository.findById(request.getId());
        return null;
    }

}
