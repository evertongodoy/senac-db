package com.senac.restful_db.usecase.ucbooks;

import com.senac.restful_db.usecase.ucbooks.port.CrudRequest;

public interface IBookUC {

    BookUCResponse getBooks(BookUCRequest request);
    BookUCResponse getBook(BookUCRequest request);

}
