package market.services;

import market.models.Product;

public interface ProductService {
    Product createProduct();
    void deleteProduct();
    void updateProduct();
}
