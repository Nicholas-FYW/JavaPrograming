package com.igeek.Project08.homework;

public class LabeledPoint extends Point {
    private String label;

    public LabeledPoint(double x, double y, String label) {
        super(x, y);
        this.label = label;
    }
}
