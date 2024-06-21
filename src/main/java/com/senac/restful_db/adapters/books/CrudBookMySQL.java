package com.senac.restful_db.adapters.books;


import com.senac.restful_db.adapters.database.domain.BookMySQL;
import com.senac.restful_db.adapters.database.repositories.MySqlBookRepository;
import com.senac.restful_db.usecase.ucbooks.models.DatabaseType;
import com.senac.restful_db.usecase.ucbooks.port.CrudRequest;
import com.senac.restful_db.usecase.ucbooks.port.CrudResponse;
import com.senac.restful_db.usecase.ucbooks.port.IBookStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Optional;

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
        return null;
    }

    @Override
    public CrudResponse getBook(CrudRequest request) {
        var responseDb = mySqlBookRepository.findById(Long.parseLong(request.getId()));
        return null;
    }

}