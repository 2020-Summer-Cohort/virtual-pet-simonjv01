package virtual_pet;

import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        VirtualPet petGiraffe = new VirtualPet("Sophie", "giraffe", 25, 34, 54, 10);
        VirtualPet petLion = new VirtualPet("Leo", "lion", 55, 20, 35, 20);
        VirtualPet petOwl = new VirtualPet("Hedwig", "owl", 65, 25, 40, 70);
        VirtualPet petDog = new VirtualPet("Fluffy", "dog", 20, 50, 30, 72);

        System.out.println("Welcome to Virtual Pet!");
        System.out.println("Choose your pet:");
        System.out.println("Press 1 for giraffe");
        System.out.println("Press 2 for lion");
        System.out.println("Press 3 for owl");
        System.out.println("Press 4 for dog");
        System.out.println("Press 5 to exit");
        String petOption = input.nextLine();


        if (petOption.equals("1")) {
            System.out.println("Congratulations, you have a pet " + petGiraffe.petType + " named " + petGiraffe.petName + "!");
            System.out.println("Sophie the Giraffe");
            petGiraffe.displayBalances();

        } else if (petOption.equals("2")) {
            System.out.println("Congratulations, you have a pet " + petLion.petType + " named " + petLion.petName + "!");
            System.out.println("Leo the Lion");
            petLion.displayBalances();
        } else if (petOption.equals("3")) {
            System.out.println("Congratulations, you have a pet " + petOwl.petType + " named " + petOwl.petName + "!");
            System.out.println("Hedwig the Owl");
            petOwl.displayBalances();
        } else if (petOption.equals("4")) {
            System.out.println("Congratulations, you have a pet " + petDog.petType + " named " + petDog.petName + "!");
            System.out.println("Fluffy the Dog");
            petDog.displayBalances();

        } else {
            System.out.println("Thank you for playing Virtual Pet, goodbye!");
            System.exit(0);
        }


        if (petOption.equals("1")) {
            petGiraffe.actionDisplay();
        } else if (petOption.equals("2")) {
            petLion.actionDisplay();
        } else if (petOption.equals("3")) {
            petOwl.actionDisplay();
        } else if (petOption.equals("4")) {
            petDog.actionDisplay();
        }


    }
}