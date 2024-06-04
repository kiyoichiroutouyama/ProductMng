package com.example.productmng.Dao;

import com.example.productmng.entity.ProductmngRecord;
import com.example.productmng.entity.insertRecord;
import com.example.productmng.entity.loginpassRecord;
import com.example.productmng.entity.updateRecord;

import java.util.List;

//public interface ProductmngDao {
//    List<ProductmngRecord> findAll();
//    ProductmngRecord findById(String loginId,String password);
//    int insert(ProductmngRecord user);
//    int update(ProductmngRecord num);
//    int delete(int id);
//}

public interface ProductmngDao {
        List<ProductmngRecord> findAll();
        loginpassRecord findById(String loginId, String password);
        List<ProductmngRecord> findByName(String key);
        int insert(insertRecord user);
        updateRecord findByRecord(String productId);
//    int update(ProductmngRecord num);
//    int delete(int id);
}
