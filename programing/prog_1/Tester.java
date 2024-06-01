package prog_1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VehiclaService vehiclaService = new VehiclaService();
        String customerName = sc.nextLine();
        vehiclaService.setCustomerName(customerName);
        String bikeNo = sc.nextLine();
        vehiclaService.setBikeNo(bikeNo);
        Long phoneNo = sc.nextLong();
        vehiclaService.setPhoneNo(phoneNo);
        String vehicleServiceType=sc.next();
        Integer noOfserviceAvailable = sc.nextInt();
        ServiceCategory serviceCategory = new ServiceCategory();
        if(vehicleServiceType.equalsIgnoreCase("free")){
            serviceCategory =new ServiceCategory(VehiclaServiceType.FREE,noOfserviceAvailable);
        }
        else{
            serviceCategory = new ServiceCategory(VehiclaServiceType.PAID,noOfserviceAvailable);
        }
        vehiclaService.setSeviceCategory(serviceCategory);
        String serviceDateInString=sc.next();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
        LocalDate serviceDate = LocalDate.parse(serviceDateInString,formatter);
        vehiclaService.setServiceDate(serviceDate);
        if(vehicleServiceType.equalsIgnoreCase("Free") || vehicleServiceType.equalsIgnoreCase("Paid")){
            // Validator.Validate(vehiclaService);
            System.out.println(Validator.isValidCustomerName(customerName));
            System.out.println(Validator.isValidBikeNo(bikeNo));
            System.out.println(Validator.isValidPhoneNo(phoneNo));
            System.out.println(Validator.isValidServiceType(serviceCategory));
            System.out.println(Validator.isValidServiceDate(serviceDate));
        }
        else{
            System.out.println("Kindly select the correct service type either FREE/PAID");
        }
        sc.close();
    }

}
