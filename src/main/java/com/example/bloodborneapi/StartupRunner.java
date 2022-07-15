package com.example.bloodborneapi;

import com.example.bloodborneapi.domain.Weapon;
import com.example.bloodborneapi.repositories.WeaponRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StartupRunner implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(StartupRunner.class);

    private final WeaponRepository weaponRepository;
    private final MongoTemplate mongoTemplate;

    @Autowired
    public StartupRunner(WeaponRepository weaponRepository, MongoTemplate mongoTemplate) {
        this.weaponRepository = weaponRepository;
        this.mongoTemplate = mongoTemplate;
    }

    @Override
    public void run(String... args) throws Exception {

        Weapon w1 = new Weapon("Amygdalan Arm", 80);


        Query query = new Query();
        query.addCriteria(Criteria.where("name").is(w1.getName()));

        List<Weapon> weapons = mongoTemplate.find(query, Weapon.class);

        if (weapons.isEmpty()) {
            weaponRepository.insert(w1);
        }

    }

}
