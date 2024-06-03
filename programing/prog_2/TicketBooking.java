package programing.prog_2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TicketBooking {
        
    private static  List<Movie> getMovieDetails(){
        Movie jawan = new Movie();
        jawan.setNoOfSeatsAvailable(7);
        jawan.setMovieName("JAWAN");
        jawan.setMovieDate(LocalDate.of(2023, 9,21));

        Movie nunTwo = new Movie();
        nunTwo.setNoOfSeatsAvailable(5);
        nunTwo.setMovieName("NUN2");
        nunTwo.setMovieDate(LocalDate.of(2023,9,21));

        Movie gardarTwo = new Movie();
        gardarTwo.setNoOfSeatsAvailable(10);
        gardarTwo.setMovieName("GARDAR2");
        gardarTwo.setMovieDate(LocalDate.of(2023,9,21));

        List<Movie> movielist=new ArrayList<>();
        movielist.add(jawan);
        movielist.add(nunTwo);
        movielist.add(gardarTwo);

        return movielist;
    }

    public static boolean validateUserPhone(User user){
        String phoneNo = Long.toString(user.getPhoneNumber());
        int len = phoneNo.length();
        boolean r=false;
        if(len==10 && !phoneNo.matches("([0-9])\\1{9}")){
            r=true;
        }
        else r=false;
        return r;
    }

    public static boolean validateUserName(User user){
        String name = user.getName();
        if(name.matches("[A-Z][a-z]+")){
            return true;
        }
        return false;
    }

    public static boolean validateUserPayement(User user){
        String payType=user.getPaymentType();
        if(payType.equals("UPI") || payType.equals("DEBIT-CARD") || payType.equals("CASH")){
            return true;
        }
        return false;
    }

    public static boolean validateUserBookingDate(User user){
        LocalDate ld = user.getBookingDate();
        LocalDate date2 = LocalDate.of(2023,9,21);
        return ld.isEqual(date2);
    }

    public static String bookTickets(User user){
        List<Movie> m = getMovieDetails();
        String result = "";
        int flag=-1;
        for(Movie movie:m){
            if(movie.getMovieName().equalsIgnoreCase(user.getMovieName())){
                int seatNo=movie.getNoOfSeatsAvailable();
                if(seatNo<user.getNoOfSeats()){
                    System.out.println("Tickets can't book as not enough seats available");
                    flag++;
                    break;
                }
                else{
                    result=generateBookingConfirmation(movie,user);
                    flag++;
                }
            }
        }
        if(flag==-1) result="Kindly select a correct movie please";
        return result;
    }

    private static String generateBookingConfirmation(Movie movie,User user){
        return movie.getMovieName().substring(0,3)+"-"+user.getName().substring(0,3)
        +"-"+user.getNoOfSeats()+"-"+user.getBookingDate().getDayOfMonth()+"-"+user.getPhoneNumber();
    }

    private static boolean validateUserdetails(User user){
        // System.out.println(validateUserPhone(user));
        // System.out.println(validateUserName(user));
        // System.out.println(validateUserPayement(user));
        // System.out.println(validateUserBookingDate(user));

        return validateUserPhone(user) && validateUserName(user) && validateUserBookingDate(user) && validateUserPayement(user);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long phoneNo = sc.nextLong();
        String name = sc.next();
        String paymentType = sc.next();
        String inputDate = sc.next();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
        LocalDate bookingDate = LocalDate.parse(inputDate,formatter);
        String movieName = sc.next();
        int noOfSeats= sc.nextInt();
        sc.close();

        User user = new User(phoneNo, name, paymentType, bookingDate, movieName, noOfSeats);

        if(validateUserdetails(user)){
            String bookingStatus = bookTickets(user);
            System.out.println(bookingStatus);
        }
        else{
            System.out.println("Tickets can't be booked as user details is/are invalid");
        }
    }
}
