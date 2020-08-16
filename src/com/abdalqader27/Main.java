package com.abdalqader27;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

import static java.lang.System.out;

public class Main {


    public static void main(String[] args) {
        //P1(2,2)  and P2(10,-1)
        // dy=-1 -2=-3
        // dx = 10 -2=8
        // |dy|>|dx| so Y+1 or Y-1
        line(10, -1, 2, 2);

    }

    static void line(int x1, int y1, int x0, int y0) {
        int dx = x1 - x0; // calculate the distance between x1 and x0
        int dy = y1 - y0;// calculate the distance between y1 and y0
        // print the first point when we start in the first point is A(x0,y0)
        out.println("*" + (x0) + "," + (y0));
        //calculate m  when m is Tendency  y=mx+b
        // and in first point we use A (x0,y0)
        float m = (float) dy / dx;
        // b is the Displacement at yy' and  b=y0-mx0
        float b = (float) y0 - m * x0;
        //now we have to select the  state of  m if m > 1 or m<1
        if (Math.abs(dx) > Math.abs(dy)) {
            // m>1 because The numerator is greater than the denominator
            dx = (x0 > x1) ? -1 : 1;
            while (x0 != x1) {
                x0 += dx;
                y0 = Math.round(m * x0 + b);
                out.println("* (" + (x0) + "," + (y0) + ")");
            }
            out.println("Done");
        } else {
            // m<1 because The numerator is greater than the denominator
            dy = (y0 > y1) ? -1 : 1;
            while (y0 != y1) {
                y0 += dy;
                x0 = Math.round((y0 - b) / m);
                out.println("* (" + (x0) + "," + (y0) + ")");

            }
            out.println("Done");
        }


    }
}
