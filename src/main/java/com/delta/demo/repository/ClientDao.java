package com.delta.demo.repository;


import com.delta.demo.domain.Client;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientDao extends CrudRepository<Client, Integer> {

    @Query("select c from Client c order by c.id desc")
    List<Client> findAllDesc();
}
