package com.synchronoss.IAPServer.products.dtos;

import lombok.Data;

@Data
public class DiscountDto {
	 private String modeType;
	    private int numOfPeriods;
	    private String price;
	    private String priceFormatted;
	    private String recurringSubscriptionPeriod;
	    private String type;
	    private Long productId;
}
