package com.felix.felix.controllers;

import com.felix.felix.DTO.ErrorEntity;
import com.felix.felix.entities.Client;
import com.felix.felix.services.ClientService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import static org.springframework.http.HttpStatus.BAD_REQUEST;

@RestController
@RequestMapping(path = "/client")
public class ClientController {
    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping(path = "list")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public List<Client> getAllClient(){
        return this.clientService.getALlClient();
    }


    @PostMapping(path = "create")

    @ResponseStatus(HttpStatus.CREATED)
    public void creatClient(@RequestBody Client client){
        this.clientService.createClient(client);
    }

    @DeleteMapping(path = "{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deleteClientById(@PathVariable int id){
         this.clientService.deleteClientById(id);
    }


    @GetMapping(path = "{id}")
    public ResponseEntity<?> getClientById(@PathVariable int id){
       try {
           Client client = this.clientService.getClientById(id);
           // Si tout ce passe bien on renvoit le client avec un code 200
           return ResponseEntity.ok(client);
       }catch (EntityNotFoundException exception){
          return ResponseEntity.status(BAD_REQUEST).body(new ErrorEntity(null, exception.getMessage()));
       }
    }

    @PutMapping(path = "{id}")
    public void updateClient(@PathVariable int id , @RequestBody Client client){
        this.clientService.updateClient(id,client);
    }
}
