package com.shpp.p2p.cs.akartel.assignment2;

import acm.graphics.GOval;
import acm.graphics.GRect;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;

/**
 * create optical illusion by : white rectangle over 4 black circles in the corners of window
 */
public class Assignment2Part2 extends WindowProgram {
    public static final int APPLICATION_WIDTH = 500;
    public static final int APPLICATION_HEIGHT = 500;
    double diameter;

    /**
     * build white rectangle over 4 black circles in the corners of window
     */
    @Override
    public void run() {
        //define diameter considering height and width of window
        diameter = (APPLICATION_WIDTH < APPLICATION_HEIGHT) ? APPLICATION_WIDTH / 2.8 : APPLICATION_HEIGHT / 2.8;

        drawCircle(0, 0);
        drawCircle(0, getHeight() - diameter);
        drawCircle(getWidth() - diameter, 0);
        drawCircle(getWidth() - diameter, getHeight() - diameter);

        drawRectangle();
    }

    /**
     * draw black filled circle
     * @param x axis
     * @param y axis
     */
    private void drawCircle(double x, double y) {
        GOval circle = new GOval(x, y, diameter, diameter);
        circle.setFilled(true);
        add(circle);
    }

    /**
     * draw white filled rectangle
     */
    private void drawRectangle() {
        GRect rect = new GRect(diameter / 2d, diameter / 2d,
                getWidth() - diameter, getHeight() - diameter);
        rect.setColor(Color.white);
        rect.setFilled(true);
        add(rect);
    }
}
