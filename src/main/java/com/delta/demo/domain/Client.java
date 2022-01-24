package com.delta.demo.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Client implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String email;
    private String cpf;
    @OneToMany(mappedBy = "client",fetch = FetchType.LAZY)
    private List<Equipment> listEquipment;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public List<Equipment> getListEquipment() {
        return listEquipment;
    }

    public void setListEquipment(List<Equipment> listEquipment) {
        this.listEquipment = listEquipment;
    }
}
