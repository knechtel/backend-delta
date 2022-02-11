package com.delta.demo.controller;

import com.delta.demo.domain.Equipment;
import com.delta.demo.dto.ClientDto;
import com.delta.demo.dto.EquipmentDto;
import com.delta.demo.service.ClientService;
import com.delta.demo.service.EquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * Created by maiquelknechtel on 1/6/22.
 */
@RestController
public class EquipmentController {
    @Autowired
    private EquipmentService equipmentService;
    @Autowired
    private ClientService clientService;
    @PostMapping(value = "equipment-create", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Equipment create(@RequestBody EquipmentDto equipmentDto){
        Equipment equipment = equipmentDto.toBuild(equipmentDto);
        if(equipmentDto.getIdClient()!=null)
            equipment.setClient(clientService.findById(equipmentDto.getIdClient()));
        equipment.setDataEntrada(new Date());
        return equipmentService.create(equipment);
    }

    @RequestMapping(value = "equipment-findAll", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
    public List<Equipment> findAll(){
        return equipmentService.findAll();
    }

    @RequestMapping(value = "equipment-update", consumes = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
    public void update(@RequestBody EquipmentDto equipmentDto){
        equipmentService.update(equipmentDto.toBuildUpdate(equipmentDto));
    }
    @PostMapping(value = "equipment-delete", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public void delete(@RequestBody EquipmentDto equipmentDto){
        equipmentService.delete(equipmentDto.toBuild(equipmentDto));
    }
}
