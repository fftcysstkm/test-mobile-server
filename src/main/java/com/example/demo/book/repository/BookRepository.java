package com.example.demo.book.repository;

import org.springframework.jdbc.core.DataClassRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.book.domain.Book;

@Repository
public class BookRepository {

    private final JdbcTemplate jdbcTemplate;

    public BookRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public Book getBookById(int id) {
        String sql = """
                        SELECT
                             id,
                             name,
                             author
                        FROM
                            books
                        WHERE
                            id = ?
                """;
        return jdbcTemplate.queryForObject(
                sql,
                new DataClassRowMapper<>(Book.class),
                id);
    }
}
