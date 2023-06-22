package com.microservice.ProductService.service;

import com.microservice.ProductService.model.ProductRequest;
import com.microservice.ProductService.model.ProductResponse;
import org.springframework.stereotype.Service;

public interface ProductService {
    long addProduct(ProductRequest productRequest);

    ProductResponse getProductById(long productId);
}
