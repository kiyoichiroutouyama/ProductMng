package com.example.productmng.Service;

import com.example.productmng.Dao.PgcategoryDao;
import com.example.productmng.Dao.ProductmngDao;
import com.example.productmng.entity.ProductmngRecord;
import com.example.productmng.entity.categoryRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PgcategoryService implements categoryService{
    @Autowired
    private PgcategoryDao pgcategoryDao;

    @Override
    public List<categoryRecord> findAll() {
        return pgcategoryDao.findAll();
    }
}
