package com.synchronoss.IAPServer.common.models.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.synchronoss.IAPServer.products.dtos.DiscountDto;
import com.synchronoss.IAPServer.products.dtos.ProductDto;
import com.synchronoss.IAPServer.products.helper.DiscountConverter;
import com.synchronoss.IAPServer.products.helper.ProductConverter;
import com.synchronoss.IAPServer.products.models.Discount;
import com.synchronoss.IAPServer.products.models.Product;
import com.synchronoss.IAPServer.products.service.DiscountService;
import com.synchronoss.IAPServer.products.service.ProductService;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductService productService;
    @Autowired
    private DiscountService discountService;
    @Autowired
    private ProductConverter productConverter;
    @Autowired
    private DiscountConverter discountConverter;
    

    @GetMapping
    public ResponseEntity<List<ProductDto>> getEligibleProducts(){
//        List<Product> products = productService.getEligibleProducts();
        
        return ResponseEntity.ok(productService.getEligibleProducts() );

    }
    

    @PostMapping
    public ResponseEntity<Product> createProduct(@RequestBody ProductDto productDto){
    	Product product = productConverter.convertToEntity(productDto);
    	
        return ResponseEntity.ok(productService.createProduct(product));

    }
    
    @PostMapping("/discount")
    public ResponseEntity<Discount> createDiscount(@RequestBody DiscountDto discountDto){
    	Discount discount  =discountConverter.convertToEntity(discountDto);
    	
    	return ResponseEntity.ok(discountService.createDiscount(discount));
    	
    }

}
