package com.shpp.p2p.cs.akartel.assignment2;

import acm.graphics.GLabel;
import acm.graphics.GRect;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;
import java.util.Random;

/**
 * Assignment2Part4 draws 3-colored flag with label of some imagine country
 */
public class Assignment2Part4 extends WindowProgram {
    public static final int APPLICATION_WIDTH = 500;
    public static final int APPLICATION_HEIGHT = 500;
    double flagWidth, flagHeight;

    /**
     * draws flag in the center of window via 3 random colored rectangle and label in a bottom-right corner
     */
    @Override
    public void run() {
        flagHeight = getHeight() - getHeight() / 3d;
        flagWidth = getWidth() / 4.8;

        flagPart(getWidth() / 2d - flagWidth / 2, (getHeight() - flagHeight) / 2);
        flagPart(getWidth() / 2d - flagWidth * 1.5, (getHeight() - flagHeight) / 2);
        flagPart(getWidth() / 2d + flagWidth /2, (getHeight() - flagHeight) / 2);

        labelAdd();
    }

    /**
     * add label in a bottom right corner of window
     * (label size corresponds to window width)
     */
    private void labelAdd() {
        int fontSize = APPLICATION_WIDTH / 15;

        GLabel label = new GLabel("Flag of Fantasy");
        label.setFont("-"  + fontSize);
        label.setLocation(getWidth() - label.getWidth(),getHeight() - label.getDescent());
        add(label);
    }

    /**
     * create filled rectangle - 3rd piece of flag with random rgb color
     * @param x axis
     * @param y axis
     */
    private void flagPart(double x, double y) {
        Random rnd = new Random();
        GRect piece = new GRect(x, y, flagWidth, flagHeight);
        piece.setFilled(true);
        piece.setColor(new Color(rnd.nextInt(0,255)
                ,rnd.nextInt(0,255),rnd.nextInt(0,255)));
        add(piece);
    }
}
