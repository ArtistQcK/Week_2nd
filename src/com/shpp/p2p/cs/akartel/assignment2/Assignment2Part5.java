package com.shpp.p2p.cs.akartel.assignment2;

import acm.graphics.GRect;
import com.shpp.cs.a.graphics.WindowProgram;

/**
 * Assignment2Part5 creates optical illusion - matrix with black boxes and some spacing between
 */
public class Assignment2Part5 extends WindowProgram {
    public static final int APPLICATION_WIDTH = 500;
    public static final int APPLICATION_HEIGHT = 500;
    /* The number of rows and columns in the grid, respectively. */
    private static final int NUM_ROWS = 5;
    private static final int NUM_COLS = 6;

    /* The width and height of each box. */
    private static final double BOX_SIZE = 40;

    /* The horizontal and vertical spacing between the boxes. */
    private static final double BOX_SPACING = 10;
    double boxShift = BOX_SIZE + BOX_SPACING;
    double startPosX, startPosY;

    /**
     * build matrix of black boxes
     */
    @Override
    public void run() {
        startPosX = getWidth() / 2d - boxShift / 2 * NUM_ROWS + BOX_SPACING / 2;
        startPosY = getHeight() / 2d - boxShift / 2 * NUM_COLS + BOX_SPACING / 2;

        createMatrix();
    }

    /**
     * create matrix of boxes relatively to columns and rows constants
     */
    private void createMatrix() {
        for (int i = 0; i < NUM_COLS; i++) {
            for (int j = 0; j < NUM_ROWS; j++) {
                box(startPosX + boxShift * j, startPosY + boxShift * i);
            }
        }
    }

    /**
     * create black filled square
     * @param x axis
     * @param y axis
     */
    private void box(double x, double y) {
        GRect box = new GRect(x, y, BOX_SIZE, BOX_SIZE);
        box.setFilled(true);
        add(box);
    }
}
