package com.rev.jdbc;

import com.rev.jdbc.dao.ProductDAO;
import com.rev.jdbc.dao.ProductDAOImpl;
import com.rev.jdbc.model.Product;
import com.rev.jdbc.service.ProductService;
import com.rev.jdbc.service.ProductServiceImpl;

public class MainClass {
    public static void main(String[] args) {
//        ProductDAO productDAO = new ProductDAOImpl();
//        Product product = new Product(5, "WiFI", 250);
//        productDAO.update(product);
        Product product = new Product(5, "", -111);
        ProductService service = new ProductServiceImpl();
        service.update(product);
    }
}
