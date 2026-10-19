package tn.esprit.autoloc.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.autoloc.domain.Client;
import tn.esprit.autoloc.repository.ClientRepository;

@RestController
@RequestMapping("/api/clients")
public class ClientController extends CrudController<Client> {
    public ClientController(ClientRepository repository) {
        super(repository);
    }

    @Override
    protected void setId(Client client, Long id) {
        client.setIdClient(id);
    }
}
