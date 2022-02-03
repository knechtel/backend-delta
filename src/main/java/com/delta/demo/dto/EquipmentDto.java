package com.delta.demo.dto;

import com.delta.demo.domain.Client;
import com.delta.demo.domain.Equipment;
import com.delta.demo.service.ClientService;
import com.delta.demo.service.EquipmentService;
import com.delta.demo.util.Util;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

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
    private Boolean pronto;
    private Boolean autorizado;
    private String entregue;

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

    public Equipment toBuild(EquipmentDto equipmentDto) {
        Equipment entity = new Equipment();
        if (equipmentDto.getId() != null)
            entity.setId(equipmentDto.getId());
        entity.setBrand(brand);
        entity.setModel(model);
        entity.setSerial(serial);
        entity.setCostValue(costValue);
        entity.setDefectForRepair(defectForRepair);

        if (entity.isAutorizado() != null)
            entity.setAutorizado(autorizado);
        else
            entity.setAutorizado(false);
        if (entity.isPronto() != null)
            entity.setPronto(pronto);
        else
            entity.setPronto(false);

        if(equipmentDto.getEntregue()!=null){
           entity.setDataEntrega(Util.convertStringToDate(equipmentDto.getEntregue()));
        }

        return entity;
    }

    public Equipment toBuildUpdate(EquipmentDto equipmentDto) {
        Equipment entity = new Equipment();
        entity.setId(id);
        if (brand != null) {
            entity.setBrand(brand);
        }
        if (model != null) {
            entity.setModel(model);
        }
        if (serial != null) {
            entity.setSerial(serial);
        }
        if (costValue != null) {
            entity.setCostValue(costValue);
        }
        if (defectForRepair != null) {
            entity.setDefectForRepair(defectForRepair);
        }
        if (pronto != null) {
            System.out.println("toBuild");
            System.out.println(pronto);
            entity.setPronto(pronto);
        }
        if (autorizado != null) {
            entity.setAutorizado(autorizado);
        }
        return entity;
    }

    public Integer getIdClient() {
        return idClient;
    }

    public void setIdClient(Integer idClient) {
        this.idClient = idClient;
    }

    public boolean isPronto() {
        return pronto;
    }

    public void setPronto(boolean pronto) {
        this.pronto = pronto;
    }

    public boolean isAutorizado() {
        return autorizado;
    }

    public void setAutorizado(boolean autorizado) {
        this.autorizado = autorizado;
    }

    public String getEntregue() {
        return entregue;
    }

    public void setEntregue(String entregue) {
        this.entregue = entregue;
    }
}
