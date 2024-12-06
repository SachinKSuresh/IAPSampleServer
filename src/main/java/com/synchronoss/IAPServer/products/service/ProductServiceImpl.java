package com.synchronoss.IAPServer.products.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.synchronoss.IAPServer.products.dtos.DiscountDto;
import com.synchronoss.IAPServer.products.dtos.ProductDto;
import com.synchronoss.IAPServer.products.helper.DiscountConverter;
import com.synchronoss.IAPServer.products.helper.ProductConverter;
import com.synchronoss.IAPServer.products.models.Discount;
import com.synchronoss.IAPServer.products.models.Product;
import com.synchronoss.IAPServer.products.repository.DiscountRepository;
import com.synchronoss.IAPServer.products.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	private final ProductRepository productRepository;

	private final DiscountRepository discountRepository;
	private final ProductConverter productConverter;
	private final DiscountConverter discountConverter;

	@Autowired
	public ProductServiceImpl(ProductRepository productRepository, DiscountRepository discountRepository,
			ProductConverter productConverter, DiscountConverter discountConverter) {
		this.productRepository = productRepository;
		this.discountRepository = discountRepository;
		this.productConverter = productConverter;
		this.discountConverter = discountConverter;
	}

	@Override
	public Product createProduct(Product product) {
//        Product product = productConverter.convertToEntity(productDto);
		return productRepository.save(product);
	}

	@Override
	public List<ProductDto> getEligibleProducts() {
		List<Product> products = productRepository.findAll();
		List<ProductDto> productsDtos = new ArrayList<>();
		for (Product product : products) {
			List<Discount> discounts = discountRepository.findDiscountsByProductId(product.getId());
			List<DiscountDto> discountDtos = discounts.stream().map(discountConverter::convertToDto)
					.collect(Collectors.toList());

			ProductDto productDto = productConverter.convertToDto(product);
			productDto.setDiscounts(discountDtos);
			productsDtos.add(productDto);
		}

		return productsDtos;
	}

}
