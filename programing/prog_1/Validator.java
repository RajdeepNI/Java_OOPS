package prog_1;

import java.time.LocalDate;

public class Validator {
    public static boolean isValidCustomerName(String customerName){
        String custName="";
        String[] strArr = customerName.split(" ");
        for(String w:strArr){
            String firstName = w.substring(0,1);
            String lastName = w.substring(1);
            custName+=firstName.toUpperCase()+lastName.toLowerCase()+" ";
        }
        custName=custName.trim();
        if(custName.matches("[A-Z][a-z]+[\\s]?([A-Z][a-z]+[\\s]?)*")){
            return true;
        }
        return false;
    }

    public static boolean isValidBikeNo(String bikeNo){
        if(bikeNo.matches("[0-9]{2}[\\s]BH[\\s][0-9]{4}[\\s][A-HJ-NP-Z]{2}")) return true;
        return false;
    }

    public static boolean isValidPhoneNo(Long phoneNo){
        String phN = Long.toString(phoneNo);
        if((phN.matches("[6-9][0-9]{9}")) && !phN.matches("([6-9])\\1{9}")){
            return true;
        }
        return false;
    }

    public static boolean isValidServiceType(ServiceCategory serviceCategory){
        if((serviceCategory.getVehicleServiceType()==VehiclaServiceType.FREE ||
         serviceCategory.getVehicleServiceType()==VehiclaServiceType.PAID ) && serviceCategory.getNoOfserviceAvailable()>0){
            return true;
        }
        return false;
    }

    public static boolean isValidServiceDate(LocalDate lastServiceDate){
        LocalDate currentDate = LocalDate.now();
        if(currentDate.isAfter(lastServiceDate)){
            return true;
        }
        return false;
    }

    // public static void Validate(VehiclaService vehiclaService){
    //     System.out.println(vehiclaService.getCustomerName());
    //     System.out.println(vehiclaService.getBikeNo());
    //     System.out.println(vehiclaService.getPhoneNo());
    //     System.out.println(vehiclaService.getSeviceCategory());
    //     System.out.println(vehiclaService.getServiceDate());
    // }
}
