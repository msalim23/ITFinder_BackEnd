package be.bt.controller;

import be.bt.domain.Demandeur;
import be.bt.domain.Recruteur;
import be.bt.repository.IDemandeurRepository;
import be.bt.repository.IRecruteurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/recruteurs")
@CrossOrigin(origins="*")
public class RecruteurController {

    @Autowired
    IRecruteurRepository recruteurRepository;

    @GetMapping(value= {""})
    public List<Recruteur> getAll() {
        return recruteurRepository.findAll();
    }

    @GetMapping(value= {"/{id}"})
    public ResponseEntity<Recruteur> getById(@PathVariable String id) {

        Optional<Recruteur> result = recruteurRepository.findById(id);

        return (result.isPresent())?
                new ResponseEntity<>(result.get(), HttpStatus.OK)
                :
                new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping(value = "/add")
    public void addDemandeur( @RequestBody Recruteur p) {
        recruteurRepository.save(p);
    }

    @DeleteMapping(value = "/delete/{id}")
    public void deleteDemandeur (@PathVariable String id){

        recruteurRepository.deleteById(id);
    }

    @PutMapping(value = "/update")
    public void updateOffre( @RequestBody Recruteur p) {

        recruteurRepository.save(p);
    }

}