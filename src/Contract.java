public class Contract {
    private String contractID;
    private String propertyID;
    private String tenantID;
    private double rentAmount;
    
    public Contract(String contractID, String propertyID, String tenantID, double rentAmount) {
        this.contractID = contractID;
        this.propertyID = propertyID;
        this.tenantID = tenantID;
        this.rentAmount = rentAmount;
    }

    @Override
    public String toString() {
        return "Contract type: " + contractID + ", property ID: " + propertyID +
                    ", tenant ID: " + tenantID + ", rent amount: " + rentAmount;
    }
}
