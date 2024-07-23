package com.sye.ecommerce.dao;

import com.sye.ecommerce.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource(collectionResourceRel = "productCategory",path = "product-category")
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {
}
