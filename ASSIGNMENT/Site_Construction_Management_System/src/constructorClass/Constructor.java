package constructorClass;

public class Constructor {
    /* Shared Fields: class is named as Constructor
        contractorId (String) – Unique identifier for the contractor.
        contractorName (String) – Full name of the contractor.
        materialQuantity (double) – Quantity of material (in tons).
        materialBalance (double) – Current available quantity in stock.*/

   private String contractorId;
   private String contractorName;
   private  double materialQuantity;
   private double materialBalance;

   //creating a constructor for Constructor class


    public Constructor(String contractorId, String contractorName, double materialQuantity,
                       double materialBalance) {
        this.contractorId = contractorId;
        this.contractorName = contractorName;
        this.materialQuantity = materialQuantity;
        this.materialBalance = materialBalance;
    }

    public Constructor() {

    }
    //setter and getter for constructor

    public String getContractorId() {
        return contractorId;
    }

    public void setContractorId(String contractorId) {
        this.contractorId = contractorId;
    }

    public String getContractorName() {
        return contractorName;
    }

    public void setContractorName(String contractorName) {
        this.contractorName = contractorName;
    }

    public double getMaterialQuantity() {
        return materialQuantity;
    }

    public void setMaterialQuantity(double materialQuantity) {
        this.materialQuantity = materialQuantity;
    }

    public double getMaterialBalance() {
        return materialBalance;
    }

    public void setMaterialBalance(double materialBalance) {
        this.materialBalance = materialBalance;
    }
}
