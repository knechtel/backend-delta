package com.delta.demo.service;

import com.delta.demo.domain.Os;
import com.delta.demo.repository.OsDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by maiquelknechtel on 1/6/22.
 */
@Service
public class OsService {
    @Autowired
    private OsDao osDao;

    public Os create(Os os){
        return osDao.save(os);
    }

    public List<Os> findAll(){
        return (List<Os>) osDao.findAll();
    }
}
