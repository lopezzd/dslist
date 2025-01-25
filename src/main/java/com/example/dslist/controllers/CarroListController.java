package com.example.dslist.controllers;

import com.example.dslist.dto.CarroDTO;
import com.example.dslist.dto.CarroListDTO;
import com.example.dslist.dto.CarroMinDTO;
import com.example.dslist.services.CarroListService;
import com.example.dslist.services.CarroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class CarroListController {

    @Autowired
    private CarroListService carroListService;

    @Autowired
    private CarroService carroService;

    @GetMapping
    public List<CarroListDTO> findAll(){
        List<CarroListDTO> result = carroListService.findAll();
        return result;
    }

    @GetMapping(value = "/{listId}/carros")
    public List<CarroMinDTO> findByList(@PathVariable Long listId){
        List<CarroMinDTO> result = carroService.findByList(listId);
        return result;
    }

}
