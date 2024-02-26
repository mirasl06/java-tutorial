package market.inputs;


import market.models.Category;
import market.services.CategoryService;
import market.services.impl.CategoryServiceImpl;

public class CategoryInputs {

    public static void main(String[] args) {
        CategoryService categoryService = new CategoryServiceImpl();
        Category category = categoryService.createCategory();
        category.printInfo();
    }
}
