package com.example.helloapplication;

import java.io.Serializable;

public class Coordinate implements Serializable {
    private double layoutx;
    private boolean b;

    public Coordinate(double x){
        layoutx = x;

    }

    public void setB(boolean b) {
        this.b = b;
    }

    public boolean isB() {
        return b;
    }

    public void setLayoutx(double layoutx) {
        this.layoutx = layoutx;
    }

//    public void setLayouty(double layouty) {
//        this.layouty = layouty;
//    }

    public double getLayoutx() {
        return layoutx;
    }

//    public double getLayouty() {
//        return layouty;
//    }
}
