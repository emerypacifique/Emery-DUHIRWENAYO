package MaterialUsage;

import constructionMaterial.ConstructionMaterial;
import constructorClass.Constructor;

import java.util.Scanner;

public class MaterialUsage extends ConstructionMaterial {
    private final Constructor constructor; // Shared instance

    /* Functionality:
        Allows material to be used only if the resulting materialBalance remains ≥ 2 tons.
        Subtracts the used quantity from materialBalance.
        If insufficient material is available, an appropriate message is displayed. */

    // Constructor to accept the shared Constructor instance
    public MaterialUsage(Constructor constructor) {
        this.constructor = constructor;
    }

    @Override
    public void receiveMaterial() {

    }

    @Override
    public void useMaterial() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Quantity to be used ");
            double materialQuantity = sc.nextDouble();
            // Method to get the material balance
            double materialBalance = constructor.getMaterialBalance();
            if (materialBalance - materialQuantity >= 2) {
                // Update the material balance
                double updatedBalance = materialBalance - materialQuantity;
                constructor.setMaterialBalance(updatedBalance);
                System.out.println("Materials used successfully");
                System.out.println("The remaining material balance is: " + constructor.getMaterialBalance());
            } else {
                System.out.println("ERROR: Insufficient balance, minimum of 2 tons required");
            }
        } catch (Exception e) {
            System.out.println("Invalid input");
        }
    }

    @Override
    public void estimateCost() {

    }
}
