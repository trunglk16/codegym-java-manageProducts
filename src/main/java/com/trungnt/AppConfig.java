package com.trungnt;

import com.trungnt.repository.ProductRepository;
import com.trungnt.repository.ProductRepositoryImpl;
import com.trungnt.service.ProductService;
import com.trungnt.service.ProductServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.trungnt"})
public class AppConfig {
  @Bean(name = "productService")
  public ProductService getProductService() {
    return new ProductServiceImpl();
  }

  @Bean(name = "productRepository")
  public ProductRepository getProductRepository() {
    return new ProductRepositoryImpl();
  }
}
