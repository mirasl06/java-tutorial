package market.services.impl;

import market.models.Category;
import market.models.Product;
import market.services.CategoryService;
import market.services.ProductService;

import java.util.Scanner;

public class ProductServiceImpl implements ProductService {
    @Override
    public Product createProduct() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to market");

        System.out.println("Please enter name: ");
        String name = scanner.nextLine();

        System.out.println("Please enter price: ");
        long price = scanner.nextLong();

        System.out.println("Please enter salePrice: ");
        long salePrice = scanner.nextLong();

        System.out.println("Please enter createDate: ");
        String createDate = scanner.next();

        System.out.println("Please enter expiryDate: ");
        String expiryDate = scanner.next();

        System.out.println("Please enter category: ");

        CategoryService categoryService = new CategoryServiceImpl();
        Category category = categoryService.createCategory();

        return new Product(321, name, price, salePrice, createDate, expiryDate, category);
    }

    @Override
    public void deleteProduct() {
        System.out.println("delete product");
    }

    @Override
    public void updateProduct() {
        System.out.println("update product");
    }
}
