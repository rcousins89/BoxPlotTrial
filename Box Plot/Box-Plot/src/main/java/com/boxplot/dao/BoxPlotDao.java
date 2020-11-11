package com.boxplot.dao;

import com.boxplot.model.BoxPlotPojo;

import java.util.List;

public interface BoxPlotDao {

    List<BoxPlotPojo> getTrades();

}
