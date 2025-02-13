public class LongTermContract implements ContractBuilder {
    private String contractID;
    private double rentAmount;
    private String propertyID;
    private String tenantID;

    @Override
    public void buildContractID(String contractID) {
        this.contractID = contractID;
    }

    @Override
    public void buildPropertyID(String propertyID) {
        this.propertyID = propertyID;
    }

    @Override
    public void buildRentAmount(double rentAmount) {
        this.rentAmount = rentAmount;
    }

    @Override
    public void buildTenantID(String tenantID) {
        this.tenantID = tenantID;
    }

    @Override
    public Contract signContract() {
        return new Contract(contractID, propertyID, tenantID, rentAmount);
    }
}
