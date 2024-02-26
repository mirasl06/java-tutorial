package market.services.impl;

import market.models.User;
import market.services.UserService;

import java.util.Scanner;

public class UserServiceImpl implements UserService {
    @Override
    public User createUser() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to user registration form\n");

        System.out.println("Please enter user name: ");
        String name = scanner.nextLine();

        System.out.println("Please enter login: ");
        String login = scanner.nextLine();

        System.out.println("Please enter password: ");
        String password = scanner.nextLine();

        System.out.println("Please enter position: ");
        String position = scanner.nextLine();

        System.out.println("Please enter phone number: ");
        String phoneNumber = scanner.nextLine();

        return new User(123, name, login, password, position, phoneNumber);
    }

    @Override
    public void deleteUser() {
        System.out.println("Deleted user");
    }

    @Override
    public void updateUser() {
        System.out.println("Updated user");
    }
}
