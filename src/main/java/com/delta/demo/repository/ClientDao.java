package com.delta.demo.repository;


import com.delta.demo.domain.Client;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientDao extends CrudRepository<Client, Integer> {

    @Query("select c from Client c order by c.id desc")
    List<Client> findAllDesc();

    @Query("select c from Client c join fetch c.listEquipment eq where c.id =:idValue ")
    Client findClientAndAllEquipment(@Param("idValue")Integer idValue);

    @Query("select new Client (c.id, c.name, c.cpf, c.email) from Client as c")
    List<Client> findAllLessEquipment();
}
