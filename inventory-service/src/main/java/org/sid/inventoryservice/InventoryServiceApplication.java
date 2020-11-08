package org.sid.inventoryservice;

import org.sid.inventoryservice.model.Product;
import org.sid.inventoryservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class InventoryServiceApplication {


    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }

    @Autowired
    ProductRepository productRepository;
    @Autowired
    RepositoryRestConfiguration restConfiguration;

    @PostConstruct
    private void init() {
        restConfiguration.exposeIdsFor(Product.class);
        productRepository.save(new Product(null, "bahia", 120.00));
        productRepository.save(new Product(null, "bahia", 120.00));
        productRepository.save(new Product(null, "bahia", 120.00));

    }
}
