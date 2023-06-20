package com.microservice.ProductService.service;

import com.microservice.ProductService.model.ProductRequest;
import org.springframework.stereotype.Service;

public interface ProductService {
    long addProduct(ProductRequest productRequest);
}
