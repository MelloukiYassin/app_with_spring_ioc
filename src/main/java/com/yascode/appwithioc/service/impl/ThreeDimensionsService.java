package com.yascode.appwithioc.service.impl;

import com.yascode.appwithioc.beans.form.Shape;
import com.yascode.appwithioc.service.DimensionService;

public class ThreeDimensionsService implements DimensionService {
    @Override
    public String getSurface(Shape shape)
    {
        return "The surface of your "+shape.getShape() + " will be planned!";
    }

    @Override
    public String getVolume(Shape shape) {
        return "The volume of your "+shape.getShape() + " will be planned!";
    }
}
