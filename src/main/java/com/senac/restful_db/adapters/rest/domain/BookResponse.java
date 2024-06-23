package com.senac.restful_db.adapters.rest.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.senac.restful_db.usecase.ucbooks.BookUCResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BookResponse {

    private String id;
    private String title;
    @JsonProperty("published_at")
    private LocalDate published_at;
    private String isbn;
    private BigDecimal price;

}