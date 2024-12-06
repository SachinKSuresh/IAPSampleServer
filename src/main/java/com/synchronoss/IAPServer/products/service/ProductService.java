package com.synchronoss.IAPServer.products.service;

import java.util.List;

import com.synchronoss.IAPServer.products.dtos.BatchProduct;
import com.synchronoss.IAPServer.products.dtos.ProductDto;
import com.synchronoss.IAPServer.products.models.Product;

public interface ProductService {

    public List<ProductDto> getEligibleProducts();

    Product createProduct(Product product);

    List<ProductDto> batchProductCreation(List<BatchProduct> products);
}
