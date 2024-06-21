package com.senac.restful_db.adapters.rest;

import com.senac.restful_db.usecase.ucbooks.BookUCRequest;
import com.senac.restful_db.usecase.ucbooks.BookUCResponse;
import com.senac.restful_db.usecase.ucbooks.IBookUC;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("library")
public class LibraryController {

    private final IBookUC bookUC;

    @GetMapping("/books/db/{database}")
    public ResponseEntity<BookUCResponse> getBooks(@PathVariable("database") String db){
        return ResponseEntity.ok(bookUC.retrieveAllBooks(new BookUCRequest(db)));
    }

    @GetMapping("/book/id/{id}/db/{database}")
    public ResponseEntity<BookUCResponse> getBook(@PathVariable("id") String id,
                                                  @PathVariable("database") String db){
        return ResponseEntity.ok(bookUC.getBook(new BookUCRequest(id, db)));
    }

    @PostMapping("/book/db/{database}")
    public ResponseEntity<BookUCResponse> saveBook(@PathVariable("database") String db,
                                                   @RequestBody LibrarySaveRequest saveRequest){
        var request = new BookUCRequest(saveRequest.getTitle(),
                saveRequest.getPublishedAt(),
                saveRequest.getIsbn(),
                saveRequest.getPrice(),
                db);
        return ResponseEntity.ok(bookUC.saveBook(request));
    }

    @PatchMapping("/book/id/{id}/db/{database}")
    public ResponseEntity<BookUCResponse> updateBook(@PathVariable("id") String id,
                                                     @PathVariable("database") String db,
                                                     @RequestBody LibraryUpdateRequest updateRequest){
        var request = new BookUCRequest(
                id,
                updateRequest.getTitle(),
                updateRequest.getPublishedAt(),
                updateRequest.getIsbn(),
                updateRequest.getPrice(),
                db);
        return ResponseEntity.ok(bookUC.editBook(request));
    }

    @DeleteMapping("/book/id/{id}/db/{database}")
    public ResponseEntity<?> deleteBook(@PathVariable("id") String id,
                                                     @PathVariable("database") String db){
        bookUC.deleteBook(new BookUCRequest(id, db));
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);

    }

}