package com.yascode.appwithioc.service;

import com.yascode.appwithioc.beans.form.Shape;

public interface DimensionService {

    public String getSurface(Shape shape);

    public String getVolume(Shape shape);
}
