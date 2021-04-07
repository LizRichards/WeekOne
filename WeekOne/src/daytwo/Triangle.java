package daytwo;

import java.text.DecimalFormat;

/**
 *
 * @author Liz Richards
 */
public class Triangle implements Shape {

    private double side1, side2, side3;
    DecimalFormat twoDecimals = new DecimalFormat("#,##0.00");

    /**
     * Method Triangle() Description Constructor for a Triangle object. Accepts
     * a value for the length of each side.
     *
     * @param	a value for length of side one input by user
     * @param	b value for length of side two input by user
     * @param	c value for length of side three input by user
     */
    public Triangle(double a, double b, double c) {
        this.side1 = a;
        this.side2 = b;
        this.side3 = c;
    }

    /**
     * Method calculateArea() Description Overridden method that checks to see
     * if the triangle is valid then calculates and returns the area.
     *
     * @return the calculated area
     */
    @Override
    public double calculateArea() {
        double halfPerim = (side1 + side2 + side3) / 2;
        if (isValid()) {
            return Math.sqrt(halfPerim * (halfPerim - side1) * (halfPerim - side2) * (halfPerim - side3));
        }
        return 0;
    }

    /**
     * Method display() Description Overridden method to return all the
     * information about the Triangle object.
     */
    @Override
    public void display() {
        System.out.println("The area of the triangle with sides " + side1 + ", " + side2 + ", and " + side3 + " is: " + twoDecimals.format(calculateArea()));
        System.out.println("Note: if the area returned is 0 then the sides do not make a valid triangle.");
    }

    /**
     * <pre>
     * Method          isValid()
     * Description     Checks to see if the points for the Triangle object
     * make a valid triangle. Method does this by checking if any two sides are
     * less than the third
     * @param	      none
     * @return true if all three side checks are true. False if any two sides
     * are not greater than the third side.
     */
    boolean isValid() {
        if (((side1 + side2) <= side3) || ((side3 + side2) <= side1) || ((side1 + side3) <= side2)) {
            return false;
        }
        return true;
    }

}
