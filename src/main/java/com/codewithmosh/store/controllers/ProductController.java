package com.codewithmosh.store.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.codewithmosh.store.dtos.ProductDto;
import com.codewithmosh.store.mappers.ProductMapper;
import com.codewithmosh.store.repositories.ProductRepository;

import lombok.AllArgsConstructor;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@AllArgsConstructor
@RestController
@RequestMapping("/products")
public class ProductController {
    private ProductRepository productRepository;
    private ProductMapper productMapper;

    @GetMapping
    public List<ProductDto> getAllProducts(
        @RequestParam(required = false) Byte categoryId
    ) {
        if (categoryId != null){
            return productRepository.findByCategoryId(categoryId)
                    .stream()
                    .map(productMapper::toDto)
                    .toList();
        }
        return productRepository.findAllWithCategory()
                .stream()
                .map(productMapper::toDto)
                .toList();
    }

    @GetMapping("/{id}")
    public ProductDto getProductById(
        @PathVariable Long id
    ) {
        return productRepository.findById(id)
                .map(productMapper::toDto)
                .orElseThrow(
                    () -> new ResponseStatusException(
                        HttpStatus.NOT_FOUND, 
                        "Product with id " + id + " not found."
                    )
                );
    }
    

}
