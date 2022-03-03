package spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import spring.model.Product;
import spring.repository.ProductRepository;

import java.util.List;

@Component
public class ProductService {
    ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    public List<Product> findAllProduct(){
        return productRepository.findAll();
    }

    public Product findProductByName(String name) {
        return productRepository.findByName(name);
    }
}
