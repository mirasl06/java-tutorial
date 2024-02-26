package market.inputs;

import market.models.Product;
import market.services.ProductService;
import market.services.impl.ProductServiceImpl;

public class ProductInputs {

    public static void main(String[] args) {
        ProductService productService = new ProductServiceImpl();
        Product product = productService.createProduct();
        product.printInfo();
    }
}
