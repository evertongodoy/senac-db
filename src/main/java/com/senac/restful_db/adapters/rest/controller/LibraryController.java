package com.senac.restful_db.adapters.rest.controller;

import com.senac.restful_db.adapters.rest.controller.request.LibrarySaveRequest;
import com.senac.restful_db.adapters.rest.controller.request.LibraryUpdateRequest;
import com.senac.restful_db.adapters.rest.controller.response.LibraryResponse;
import com.senac.restful_db.adapters.rest.domain.BookResponse;
import com.senac.restful_db.usecase.ucbooks.BookUCRequest;
import com.senac.restful_db.usecase.ucbooks.BookUCResponse;
import com.senac.restful_db.usecase.ucbooks.IBookUC;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("library")
public class LibraryController {

    private final IBookUC bookUC;

    @GetMapping("/books/db/{database}")
    public ResponseEntity<LibraryResponse> getBooks(@PathVariable("database") String db){
        return ResponseEntity.ok(LibraryResponse.builder()
                .books(this.buildListResponse(bookUC.retrieveAllBooks(new BookUCRequest(db)))).build());
    }

    @GetMapping("/book/id/{id}/db/{database}")
    public ResponseEntity<LibraryResponse> getBook(@PathVariable("id") String id,
                                                   @PathVariable("database") String db){
        return ResponseEntity.ok(LibraryResponse.builder()
                .books(this.buildListResponse(bookUC.getBook(new BookUCRequest(id, db)))).build());
    }

    @PostMapping("/book/db/{database}")
    public ResponseEntity<LibraryResponse> saveBook(@PathVariable("database") String db,
                                                    @RequestBody LibrarySaveRequest saveRequest){
        var request = new BookUCRequest(saveRequest.getTitle(),
                saveRequest.getPublishedAt(),
                saveRequest.getIsbn(),
                saveRequest.getPrice(),
                db);
        return ResponseEntity.ok(LibraryResponse.builder()
                .books(this.buildListResponse(bookUC.saveBook(request))).build());
    }

    @PatchMapping("/book/id/{id}/db/{database}")
    public ResponseEntity<LibraryResponse> updateBook(@PathVariable("id") String id,
                                                      @PathVariable("database") String db,
                                                      @RequestBody LibraryUpdateRequest updateRequest){
        var request = new BookUCRequest(
                id,
                updateRequest.getTitle(),
                updateRequest.getPublishedAt(),
                updateRequest.getIsbn(),
                updateRequest.getPrice(),
                db);
        return ResponseEntity.ok(LibraryResponse.builder()
                .books(this.buildListResponse(bookUC.editBook(request))).build());
    }

    @DeleteMapping("/book/id/{id}/db/{database}")
    public ResponseEntity<?> deleteBook(@PathVariable("id") String id,
                                        @PathVariable("database") String db){
        bookUC.deleteBook(new BookUCRequest(id, db));
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);

    }

    private List<BookResponse> buildListResponse(BookUCResponse bookUCResponse){
        return bookUCResponse.getBooks().stream()
                .map(book -> BookResponse.builder()
                        .id(book.getId())
                        .title(book.getTitle())
                        .published_at(book.getPublishedAt())
                        .isbn(book.getIsbn())
                        .price(book.getPrice())
                        .build()
                ).toList();
    }

}