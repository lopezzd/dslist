package com.example.dslist.dto;

import com.example.dslist.entities.CarroList;

public class CarroListDTO {
    private Long id;
    private String name;

    public CarroListDTO() {

    }

    public CarroListDTO(CarroList entity) {
        id = entity.getId();
        name = entity.getName();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
