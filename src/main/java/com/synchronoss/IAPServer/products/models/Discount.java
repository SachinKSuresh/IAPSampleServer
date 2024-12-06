package com.synchronoss.IAPServer.products.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
@Data
@Table(name = "Discount")
public class Discount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String modeType;
    private int numOfPeriods;
    private String price;
    private String priceFormatted;
    private String recurringSubscriptionPeriod;
    private String type;

    @Column(name = "product_id")
    private Long productId; // Only store the product ID instead of a reference
}
