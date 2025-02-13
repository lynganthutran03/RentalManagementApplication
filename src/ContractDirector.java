public class ContractDirector {
    private ContractBuilder builder;

    public ContractDirector(ContractBuilder builder) {
        this.builder = builder;
    }

    public Contract buildContract(String contractID, String propertyID, String tenantID, double rentAmount) {
        builder.buildContractID(contractID);
        builder.buildPropertyID(propertyID);
        builder.buildTenantID(tenantID);
        builder.buildRentAmount(rentAmount);
        return builder.signContract();
    }
}
