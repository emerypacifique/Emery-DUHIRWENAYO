package materialDelivery;

import constructionMaterial.ConstructionMaterial;
import constructorClass.Constructor;

import java.util.Scanner;

public class MaterialDelivery extends ConstructionMaterial {
    private final Constructor constructor;
    private final Scanner sc = new Scanner(System.in);

    public MaterialDelivery(Constructor constructor) {
        this.constructor = constructor;
    }

    @Override
    public void receiveMaterial() {
        double materialQuantity;

        try {
            System.out.println("Enter the materials quantity to be received \n" +
                    "Quantity must be between '1' and '10' tons ");
            materialQuantity = sc.nextDouble();

            if (materialQuantity >= 1 && materialQuantity <= 10) {
                double updatedBalance = constructor.getMaterialBalance() + materialQuantity;
                constructor.setMaterialBalance(updatedBalance);
                System.out.println("Material successfully received");
                System.out.println("Updated material Balance: " + constructor.getMaterialBalance());
            } else {
                System.out.println("ERROR: Invalid material quantity entered \n" +
                        "Quantity must be between '1' and '10' tons ");
            }
        } catch (Exception e) {
            System.out.println("ERROR: Enter a valid input");
        }
    }

    @Override
    public void useMaterial() {

    }

    @Override
    public void estimateCost() {

    }
}
