package com.senac.restful_db.usecase.ucbooks;

import com.senac.restful_db.usecase.ucbooks.port.CrudRequest;
import com.senac.restful_db.usecase.ucbooks.port.CrudResponse;
import com.senac.restful_db.usecase.ucbooks.port.IBookStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookUCImpl implements IBookUC {

    private final CrudBookStrategyFactory crudBookStrategy;

    @Override
    public BookUCResponse getBooks(BookUCRequest request) {
        var response = crudBookStrategy.getStrategy(request.getDatabaseType()).getAllBooks();
        return new BookUCResponse();
    }

    @Override
    public BookUCResponse getBook(BookUCRequest request) {
        CrudResponse response = crudBookStrategy.getStrategy(request.getDatabaseType())
                .getBook(CrudRequest.builder().id(request.getId()).build());
        return null;
    }


}