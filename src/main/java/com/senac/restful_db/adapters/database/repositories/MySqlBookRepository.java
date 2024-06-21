package com.senac.restful_db.adapters.database.repositories;

import com.senac.restful_db.adapters.database.domain.BookMySQL;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MySqlBookRepository extends JpaRepository<BookMySQL, Long> {
}
