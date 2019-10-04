package moviePrice;

public abstract class Price {
    public abstract double getCharge(int daysRentend);
    public abstract int getFrequentRenterPoints(int daysRentend);
}
