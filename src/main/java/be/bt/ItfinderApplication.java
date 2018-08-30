package be.bt;

import be.bt.domain.Demandeur;
import be.bt.domain.Offre;
import be.bt.domain.Recruteur;
import be.bt.repository.IDemandeurRepository;
import be.bt.repository.IOffreRepository;
import be.bt.repository.IRecruteurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;

@SpringBootApplication
public class ItfinderApplication {


    @Autowired
    IRecruteurRepository recruteurRepository;

    @Autowired
    IOffreRepository offreRepository;

    @Autowired
    IDemandeurRepository demandeurRepository;

    public static void main(String[] args) {
        SpringApplication.run(ItfinderApplication.class, args);
    }


    /*@Bean
    CommandLineRunner runIt() {
        return args -> {

            Recruteur r = new Recruteur("r1","123","r1","r1","r1","r1","r1","r1","r1",new ArrayList<>());
            Offre o = new Offre("o1","o1",true,r,new ArrayList<>());
            Demandeur d = new Demandeur("d1","123","d1","d1","d1","d1",true, new ArrayList<>());

            r.getOffres().add(o);
            d.getCandidatures().add(o);

            recruteurRepository.save(r);
            offreRepository.save(o);
            demandeurRepository.save(d);

        };
    }*/
}