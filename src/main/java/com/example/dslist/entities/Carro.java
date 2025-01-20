package com.example.dslist.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "Carros")
public class Carro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String marca;
    private String modelo;
    private Integer cavaloVapor;
    private String motor;
    private String categoria;
    private String imgUrl;
    private String descricaoCurta;
    private String descricaoLonga;

    public Carro(){
    }

    public Carro(Long id, String marca, String modelo, Integer cavaloVapor, String motor, String categoria, String imgUrl, String descricaoCurta, String descricaoLonga){
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.cavaloVapor = cavaloVapor;
        this.motor = motor;
        this.categoria = categoria;
        this.imgUrl = imgUrl;
        this.descricaoCurta = descricaoCurta;
        this.descricaoLonga = descricaoLonga;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getCavaloVapor() {
        return cavaloVapor;
    }

    public void setCavaloVapor(Integer cavaloVapor) {
        this.cavaloVapor = cavaloVapor;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getDescricaoCurta() {
        return descricaoCurta;
    }

    public void setDescricaoCurta(String descricaoCurta) {
        this.descricaoCurta = descricaoCurta;
    }

    public String getDescricaoLonga() {
        return descricaoLonga;
    }

    public void setDescricaoLonga(String descricaoLonga) {
        this.descricaoLonga = descricaoLonga;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Carro carro = (Carro) o;
        return Objects.equals(id, carro.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
