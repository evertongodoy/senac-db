package com.senac.restful_db.usecase.ucbooks;

import com.senac.restful_db.usecase.ucbooks.port.IBookStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookUCImpl implements IBookUC {

    private final CrudBookStrategyFactory crudBookStrategy;
    private final IBookStrategy crudBookStrategy2;

    @Override
    public BookUCResponse getBooks(BookUCRequest request) {
        var response = crudBookStrategy.getStrategy(request.getDatabaseType()).getAllBooks();
        return new BookUCResponse();
    }
}