package com.senac.restful_db.usecase.ucbooks;

import com.senac.restful_db.usecase.ucbooks.models.DatabaseType;
import com.senac.restful_db.usecase.ucbooks.port.IBookStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class CrudBookStrategyFactory {

    private final List<IBookStrategy> strategies;

    public IBookStrategy getStrategy(DatabaseType dbType){
        return strategies.stream()
                .filter(strategy -> strategy.selector(dbType))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Database Type Does Not Exists"));
    }

}