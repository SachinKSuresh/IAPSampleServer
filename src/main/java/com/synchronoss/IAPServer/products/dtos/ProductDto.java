package com.synchronoss.IAPServer.products.dtos;

import java.util.List;

import lombok.Data;

@Data
public class ProductDto {

	private String name;
    private String productId;
    private String kind;
    private String subscriptionFamilyName;
    private boolean isFamilyShareable;
    private String description;
    private String price;
    private String priceFormatted;
    private String recurringSubscriptionPeriod;
    private List<DiscountDto> discounts;
    
}
