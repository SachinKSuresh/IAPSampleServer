package com.synchronoss.IAPServer.products.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.synchronoss.IAPServer.products.models.Discount;
import com.synchronoss.IAPServer.products.models.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
	
	@Query("SELECT p FROM Product p WHERE p.id = :id")
    Product findByIdWithDiscounts(Long id);

    @Query("SELECT d FROM Discount d WHERE d.productId = :productId")
    List<Discount> findDiscountsByProductId(Long productId);
}
