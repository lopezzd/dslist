package com.example.dslist.dto;

import com.example.dslist.entities.Carro;
import jakarta.persistence.Column;

public class CarroMinDTO {
    private Long id;
    private String marca;
    private String modelo;
    private String imgUrl;
    private String descricaoCurta;

    public CarroMinDTO(){

    }

    public CarroMinDTO(Carro entity) {
        id = entity.getId();
        marca = entity.getMarca();
        modelo = entity.getModelo();
        imgUrl = entity.getImgUrl();
        descricaoCurta = entity.getDescricaoCurta();
    }

    public Long getId() {
        return id;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getDescricaoCurta() {
        return descricaoCurta;
    }
}
