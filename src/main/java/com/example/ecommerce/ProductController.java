package com.example.ecommerce;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private List<ProductEntity> products = new ArrayList<>();

    @GetMapping
    public List<ProductEntity> getAllProducts() {
        return products;
    }

    @GetMapping("/{id}")
    public ProductEntity getProductById(@PathVariable String id) {

        return products.stream()
                .filter(product -> product.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @PostMapping
    public ProductEntity addProduct(@RequestBody ProductEntity product) {

        products.add(product);

        return product;
    }
}
