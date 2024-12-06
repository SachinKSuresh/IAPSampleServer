package com.synchronoss.IAPServer.products.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.synchronoss.IAPServer.products.helper.DiscountConverter;
import com.synchronoss.IAPServer.products.models.Discount;
import com.synchronoss.IAPServer.products.repository.DiscountRepository;

@Service
public class DiscountService {

    private final DiscountRepository discountRepository;
    private final DiscountConverter discountConverter;

    @Autowired
    public DiscountService(DiscountRepository discountRepository, DiscountConverter discountConverter) {
        this.discountRepository = discountRepository;
        this.discountConverter = discountConverter;
    }

    public Discount createDiscount(Discount discount) {
//        Discount discount = discountConverter.convertToEntity(discountDto);
        return discountRepository.save(discount);
    }
}