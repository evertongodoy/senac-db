package com.senac.restful_db.adapters.rest;

import com.senac.restful_db.usecase.ucbooks.BookUCRequest;
import com.senac.restful_db.usecase.ucbooks.IBookUC;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("library")
public class LibraryController {

    private final IBookUC bookUC;

    @GetMapping("/books/{database}")
    public ResponseEntity<String> getBooks(@PathVariable("database") String db){
        var response = bookUC.getBooks(new BookUCRequest(db));
        System.out.println(response);
        return ResponseEntity.ok("only test");
    }

}