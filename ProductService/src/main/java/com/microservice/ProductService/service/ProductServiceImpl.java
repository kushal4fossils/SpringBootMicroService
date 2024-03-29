package com.microservice.ProductService.service;

import com.microservice.ProductService.Exception.ProductServiceCustomException;
import com.microservice.ProductService.entity.Product;
import com.microservice.ProductService.model.ProductRequest;
import com.microservice.ProductService.model.ProductResponse;
import com.microservice.ProductService.repository.ProductRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static org.springframework.beans.BeanUtils.copyProperties;

@Service
@Log4j2
public class ProductServiceImpl implements ProductService{
    @Autowired
    private ProductRepository productRepository;

    @Override
    public long addProduct(ProductRequest productRequest) {
        log.info("Adding Product..");

        Product product
                = Product.builder()
                .productName(productRequest.getName())
                .quantity(productRequest.getQuantity())
                .price(productRequest.getPrice()).build();

        productRepository.save(product);

        log.info("Product Created");
        return product.getProductId();
    }

    @Override
    public ProductResponse getProductById(long productId) {
        log.info("Get the product for productId:", productId);
        Product product=productRepository.findById(productId).orElseThrow(()->new ProductServiceCustomException("Product with given Id not found","PRODUCT NOT FOUND")) ;
        ProductResponse productResponse=new ProductResponse();
        copyProperties(product,productResponse);
        return productResponse;
    }
}
