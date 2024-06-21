package com.senac.restful_db.adapters.books;

import com.senac.restful_db.adapters.database.repositories.MongoDbBookRepository;
import com.senac.restful_db.usecase.ucbooks.models.DatabaseType;
import com.senac.restful_db.usecase.ucbooks.port.CrudResponse;
import com.senac.restful_db.usecase.ucbooks.port.IBookStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

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
        var book2 = mongoDbBookRepository.findAll();
        return null;
    }

}
