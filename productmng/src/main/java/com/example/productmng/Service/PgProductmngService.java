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


//    public int update(ProductmngRecord num) {
//        return pgProductmngDao.update(num);
//    }
//    public int delete(int id) {
//        return pgProductmngDao.delete(id);
//    }
}
