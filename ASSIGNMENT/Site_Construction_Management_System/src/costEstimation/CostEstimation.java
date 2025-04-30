package costEstimation;

import constructionMaterial.ConstructionMaterial;
import constructorClass.Constructor;

import java.util.Scanner;

public class CostEstimation extends ConstructionMaterial {
    private final Constructor constructor;

    // Constructor to accept the shared Constructor instance
    public CostEstimation(Constructor constructor) {
        this.constructor = constructor;
    }

    @Override
    public void receiveMaterial() {

    }

    @Override
    public void useMaterial() {

    }

    @Override
    public void estimateCost() {
        /*  Determines the cost per ton:
            If materialQuantity is between 5 and 15 tons → cost = 200,000 per ton.
            If materialQuantity > 15 tons → cost = 180,000 per ton (bulk discount).

        Displays:
            Contractor ID and Name
            Quantity used
            Total cost of materials used (with formatting) */

        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter new material quantity: ");
            double materialQuantity = sc.nextDouble();

            constructor.setMaterialQuantity(materialQuantity);

            if (materialQuantity >= 5 && materialQuantity <= 15) {
                double totalCost = materialQuantity * 200000;
                System.out.println("Contractor name is: " + constructor.getContractorName());
                System.out.println("Contractor ID is: " + constructor.getContractorId());
                System.out.println("Total materials used: " + materialQuantity + " Tons");
                System.out.println("The total cost is: " + totalCost);
            } else if (materialQuantity > 15) {
                double totalCost = materialQuantity * 180000;
                System.out.println("Bulk discount applied");
                System.out.println("Contractor name is: " + constructor.getContractorName());
                System.out.println("Contractor ID is: " + constructor.getContractorId());
                System.out.println("Total materials used: " + materialQuantity + " Tons");
                System.out.println("The total cost is: " + totalCost);
            } else {
                System.out.println("ERROR: Material quantity should not be less than 5 tons");
            }
        } catch (Exception e) {
            System.out.println("Invalid input, Please check the input values");
        }
    }
}
