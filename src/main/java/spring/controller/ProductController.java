package spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import spring.model.Product;
import spring.service.ProductService;

import java.util.List;

@RestController
public class ProductController {
    ProductService productService;

    @Autowired
    public ProductController(ProductService productService){
        this.productService = productService;
    }

    @GetMapping
    public List<Product> findAll(){
        return productService.findAllProduct();
    }

    @GetMapping({"{name}"})
    public Product findByName(@PathVariable String name){
        return (Product) productService.findProductByName(name);
    }

//    @GetMapping
//    public List<Product> getAllProduct(){
//        return productService.saveProduct(product);
//    }




}
