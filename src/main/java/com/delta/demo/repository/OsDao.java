package com.delta.demo.repository;


import com.delta.demo.domain.Os;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OsDao extends CrudRepository<Os,Integer> {
}
