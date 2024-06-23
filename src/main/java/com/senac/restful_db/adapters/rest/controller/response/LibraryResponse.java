package com.senac.restful_db.adapters.rest.controller.response;

import com.senac.restful_db.adapters.rest.domain.BookResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LibraryResponse {

    List<BookResponse> books = new ArrayList<>();

}