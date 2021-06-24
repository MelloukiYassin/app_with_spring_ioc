package com.yascode.appwithioc.beans.form;

import com.yascode.appwithioc.service.DimensionService;

public class Triangle implements Shape{

    DimensionService dimensionService;

    public Triangle(){}

    public Triangle(DimensionService dimensionService) {
        this.dimensionService = dimensionService;
    }

    public DimensionService getDimensionService() {
        return dimensionService;
    }

    public void setDimensionService(DimensionService dimensionService) {
        this.dimensionService = dimensionService;
    }

    @Override
    public String getShape() {
        return "Triangle";
    }

    @Override
    public String getSurface() {
        return dimensionService.getSurface(this);
    }

    @Override
    public String getVolume() {
        return dimensionService.getVolume(this);
    }
}
