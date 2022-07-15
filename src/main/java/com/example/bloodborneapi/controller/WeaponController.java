package com.example.bloodborneapi.controller;

import com.example.bloodborneapi.domain.Weapon;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/v1/weapon")
public class WeaponController {

    public WeaponController() {

    }

    @GetMapping
    public List<Weapon> getWeapons() {

        var weapons = new ArrayList<Weapon>();

        return weapons;

    }


}
