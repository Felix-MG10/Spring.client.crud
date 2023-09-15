package com.felix.felix.services;

import com.felix.felix.entities.Client;
import com.felix.felix.repositories.ClientRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class ClientService {

    private final ClientRepository clientRepository;

    public List<Client> getALlClient(){
        return this.clientRepository.findAll();
    }

    public void createClient(Client client){
       this.clientRepository.save(client);
    }

    public void deleteClientById(int id){
         this.clientRepository.deleteById(id);
    }

    public Client getClientById(int id) {
        Optional<Client> optionalClient = this.clientRepository.findById(id);
        return optionalClient.orElse(null);
    }

    public void updateClient(int id, Client client) {

        Optional<Client> clientBD = this.clientRepository.findById(id);
        try {
            if(clientBD.isPresent()){
                Client existingClient = clientBD.get();
                existingClient.setName(client.getName());
                existingClient.setAdresse(client.getAdresse());
                existingClient.setTelephone(client.getTelephone());
                existingClient.setMode_payement(client.getMode_payement());

                clientRepository.save(existingClient);
            }
        }catch (Exception e){
            throw new RuntimeException();
        }
    }

}
