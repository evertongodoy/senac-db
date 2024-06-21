package com.senac.restful_db.adapters.books;


import com.senac.restful_db.adapters.database.repositories.MySqlBookRepository;
import com.senac.restful_db.usecase.ucbooks.models.DatabaseType;
import com.senac.restful_db.usecase.ucbooks.port.CrudResponse;
import com.senac.restful_db.usecase.ucbooks.port.IBookStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

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
        var books = mySqlBookRepository.findAll();
        return null;
    }

}