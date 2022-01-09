package com.delta.demo.service;

import com.delta.demo.domain.Equipment;
import com.delta.demo.repository.EquipmentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by maiquelknechtel on 1/6/22.
 */
@Service
public class EquipmentService {
    @Autowired
    private EquipmentDao equipmentDao;


    public Equipment create(Equipment equipment){
        return equipmentDao.save(equipment);
    }
    public List<Equipment> findAll(){
        return (List<Equipment>) equipmentDao.findAll();
    }

    public Equipment findById(Integer id){
        return equipmentDao.findById(id).orElse(null);
    }

}
