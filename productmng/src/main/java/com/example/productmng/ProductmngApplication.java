package com.example.productmng;

import com.example.productmng.Service.PgProductmngService;
import com.example.productmng.Service.ProductmngService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;

@SpringBootApplication
public class ProductmngApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductmngApplication.class, args);
	}
}
