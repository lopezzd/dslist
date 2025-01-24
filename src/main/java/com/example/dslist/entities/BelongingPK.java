package com.example.dslist.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.Objects;

@Embeddable
public class BelongingPK {

    @ManyToOne
    @JoinColumn(name = "carro_id")
    private Carro carro;

    @ManyToOne
    @JoinColumn(name = "list_id")
    private CarroList list;

    public BelongingPK() {

    }

    public BelongingPK(Carro carro, CarroList list) {
        this.carro = carro;
        this.list = list;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public CarroList getList() {
        return list;
    }

    public void setList(CarroList list) {
        this.list = list;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        BelongingPK that = (BelongingPK) o;
        return Objects.equals(carro, that.carro) && Objects.equals(list, that.list);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carro, list);
    }
}
