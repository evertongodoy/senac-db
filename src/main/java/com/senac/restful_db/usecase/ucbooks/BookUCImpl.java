package com.senac.restful_db.usecase.ucbooks;

import com.senac.restful_db.entities.BookEntity;
import com.senac.restful_db.usecase.ucbooks.models.Book;
import com.senac.restful_db.usecase.ucbooks.port.CrudRequest;
import com.senac.restful_db.usecase.ucbooks.port.CrudResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class BookUCImpl implements IBookUC {

    private final CrudBookStrategyFactory strategyFactory;

    @Override
    public BookUCResponse retrieveAllBooks(BookUCRequest request) {
        var response = strategyFactory.getStrategy(request.getDatabaseType()).getAllBooks();
        this.validateResponse(response);
        return BookUCResponse.builder().books(this.prepareReturn(response)).build();
    }

    @Override
    public BookUCResponse getBook(BookUCRequest request) {
        var response = strategyFactory.getStrategy(request.getDatabaseType())
                .getBook(CrudRequest.builder().id(request.getId()).build());
        this.validateResponse(response);
        return BookUCResponse.builder().books(this.prepareReturn(response)).build();
    }

    @Override
    public BookUCResponse saveBook(BookUCRequest requestUc) {
        var response = strategyFactory.getStrategy(requestUc.getDatabaseType())
                .saveBook(new CrudRequest().fromUcRequest(requestUc));
        this.validateResponse(response);
        return BookUCResponse.builder().books(this.prepareReturn(response)).build();
    }

    @Override
    public BookUCResponse editBook(BookUCRequest request) {
        var crudRequest = new CrudRequest().fromUcRequest(request);
        var response = strategyFactory.getStrategy(request.getDatabaseType()).editBook(crudRequest);
        return BookUCResponse.builder().books(this.prepareReturn(response)).build();
    }

    private void validateResponse(CrudResponse response){
        if(response.getBooks().isEmpty()){
            throw new RuntimeException("Book not found");
        }
    }

    private List<Book> prepareReturn(CrudResponse response){
        var entities = response.getBooks().stream()
                .map(b -> new BookEntity()
                        .toBookEntity(
                                b.getId(),
                                b.getTitle(),
                                b.getPublishedAt(),
                                b.getIsbn(),
                                b.getPrice())
                ).toList();
        return new BookUCResponse().fromBookEntities(entities);
    }



}