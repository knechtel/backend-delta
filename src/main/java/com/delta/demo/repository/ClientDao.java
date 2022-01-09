package com.delta.demo.repository;


import com.delta.demo.domain.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientDao extends CrudRepository<Client, Integer> {

}
