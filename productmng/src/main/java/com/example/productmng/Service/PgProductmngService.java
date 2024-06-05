package com.example.productmng.Service;

import com.example.productmng.Dao.ProductmngDao;
import com.example.productmng.entity.ProductmngRecord;
import com.example.productmng.entity.insertRecord;
import com.example.productmng.entity.loginpassRecord;
import com.example.productmng.entity.updateRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PgProductmngService implements ProductmngService{

    @Autowired
    private ProductmngDao pgProductmngDao;

    @Override
    public List<ProductmngRecord> findAll() {
        return pgProductmngDao.findAll();
    }

    @Override
    public loginpassRecord findById(String loginId, String password){
        return pgProductmngDao.findById(loginId,password);
    }
    @Override
    public List<ProductmngRecord> findByName(String key){
        return pgProductmngDao.findByName(key);
    }

    @Override
    public int insert(insertRecord user) {
        return pgProductmngDao.insert(user);
    }

    @Override
    public updateRecord findByRecord(String productId){
        return pgProductmngDao.findByRecord(productId);
    }

    @Override
    public updateRecord updateid(int id) {
        return pgProductmngDao.updateid(id);
    }
    public int delete(String id) {
        return pgProductmngDao.delete(id);
    }
//    @Override
//    public  int update(int id,String productId,String productName,int productPrice,Integer categoryId,String description){
//        return  pgProductmngDao.update(id,productId,productName,productPrice,categoryId,description);
//    }

    public  int update(updateRecord record){
        return  pgProductmngDao.update(record);
    }
}

//id,productId,productName,productPrice,categoryId,description
