package com.example.productmng.Dao;

import com.example.productmng.entity.ProductmngRecord;
import com.example.productmng.entity.categoryRecord;

import java.util.List;

public interface categoryDao {
    List<categoryRecord> findAll();
}
