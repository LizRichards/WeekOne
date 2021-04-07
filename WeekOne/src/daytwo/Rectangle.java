package daytwo;

import java.text.DecimalFormat;

/**
 *
 * @author Liz Richards
 */
public class Rectangle implements Shape {

    private double length = 0;
    private double width = 0;
    DecimalFormat twoDecimals = new DecimalFormat("#,##0.00");

    /**
     * Method Rectangle() Description Constructor for a Rectangle object.
     * Accepts a value for the length and width of the object.
     *
     * @param	len value for length input by user
     * @param	wid value for width input by user
     */
    public Rectangle(double len, double wid) {
        this.length = len;
        this.width = wid;
    }

    /**
     * Method calculateArea() Description Overridden method that calculates and
     * returns the area.
     *
     * @return the calculated area
     */
    @Override
    public double calculateArea() {
        return length * width;
    }

    /**
     * Method display() Description Overridden method to display all the
     * information about the Rectangle object.
     */
    @Override
    public void display() {
        System.out.println("The area of the rectangle with"
                + " a length of " + length + " and a height"
                + " of " + width + " is "
                + twoDecimals.format(calculateArea()));
    }

}
