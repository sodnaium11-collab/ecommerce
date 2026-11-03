package com.example.ecommerce;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepo
        extends MongoRepository<ProductEntity, String> {
}