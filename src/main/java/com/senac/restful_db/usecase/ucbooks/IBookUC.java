package com.senac.restful_db.usecase.ucbooks;

public interface IBookUC {

    BookUCResponse retrieveAllBooks(BookUCRequest request);
    BookUCResponse getBook(BookUCRequest request);

    BookUCResponse saveBook(BookUCRequest request);

}
