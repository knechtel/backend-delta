package com.delta.demo.dto;

import com.delta.demo.domain.Client;
import com.delta.demo.domain.Equipment;
import com.delta.demo.service.ClientService;
import com.delta.demo.service.EquipmentService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by maiquelknechtel on 1/6/22.
 */
public class EquipmentDto {

    private Integer id;
    private String brand;
    private String model;
    private String serial;
    private Double costValue;
    private String defectForRepair;
    private Integer idClient;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Equipment toBuild(EquipmentDto equipmentDto){
        Equipment entity = new Equipment();
        entity.setBrand(brand);
        entity.setModel(model);
        entity.setSerial(serial);
        entity.setCostValue(costValue);
        entity.setDefectForRepair(defectForRepair);

        return entity;
    }

    public Integer getIdClient() {
        return idClient;
    }

    public void setIdClient(Integer idClient) {
        this.idClient = idClient;
    }
}
