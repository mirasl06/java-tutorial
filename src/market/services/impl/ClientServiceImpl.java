package market.services.impl;

import market.models.Client;
import market.services.ClientService;

import java.util.Scanner;

public class ClientServiceImpl implements ClientService {
    @Override
    public Client createClient() {
        /**
         * Dasturga ma'lumotlar kirish uchun foydalaniladi
         * Yozganlarimizni dasturga olib beradi (skaner qilib beradi)
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to client registration form\n");

        System.out.println("Please enter client name: ");
        String clientName = scanner.nextLine();

        System.out.println("Please enter client phone number: ");
        String phoneNumber = scanner.nextLine();

        return new Client(10, clientName, phoneNumber);
    }

    @Override
    public void deleteClient() {
        System.out.println("delete client");
    }

    @Override
    public void updateClient() {
        System.out.println("update client");
    }
}
