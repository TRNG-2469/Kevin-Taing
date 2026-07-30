package com.rev.jdbc.service;

import com.rev.jdbc.dao.ProductDAO;
import com.rev.jdbc.dao.ProductDAOImpl;
import com.rev.jdbc.model.Product;

import java.util.List;

public class ProductServiceImpl implements ProductService{
    @Override
    public void create(Product product) {
        ProductDAO productDAO = new ProductDAOImpl();
        if(findById(product.getId()) != null ) {
            throw new IllegalArgumentException("Product with id " + product.getId() + " already exists");
        }
        if(product.getName() == null || product.getName().isEmpty() || product.getPrice() <= 0) {
            throw new IllegalArgumentException("Product name cannot be null or empty and price must be greater than 0");
        }
        productDAO.create(product);
    }

    @Override
    public void update(Product product) {
        ProductDAO productDAO = new ProductDAOImpl();
        if(findById(product.getId()) == null ) {
            throw new IllegalArgumentException("Product with id " + product.getId() + " does not exist");
        }
        if(product.getName() == null || product.getName().isEmpty() || product.getPrice() <= 0) {
            throw new IllegalArgumentException("Product name cannot be null or empty and price must be greater than 0");
        }
        productDAO.update(product);
    }

    @Override
    public void delete(int id) {
        ProductDAO productDAO = new ProductDAOImpl();
        if(findById(id) == null ) {
            throw new IllegalArgumentException("Product with id " + id + " does not exist");
        }
        productDAO.delete(id);
    }

    @Override
    public Product findById(int id) {
        ProductDAO productDAO = new ProductDAOImpl();
        return productDAO.findById(id);
    }

    @Override
    public List<Product> findAll() {
        ProductDAO productDAO = new ProductDAOImpl();
        return productDAO.findAll();
    }
}
