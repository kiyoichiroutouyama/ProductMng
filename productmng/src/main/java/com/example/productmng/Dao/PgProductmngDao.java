package com.example.productmng.Dao;

import com.example.productmng.entity.ProductmngRecord;
import com.example.productmng.entity.insertRecord;
import com.example.productmng.entity.loginpassRecord;
import com.example.productmng.entity.updateRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.DataClassRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PgProductmngDao implements ProductmngDao {
    @Autowired
    public NamedParameterJdbcTemplate jdbcTemplate;

    @Override
    public List<ProductmngRecord> findAll() {
        return jdbcTemplate.query("SELECT * FROM products ORDER BY product_id",
                new DataClassRowMapper<>(ProductmngRecord.class));
    }

    @Override
    public loginpassRecord findById(String loginId, String password) {
        var param = new MapSqlParameterSource();
        param.addValue("login_id", loginId);
        param.addValue("password",password);
        var list = jdbcTemplate.query("SELECT * FROM users WHERE login_id = :login_id AND password =:password", param, new DataClassRowMapper<>(loginpassRecord.class));
        return list.isEmpty() ? null : list.get(0);
    }

        @Override
        public List<ProductmngRecord> findByName(String key){
            var param = new MapSqlParameterSource();
            param.addValue("key", "%"+key+"%");
            return jdbcTemplate.query("SELECT products.id ,products.product_id,products.category_id, products.name,products.price,products.description,categories.name FROM products INNER JOIN categories ON products.category_id = categories.id WHERE products.name like :key", param,
            new DataClassRowMapper<>(ProductmngRecord.class));
        }

    @Override
    public int insert(insertRecord user) {
        var param = new MapSqlParameterSource();
        param.addValue("productId", user.productId());
        param.addValue("name", user.name());
        param.addValue("price", user.price());
        param.addValue("categoryId", user.categoryId());
        param.addValue("description", user.description());
        return jdbcTemplate.update("INSERT INTO products(product_id,name,price,category_id,description) VALUES(:productId,:name, :price,:categoryId, :description)", param);
    }
    @Override
    public updateRecord findByRecord(String productId) {
        var param = new MapSqlParameterSource();
        param.addValue("productId", productId);
        var list = jdbcTemplate.query("SELECT * FROM products WHERE product_id=:productId", param, new DataClassRowMapper<>(updateRecord.class));
        return list.isEmpty() ? null : list.get(0);
    }

}
//
//    @Override
//    public int update(ProductmngRecord updates) {
//        var param = new MapSqlParameterSource();
//        param.addValue("name", updates.name());
//        param.addValue("category_id", updates.categories());
//        param.addValue("price", updates.price());
//        param.addValue("id", updates.id());
//        param.addValue("description", updates.desc());
//        return jdbcTemplate.update("UPDATE products SET  name= :name,category_id = :category_id,price= :price ,description= :description WHERE id = :id", param);
//    }
//
//    @Override
//    public int delete(int id) {
//        var param = new MapSqlParameterSource();
//        param.addValue("id", id);
//        return jdbcTemplate.update("DELETE FROM products WHERE id = :id", param);
//    }

