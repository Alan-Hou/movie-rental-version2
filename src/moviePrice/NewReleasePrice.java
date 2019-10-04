package moviePrice;

public class NewReleasePrice extends Price {

    @Override
    public double getCharge(int daysRented) {
        return daysRented * 3;
    }

    @Override
    public int getFrequentRenterPoints(int daysRentend) {
        if (daysRentend > 1)
            return 2;
        return 1;
    }
}
