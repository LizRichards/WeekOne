package daytwo;

import java.text.DecimalFormat;

/**
 *
 * @author Liz Richards
 */
public class Circle implements Shape {

    private double rad = 0;
    DecimalFormat twoDecimals = new DecimalFormat("#,##0.00");

    /**
     * Method Circle() Description Constructor for a Circle object. Accepts a
     * value for the length of the radius.
     *
     * @param	radius value for radius input by user
     */
    public Circle(double radius) {
        super();
        this.rad = radius;
    }

    /**
     * Method calculateArea() Description Overridden method that calculates and
     * returns the area.
     *
     * @return the calculated area
     */
    @Override
    public double calculateArea() {
        return Math.PI * rad * rad;
    }

    /**
     * Method display() Description Overridden method to display all the
     * information about the Circle object.
     */
    @Override
    public void display() {
        System.out.println("The area of the circle with"
                + " a radius of " + rad + " is "
                + twoDecimals.format(calculateArea()));
    }

}
