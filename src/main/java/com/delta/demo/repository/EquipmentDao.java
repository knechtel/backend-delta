package com.delta.demo.repository;


import com.delta.demo.domain.Equipment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EquipmentDao extends CrudRepository<Equipment, Integer> {
}
