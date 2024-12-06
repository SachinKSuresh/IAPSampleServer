package com.synchronoss.IAPServer.products.dtos;

import com.synchronoss.IAPServer.products.models.Discount;
import com.synchronoss.IAPServer.products.models.Product;
import lombok.Data;

import java.util.List;

@Data
public class BatchProduct {

    private Product product;
    private List<Discount> discountList ;
}
