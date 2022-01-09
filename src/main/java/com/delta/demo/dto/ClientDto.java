package com.delta.demo.dto;

import com.delta.demo.domain.Client;

/**
 * Created by maiquelknechtel on 1/6/22.
 */
public class ClientDto {


    private Integer id;
    private String name;
    private String email;
    private String cpf;

    public Client toBuild(ClientDto clientDto){
        Client entity = new Client();
        if(id!=null){
            entity.setId(id);
        }
        entity.setName(name);
        entity.setEmail(email);
        entity.setCpf(cpf);

        return entity;
    }

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
}
