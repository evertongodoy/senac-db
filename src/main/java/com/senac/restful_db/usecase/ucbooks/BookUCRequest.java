package com.senac.restful_db.usecase.ucbooks;

import com.senac.restful_db.usecase.ucbooks.models.DatabaseType;
import lombok.Getter;

public class BookUCRequest {

    @Getter
    private String database;
    @Getter
    private DatabaseType databaseType;

    public BookUCRequest(String database){
        this.database = database;
        this.databaseType = DatabaseType.fromString(database);
    }

}