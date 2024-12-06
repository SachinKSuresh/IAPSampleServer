package com.synchronoss.IAPServer.products.helper;

import org.springframework.stereotype.Component;

import com.synchronoss.IAPServer.products.dtos.DiscountDto;
import com.synchronoss.IAPServer.products.models.Discount;

@Component
public class DiscountConverter {

    public Discount convertToEntity(DiscountDto discountDto) {
        Discount discount = new Discount();
        discount.setModeType(discountDto.getModeType());
        discount.setNumOfPeriods(discountDto.getNumOfPeriods());
        discount.setPrice(discountDto.getPrice());
        discount.setPriceFormatted(discountDto.getPriceFormatted());
        discount.setRecurringSubscriptionPeriod(discountDto.getRecurringSubscriptionPeriod());
        discount.setType(discountDto.getType());
        discount.setProductId(discountDto.getProductId());
        return discount;
    }

    public DiscountDto convertToDto(Discount discount) {
        DiscountDto discountDto = new DiscountDto();
        discountDto.setModeType(discount.getModeType());
        discountDto.setNumOfPeriods(discount.getNumOfPeriods());
        discountDto.setPrice(discount.getPrice());
        discountDto.setPriceFormatted(discount.getPriceFormatted());
        discountDto.setRecurringSubscriptionPeriod(discount.getRecurringSubscriptionPeriod());
        discountDto.setType(discount.getType());
        discountDto.setProductId(discount.getProductId());
        return discountDto;
    }
}
