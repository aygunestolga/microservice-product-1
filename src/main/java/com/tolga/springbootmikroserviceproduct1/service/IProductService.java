package com.tolga.springbootmikroserviceproduct1.service;

import com.tolga.springbootmikroserviceproduct1.model.Product;

import java.util.List;

public interface IProductService
{

    Product saveProduct(Product product);

    void  deleteProduct(Long productId);

    List<Product> findAllProduct();
}
