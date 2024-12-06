package com.synchronoss.IAPServer.products.models;

import com.synchronoss.IAPServer.common.models.IAPBaseModel;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "Product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String productId;
    private String kind;
    private String subscriptionFamilyName;
    private boolean isFamilyShareable;
    private String description;
    private String price;
    private String priceFormatted;
    private String recurringSubscriptionPeriod;
}