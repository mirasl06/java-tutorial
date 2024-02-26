package market.models;

import market.services.BaseService;

public class Category extends BaseService {
    private int id;
    private String name;

    public Category(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void printInfo() {
        System.out.printf("******************\n" +
                "ID: %s\n" +
                "NAME: %s\n" +
                "******************\n", id, name);
    }
}
