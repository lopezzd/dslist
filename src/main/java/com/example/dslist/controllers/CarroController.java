package com.example.dslist.controllers;

import com.example.dslist.dto.CarroMinDTO;
import com.example.dslist.entities.Carro;
import com.example.dslist.services.CarroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/carros")
public class CarroController {

    @Autowired
    private CarroService carroService;

    @GetMapping
    public List<CarroMinDTO> findAll(){
        List<CarroMinDTO> result = carroService.findAll();
        return result;
    }
}
