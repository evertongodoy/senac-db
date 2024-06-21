package com.senac.restful_db.usecase.ucbooks.port;

import com.senac.restful_db.usecase.ucbooks.BookUCRequest;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CrudRequest {

    private String id;
    private String title;
    private LocalDate publishedAt;
    private String isbn;
    private BigDecimal price;

    public CrudRequest fromUcRequest(BookUCRequest request){
        return CrudRequest.builder()
                .id(request.getId())
                .title(request.getTitle())
                .publishedAt(request.getPublishedAt())
                .isbn(request.getIsbn())
                .price(request.getPrice())
                .build();
    }

}