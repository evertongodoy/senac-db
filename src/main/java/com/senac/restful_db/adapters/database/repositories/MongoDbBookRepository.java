package com.senac.restful_db.adapters.database.repositories;

import com.senac.restful_db.adapters.database.domain.BookMongo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MongoDbBookRepository extends MongoRepository<BookMongo, String> {
}
