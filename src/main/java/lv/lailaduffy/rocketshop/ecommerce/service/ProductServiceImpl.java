package lv.lailaduffy.rocketshop.ecommerce.service;

import lv.lailaduffy.rocketshop.ecommerce.repository.Product;
import lv.lailaduffy.rocketshop.ecommerce.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;

    @Override
    public Iterable<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProduct(long id) throws Exception {
        return productRepository
                .findById(id)
                .orElseThrow(() -> new Exception("Product not found"));
    }

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }

    public ProductRepository getProductRepository() {
        return productRepository;
    }

    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
}
