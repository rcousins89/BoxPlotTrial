package com.boxplot.dao;

import com.boxplot.model.BoxPlotPojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BoxPlotDaoImpl implements BoxPlotDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public List<BoxPlotPojo> getTrades() {

        String sql = "SELECT * FROM boxplot.boxplotdetails";

        List trades = jdbcTemplate.queryForList(sql);

        return trades;
    }
}
