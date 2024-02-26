package market.inputs;

import market.models.User;
import market.services.UserService;
import market.services.impl.UserServiceImpl;

public class UserInputs {

    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        User user = userService.createUser();
        user.printInfo();
    }
}
