package tn.esprit.autoloc.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.autoloc.domain.Equipement;
import tn.esprit.autoloc.repository.EquipementRepository;

@RestController
@RequestMapping("/api/equipements")
public class EquipementController extends CrudController<Equipement> {
    public EquipementController(EquipementRepository repository) {
        super(repository);
    }

    @Override
    protected void setId(Equipement equipement, Long id) {
        equipement.setIdEquipement(id);
    }
}
