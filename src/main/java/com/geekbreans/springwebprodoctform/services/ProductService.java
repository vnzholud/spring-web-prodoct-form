package com.geekbreans.springwebprodoctform.services;

import com.geekbreans.springwebprodoctform.data.Product;
import com.geekbreans.springwebprodoctform.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {


        private ProductRepository productRepository;

        public ProductService(ProductRepository productRepository) {
            this.productRepository = productRepository;
        }

        public List<Product> getAllProducts() {
            return productRepository.getAllProducts();
        }

        public void deleteById(Long id) {
            productRepository.deleteById(id);
        }


    public void changAmount(Long productId, Integer delta) {
        Product product = productRepository.findById(productId);
        product.setAmount(product.getAmount() + delta);
    }
}

