package com.appian.microservices.shoppingcart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Shopping cart application.
 *
 * @author touré
 */
@SpringBootApplication
@RestController
public class ShoppingCartApplication {

  @RequestMapping(value = "/items")
  public String list() {
    return "items in the shopping cart";
  }

  public static void main(String[] args) {
    SpringApplication.run(ShoppingCartApplication.class, args);
  }
}
