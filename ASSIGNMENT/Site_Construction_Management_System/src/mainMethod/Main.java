package mainMethod;

import MaterialUsage.MaterialUsage;
import constructorClass.Constructor;
import costEstimation.CostEstimation;
import materialDelivery.MaterialDelivery;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Constructor constructor = new Constructor();
        String contractorId;
        String contractorName;
        double materialQuantity;
        double materialBalance;
        System.out.println();
        System.out.println("SITE CONSTRUCTION MANAGEMENT SYSTEM");
        System.out.println("---------------------------------------");
        //instantiating the methods
        MaterialDelivery delivery = new MaterialDelivery(constructor);
        MaterialUsage usage = new MaterialUsage(constructor);
        CostEstimation estimation = new CostEstimation(constructor);
        try {
            //initiating user inputs
            System.out.println("Enter contractor's name ");
            contractorName = sc.nextLine();
            constructor.setContractorName(contractorName);

            System.out.println("Enter the contractor's id ");
            contractorId = sc.nextLine();
            constructor.setContractorId(contractorId);

            System.out.println("Enter the material Balance ");
            materialBalance = sc.nextDouble();
            constructor.setMaterialBalance(materialBalance);
            //validating material balance
            if (materialBalance<0){
                System.out.println("Material balance cannot be negative");
                return;
            }

            //creating a main menu for the system
            while (true) {
                System.out.println("Enter a choice ");
                System.out.println("1. Material Delivery");
                System.out.println("2. Cost Estimation");
                System.out.println("3. Material Usage ");
                System.out.println("4. exit");
                System.out.println("Enter your choice ");
                int choice = sc.nextInt();

                //calling the methods using switch case
                switch (choice) {
                    case 1:
                        delivery.receiveMaterial();
                        break;

                    case 2:
                        estimation.estimateCost();
                        break;
                    case 3:
                        usage.useMaterial();
                        break;
                    case 4:
                        System.out.println("Exiting the system ");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid choice, try again later");
                }
            }

        } catch (Exception e) {
            System.out.println("please enter a valid choice ");
        }
    }
}
