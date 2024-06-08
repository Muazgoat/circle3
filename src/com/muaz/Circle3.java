package com.muaz;
/**
* @author Muaz
* @date 06/07/2024
* Circle3 class represents a circle with a center point (x, y) and a radius.
*/

public class Circle3 {
    // Instance variables for the circle's center coordinates and radius
    public int x, y, radius;

    /**
     * Constructor to initialize a Circle3 object with specified center coordinates and radius.
     * 
     * @param x      the x-coordinate of the circle's center
     * @param y      the y-coordinate of the circle's center
     * @param radius the radius of the circle
     */
    public Circle3(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    /**
     * Returns a string representation of the circle in the format:
     * (x-a)^2 + (y-b)^2 = r^2
     * 
     * @return a string representing the circle's equation
     */
    @Override
    public String toString() {
        return "(" + "x-" + this.x + ")^2 " + "+" + " (" + "y-" + this.y + ")^2 " + "= " + this.radius + "^2";
    }

    /**
     * Calculates the area of the circle.
     * 
     * @return the area of the circle
     */
    public double area() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    /**
     * Calculates the perimeter (circumference) of the circle.
     * 
     * @return the perimeter of the circle
     */
    public double perimeter() {
        return 2 * Math.PI * this.radius;
    }

    /**
     * Moves the circle to a new location specified by new center coordinates.
     * 
     * @param x the new x-coordinate of the circle's center
     * @param y the new y-coordinate of the circle's center
     */
    public void move(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Resizes the circle to a new radius.
     * 
     * @param radius the new radius of the circle
     */
    public void resize(int radius) {
        this.radius = radius;
    }
}