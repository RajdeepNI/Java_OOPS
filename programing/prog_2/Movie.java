package programing.prog_2;

import java.time.LocalDate;

public class Movie {
    
    private int noOfSeatsAvailable;
    private String movieName;
    private LocalDate movieDate;
    public int getNoOfSeatsAvailable() {
        return noOfSeatsAvailable;
    }
    public void setNoOfSeatsAvailable(int noOfSeatsAvailable) {
        this.noOfSeatsAvailable = noOfSeatsAvailable;
    }
    public String getMovieName() {
        return movieName;
    }
    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }
    public LocalDate getMovieDate() {
        return movieDate;
    }
    public void setMovieDate(LocalDate movieDate) {
        this.movieDate = movieDate;
    }
    
}

