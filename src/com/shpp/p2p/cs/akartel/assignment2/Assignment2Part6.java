package com.shpp.p2p.cs.akartel.assignment2;

import acm.graphics.GLine;
import acm.graphics.GOval;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;

/**
 * caterpillar creation
 */
public class Assignment2Part6 extends WindowProgram {
    public static final int APPLICATION_WIDTH = 500;
    public static final int APPLICATION_HEIGHT = 500;
    public static final double SEGMENT_SIZE = APPLICATION_WIDTH / 5d;
    public static final double SEGMENT_SHIFT = SEGMENT_SIZE / 2;
    /*
    number of caterpillar segments
     */
    public static final double SEGMENT_QUANTITY = 7;
    /*
    start position shift to put caterpillar in the center of the window
     */
    public static final double START_X_POSITION = SEGMENT_QUANTITY / 2 * SEGMENT_SHIFT;

    /**
     * build caterpillar with segments , centered in the middle
     */
    @Override
    public void run() {
        for (int i = 0; i < SEGMENT_QUANTITY; i++) {
            segment(getWidth() / 2.0 - START_X_POSITION - SEGMENT_SHIFT / 2 + SEGMENT_SHIFT * i,
                    getHeight() / 2d - SEGMENT_SHIFT - SEGMENT_SHIFT / 3 * (i % 2));
            System.out.println(i%2);
        }
    }

    /**
     * build caterpillar segment , random fill color , random circumference color
     * added some random size coefficient
     * @param x axis
     * @param y axis
     */
    private void segment(double x, double y) {
        GOval segment = new GOval(x, y, SEGMENT_SIZE, SEGMENT_SIZE);
        segment.setFilled(true);
        segment.setFillColor(new Color((int) (255 * Math.random()), (int) (255 * Math.random()), (int) (255 * Math.random())));
        segment.setColor(new Color((int) (255 * Math.random()), (int) (255 * Math.random()), (int) (255 * Math.random())));
        segment.scale(0.8 + Math.random() * 0.2);
        add(segment);
    }
}