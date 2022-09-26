package com.shpp.p2p.cs.akartel.assignment2;

import com.shpp.cs.a.console.TextProgram;

/**
 * class perform quadratic equation
 */
public class Assignment2Part1 extends TextProgram {

    double a, b, c, discriminator;
    String tryAgain;

    /**
     * method perform quadratic equation
     */
    @Override
    public void run() {
        inputValuesForEquation();
        carryOutEquation();
        tryAgain();
    }

    /**
     * commence next quadratic equation by input Anything or Stop program by input "stop"
     */
    private void tryAgain() {
        tryAgain = readLine("Click Enter to continue or type 'stop' to finish: ");
        while (!tryAgain.equalsIgnoreCase("stop")) run();
    }

    /**
     * define Discriminator and equation type
     * to execute quadratic equation
     */
    private void carryOutEquation() {
        discriminator = Math.pow(b, 2) - 4 * a * c;
        if (discriminator > 0) doubleRootEquation();
        if (discriminator == 0) singleRootEquation();
        if (discriminator < 0) noRootEquation();
    }

    /**
     * user inputs values for quadratic equation
     */
    private void inputValuesForEquation() {
        a = readDouble("Please enter a: ");
        while (a == 0) a = readInt("wrong input 'a' cant be '0' enter another number");
        b = readDouble("Please enter b: ");
        c = readDouble("Please enter c: ");
    }

    /**
     * equation without roots case
     */
    private void noRootEquation() {
        println("There are no real roots");
    }

    /**
     * one root equation case implementation
     */
    private void singleRootEquation() {
        double root = -b / (2 * a);
        println("There is one root: " + root);
    }

    /**
     * double root equation case implementation
     */
    private void doubleRootEquation() {
        double root1 = (-b + Math.sqrt(discriminator)) / 2 * a;
        double root2 = (-b - Math.sqrt(discriminator)) / 2 * a;
        println("There are two roots: " + root1 + " and " + root2);
    }
}