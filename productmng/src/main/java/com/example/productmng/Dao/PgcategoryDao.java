package com.example.productmng.Dao;

import com.example.productmng.entity.ProductmngRecord;
import com.example.productmng.entity.categoryRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.DataClassRowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository

public class PgcategoryDao implements  categoryDao {
    @Autowired
    public NamedParameterJdbcTemplate jdbcTemplate;

    @Override
    public List<categoryRecord> findAll() {
        return jdbcTemplate.query("SELECT id,name FROM categories ORDER BY id",
                new DataClassRowMapper<>(categoryRecord.class));

    }
}
