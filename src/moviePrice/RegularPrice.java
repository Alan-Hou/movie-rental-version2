package moviePrice;

public class RegularPrice extends Price{
    @Override
    public double getCharge(int daysRentend) {
        double result = 2;
        if (daysRentend > 2) {
            result += (daysRentend - 2) * 1.5;
        }
        return result;
    }

    @Override
    public int getFrequentRenterPoints(int daysRentend) {
        return 1;
    }
}

