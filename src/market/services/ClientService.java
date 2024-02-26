package market.services;

import market.models.Client;

public interface ClientService {
    Client createClient();
    void deleteClient();
    void updateClient();
}
