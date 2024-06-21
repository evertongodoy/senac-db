package com.senac.restful_db.usecase.ucbooks.port;

import com.senac.restful_db.usecase.ucbooks.models.DatabaseType;

public interface IBookStrategy {

    boolean selector(DatabaseType databaseType);
    CrudResponse getAllBooks();

}