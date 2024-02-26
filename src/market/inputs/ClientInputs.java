package market.inputs;

import market.models.Client;
import market.services.ClientService;
import market.services.impl.ClientServiceImpl;

public class ClientInputs {

    public static void main(String[] args) {
        ClientService clientService = new ClientServiceImpl();
        Client client = clientService.createClient();
        client.printInfo();
    }
}
