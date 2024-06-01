package prog_1;

enum VehiclaServiceType{
    FREE,PAID;
}

public class ServiceCategory {
    private VehiclaServiceType vehicleServiceType;
    private Integer noOfserviceAvailable;

    public ServiceCategory(){
        super();
    }

    public ServiceCategory(VehiclaServiceType vehicleServiceType, Integer noOfserviceAvailable) {
        super();
        this.vehicleServiceType = vehicleServiceType;
        this.noOfserviceAvailable = noOfserviceAvailable;
    }

    public VehiclaServiceType getVehicleServiceType() {
        return vehicleServiceType;
    }

    public void setVehicleServiceType(VehiclaServiceType vehicleServiceType) {
        this.vehicleServiceType = vehicleServiceType;
    }

    public Integer getNoOfserviceAvailable() {
        return noOfserviceAvailable;
    }

    public void setNoOfserviceAvailable(Integer noOfserviceAvailable) {
        this.noOfserviceAvailable = noOfserviceAvailable;
    }

    @Override
    public String toString(){
        return "ServiceCategory[VehicleServiceType="+vehicleServiceType+", noOfserviceAvailable="+noOfserviceAvailable+"]";
    }
    
}
