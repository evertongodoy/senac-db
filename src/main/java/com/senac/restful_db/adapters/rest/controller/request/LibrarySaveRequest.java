package com.senac.restful_db.adapters.rest.controller.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
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
public class LibrarySaveRequest {

    @NotBlank(message = "Title is mandatory")
    @Size(min = 2, max = 30, message = "Title must be between 1 and 100 characters")
    private String title;
//    @NotBlank(message = "Published At is mandatory")
    @JsonProperty("published_at")
    private LocalDate publishedAt;
//    @NotBlank(message = "ISBN is mandatory")
//    @Size(min = 1, max = 20, message = "ISBN must be between 1 and 20 characters")
    private String isbn;
//    @NotBlank(message = "Price is mandatory")
    private BigDecimal price;

}
