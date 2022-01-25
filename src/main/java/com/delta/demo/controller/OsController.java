package com.delta.demo.controller;

import com.delta.demo.domain.Os;
import com.delta.demo.dto.OsDto;
import com.delta.demo.service.ClientService;
import com.delta.demo.service.OsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * Created by maiquelknechtel on 1/6/22.
 */
@Controller
public class OsController {
    @Autowired
    private OsService osService;
    @PostMapping(value = "os-create", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Os create(@RequestBody OsDto osDto){
        return osService.create(osDto.toBuild(osDto));
    }
    @PostMapping(value = "os-findAll", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Os> findAll(){
        return osService.findAll();
    }
}
