package com.synchronoss.IAPServer.products.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.synchronoss.IAPServer.products.models.Discount;

public interface DiscountRepository extends JpaRepository<Discount,Long> {
	
	@Query("SELECT d FROM Discount d WHERE d.productId = :productId")
    List<Discount> findDiscountsByProductId(@Param("productId") Long productId);
}
