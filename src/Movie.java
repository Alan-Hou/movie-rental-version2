import moviePrice.Price;

public class Movie {

    private String title;
    private Price price;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public Movie(String title, Price price) {
        this.title = title;
        this.price = price;
    }

    public int getFrequentRenterPoints(int daysRented) {
        return this.price.getFrequentRenterPoints(daysRented);
    }

    public double getCharge(int daysRented) {
        return this.price.getFrequentRenterPoints(daysRented);
    }
}
