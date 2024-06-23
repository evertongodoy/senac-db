package com.senac.restful_db.adapters.rest.controller.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LibraryUpdateRequest {

    private String title;
    @JsonProperty("published_at")
    private LocalDate publishedAt;
    private String isbn;
    private BigDecimal price;

}
