public class Rental {
    private int daysRented;

    private Movie movie;

    public int getDaysRented() {
        return daysRented;
    }

    public void setDaysRented(int daysRented) {
        this.daysRented = daysRented;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public double getCharge() {
        return movie.getCharge(this.daysRented);
    }

    public int getFrequentRenterPoints() {
        return movie.getFrequentRenterPoints(this.daysRented);
    }
}
