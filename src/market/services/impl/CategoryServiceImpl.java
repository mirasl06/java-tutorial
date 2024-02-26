package market.services.impl;

import market.models.Category;
import market.services.CategoryService;

import java.util.Scanner;

public class CategoryServiceImpl implements CategoryService {

    @Override
    public Category createCategory() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to category registration form\n");

        System.out.println("Please enter category name: ");
        String name = scanner.nextLine();

        return new Category(12, name);
    }

    @Override
    public void deleteCategory() {
        System.out.println("delete category");
    }
}
