package programing.prog_2;

import java.time.LocalDate;

public class User {
    private long phoneNumber;
    private String name;
    private String paymentType;
    private LocalDate bookingDate;
    private String movieName;
    private int noOfSeats;
    
    public User(long phoneNumber, String name, String paymentType, LocalDate bookingDate, String movieName,
            int noOfSeats) {
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.paymentType = paymentType;
        this.bookingDate = bookingDate;
        this.movieName = movieName;
        this.noOfSeats = noOfSeats;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public LocalDate getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(LocalDate bookingDate) {
        this.bookingDate = bookingDate;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    
}
