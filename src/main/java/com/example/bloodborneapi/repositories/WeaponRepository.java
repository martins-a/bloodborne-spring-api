package com.example.bloodborneapi.repositories;

import com.example.bloodborneapi.domain.Weapon;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WeaponRepository extends MongoRepository<Weapon, String> {
}
