package com.yascode.appwithioc.service.impl;

import com.yascode.appwithioc.beans.form.Shape;
import com.yascode.appwithioc.service.DimensionService;

public class TwoDimensionsService implements DimensionService {
    @Override
    public String getSurface(Shape shape) {
        return "The surface of your "+shape.getShape() + " is not yet in place!";
    }

    @Override
    public String getVolume(Shape shape) {
        return "We can calculate the volume of this shape";
    }
}
