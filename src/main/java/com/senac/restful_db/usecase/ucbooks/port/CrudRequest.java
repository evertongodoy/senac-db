package com.senac.restful_db.usecase.ucbooks.port;

import com.senac.restful_db.usecase.ucbooks.models.DatabaseType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CrudRequest {

    private DatabaseType databaseType;

}