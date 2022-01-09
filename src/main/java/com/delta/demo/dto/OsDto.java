package com.delta.demo.dto;

import com.delta.demo.domain.Client;
import com.delta.demo.domain.Equipment;
import com.delta.demo.domain.Os;
import com.delta.demo.service.ClientService;
import com.delta.demo.service.EquipmentService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by maiquelknechtel on 1/6/22.
 */

public class OsDto {

    private Integer idClient;
    private String name;
    private String email;
    private String cpf;
    private Integer idEquipment;
    private String brand;
    private String model;
    private String serial;
    private Double costValue;
    private String defectForRepair;
    @Autowired
    private EquipmentService equipmentService;
    @Autowired
    private ClientService clientService;

    public Integer getIdClient() {
        return idClient;
    }

    public void setIdClient(Integer idClient) {
        this.idClient = idClient;
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

    public Integer getIdEquipment() {
        return idEquipment;
    }

    public void setIdEquipment(Integer idEquipment) {
        this.idEquipment = idEquipment;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public Double getCostValue() {
        return costValue;
    }

    public void setCostValue(Double costValue) {
        this.costValue = costValue;
    }

    public String getDefectForRepair() {
        return defectForRepair;
    }

    public void setDefectForRepair(String defectForRepair) {
        this.defectForRepair = defectForRepair;
    }

    public Os toBuild(OsDto osDto){
        Os os = new Os();
        Client c =new Client();
        c.setEmail(email);
        c.setName(name);
        c.setCpf(cpf);
        os.setClient(c);
        clientService.create(c);
        Equipment equipment = new Equipment();
        equipment.setDefectForRepair(defectForRepair);
        equipment.setCostValue(costValue);
        equipment.setSerial(serial);
        equipment.setModel(model);
        equipment.setBrand(brand);

        os.setEquipment(equipment);
        equipmentService.create(equipment);
        return os;
    }
}
