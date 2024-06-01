package prog_1;

import java.time.LocalDate;

public class VehiclaService {
    private String customerName;
    private String bikeNo;
    private Long phoneNo;
    private ServiceCategory seviceCategory;
    private LocalDate serviceDate;
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String getBikeNo() {
        return bikeNo;
    }
    public void setBikeNo(String bikeNo) {
        this.bikeNo = bikeNo;
    }
    public Long getPhoneNo() {
        return phoneNo;
    }
    public void setPhoneNo(Long phoneNo) {
        this.phoneNo = phoneNo;
    }
    public ServiceCategory getSeviceCategory() {
        return seviceCategory;
    }
    public void setSeviceCategory(ServiceCategory seviceCategory) {
        this.seviceCategory = seviceCategory;
    }
    public LocalDate getServiceDate() {
        return serviceDate;
    }
    public void setServiceDate(LocalDate serviceDate) {
        this.serviceDate = serviceDate;
    }

    @Override
    public String toString(){
        return "VehicleService [customerName="+customerName+", bikeNo="+bikeNo+", phoneno="+phoneNo+", "+
        "serviceCategory="+seviceCategory+", serviceDate="+serviceDate+"]";
    }
}
