package com.tolga.springbootmikroserviceproduct1.repository;

import com.tolga.springbootmikroserviceproduct1.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepository extends JpaRepository<Product,Long>
{

}
