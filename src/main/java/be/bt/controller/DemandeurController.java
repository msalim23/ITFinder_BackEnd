package be.bt.controller;

import be.bt.domain.Demandeur;
import be.bt.repository.IDemandeurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins="*")
public class DemandeurController {

    @Autowired
    IDemandeurRepository demandeurRepository;

    @GetMapping(value= {"/demandeurs"})
    public List<Demandeur> getAll() {
        return demandeurRepository.findAll();
    }

    @GetMapping(value= {"/demandeur/{id}"})
    public ResponseEntity<Demandeur> getById(@PathVariable String id) {

        Optional<Demandeur> result = demandeurRepository.findById(id);

        return (result.isPresent())?
                new ResponseEntity<>(result.get(), HttpStatus.OK)
                :
                new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping(value = "/demandeur/add")
    public void addDemandeur( @RequestBody Demandeur p) {
        demandeurRepository.save(p);
    }

    @DeleteMapping(value = "/demandeur/delete/{id}")
    public void deleteDemandeur (@PathVariable String id){
        List<Demandeur> dem = getAll();
        Demandeur aSupprimer=null;
        for(Demandeur d : dem){
            if(d.getId().equals(id)){
                aSupprimer=d;
            }
        }

        demandeurRepository.delete(aSupprimer);
    }


}
