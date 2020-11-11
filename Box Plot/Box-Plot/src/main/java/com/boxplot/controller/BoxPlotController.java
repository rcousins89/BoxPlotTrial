package com.boxplot.controller;

import com.boxplot.dao.BoxPlotDao;
import com.boxplot.model.BoxPlotPojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class BoxPlotController {

    @Autowired
    BoxPlotDao boxPlotDao;

    @GetMapping("/trades")
    public List<BoxPlotPojo> getTrades(){

        return boxPlotDao.getTrades();
    }

}
