package lv.lailaduffy.rocketshop.ecommerce.controller;

import com.sun.istack.NotNull;
import lv.lailaduffy.rocketshop.ecommerce.repository.Product;
import lv.lailaduffy.rocketshop.ecommerce.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    ProductServiceImpl productService;

    @GetMapping(value = { "", "/" })
    public @NotNull
    Iterable<Product> getProducts() {
        return productService.getAllProducts();
    }
}