package com.synchronoss.IAPServer.products.helper;

import org.springframework.stereotype.Component;

import com.synchronoss.IAPServer.products.dtos.ProductDto;
import com.synchronoss.IAPServer.products.models.Product;

@Component
public class ProductConverter {

    public Product convertToEntity(ProductDto productDto) {
        Product product = new Product();
        product.setName(productDto.getName());
        product.setProductId(productDto.getProductId());
        product.setKind(productDto.getKind());
        product.setSubscriptionFamilyName(productDto.getSubscriptionFamilyName());
        product.setFamilyShareable(productDto.isFamilyShareable());
        product.setDescription(productDto.getDescription());
        product.setPrice(productDto.getPrice());
        product.setPriceFormatted(productDto.getPriceFormatted());
        product.setRecurringSubscriptionPeriod(productDto.getRecurringSubscriptionPeriod());
        return product;
    }

    public ProductDto convertToDto(Product product) {
        ProductDto productDto = new ProductDto();
        productDto.setName(product.getName());
        productDto.setProductId(product.getProductId());
        productDto.setKind(product.getKind());
        productDto.setSubscriptionFamilyName(product.getSubscriptionFamilyName());
        productDto.setFamilyShareable(product.isFamilyShareable());
        productDto.setDescription(product.getDescription());
        productDto.setPrice(product.getPrice());
        productDto.setPriceFormatted(product.getPriceFormatted());
        productDto.setRecurringSubscriptionPeriod(product.getRecurringSubscriptionPeriod());
        return productDto;
    }
}
