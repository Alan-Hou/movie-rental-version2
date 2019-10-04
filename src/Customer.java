import java.util.Enumeration;
import java.util.Vector;

public class Customer {

    private String name;

    private Vector _rentals;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private double getTotalCharge() {
        double result = 0;
        Enumeration rentals = this._rentals.elements();
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            result += each.getCharge();
        }
        return result;
    }

    private int getTotalFrequentRenterPonits() {
        int result = 0;
        Enumeration rentals = this._rentals.elements();
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            result += each.getFrequentRenterPoints();
        }
        return result;
    }

    public String statement() {
        Enumeration rentals = this._rentals.elements();
        String result = "Rentals Records for " + this.getName() + "\n";

        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();

            //show figures for this rental
            result += "\t" + each.getMovie().getTitle() + "\t" +
                    String.valueOf(each.getCharge()) + "\n";
        }

        //add footer lines
        result += "Amount owed is " + String.valueOf(getTotalCharge()) + "\n";
        result += "You earned " + String.valueOf(getTotalFrequentRenterPonits()) + "frequent renter points";
        return result;
    }

}
