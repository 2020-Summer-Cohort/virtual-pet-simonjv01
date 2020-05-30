package virtual_pet;

import java.util.Scanner;

public class VirtualPet {
    public String petName;
    public String petType;
    public int feedBalance;
    public int thirstBalance;
    public int wasteBalance;
    public int boredomBalance;

    public VirtualPet(String petName, String petType, int feedBalance, int thirstBalance, int wasteBalance, int boredomBalance) {
        this.petName = petName;
        this.petType = petType;
        this.feedBalance = feedBalance;
        this.thirstBalance = thirstBalance;
        this.wasteBalance = wasteBalance;
        this.boredomBalance = boredomBalance;
    }



    public int feed(int feedAmt) {
        if (feedBalance + feedAmt > 100) {
            return 100;
        } else {
            feedBalance += feedAmt;
        }
        return feedBalance;
    }

    public int thirst(int thirstAmt) {
        if (thirstBalance + thirstAmt > 100) {
            return 100;
        } else {
            thirstBalance += thirstAmt;
        }
        return thirstBalance;
    }

    public int waste(int wasteAmt) {
        if (wasteBalance + wasteAmt > 100) {
            return 100;
        } else {
            wasteBalance -= wasteAmt;
        }
        return wasteBalance;
    }

    public int boredom(int boredomAmt) {
        if (boredomBalance + boredomAmt > 100) {
            return 100;
        } else {
            boredomBalance -= boredomAmt;
        }
        return boredomBalance;
    }


    public void actionDisplay() {
        Scanner input = new Scanner(System.in);
        System.out.println("What do you want to do?");
        System.out.println("1. Feed " + petName);
        System.out.println("2. Water " + petName);
        System.out.println("3. Play with " + petName);
        System.out.println("4. Take " + petName + " to the potty");
        System.out.println("5. Do nothing");
        System.out.println("6. Pet balances");
        System.out.println("7. Exit game");
        String actionOption = input.nextLine();

        if (actionOption.equals("1")) {
            System.out.println("You fed " + petName);
            performActionOption1();
            actionDisplay();
        } else if (actionOption.equals("2")) {
            System.out.println("You gave water to " + petName);
            performActionOption2();
            actionDisplay();
        } else if (actionOption.equals("3")) {
            System.out.println("You played with " + petName);
            performActionOption3();
            actionDisplay();
        } else if (actionOption.equals("4")) {
            System.out.println("You took " + petName + " on a potty break");
            performActionOption4();
        } else if (actionOption.equals("5")) {
            System.out.println("You did nothing with " + petName);
            tick();
            actionDisplay();
        } else if (actionOption.equals("6")){
            System.out.println("Pet balances for " + petName + " are:");
            System.out.println("Huger: " + feedBalance);
            System.out.println("Thirst: " + thirstBalance);
            System.out.println("Boredom: " + boredomBalance);
            System.out.println("Waste: " + wasteBalance);
            actionDisplay();

        } else {
            System.out.println("Thank you for playing Virtual Pet, goodbye!");
            System.exit(0);
        }
    }

    public void performActionOption1() {
        int amountToFeed = 15;
        feed(amountToFeed);
        thirstBalance = thirstBalance -= amountToFeed;
        wasteBalance = wasteBalance += amountToFeed;
    }

    public void performActionOption2() {
        int amountToWater = 15;
        thirst(amountToWater);
        feedBalance = feedBalance -= amountToWater;
        wasteBalance = wasteBalance += amountToWater;
    }

    public void performActionOption3() {
        int amountToPlay = 15;
        boredom(amountToPlay);
        feedBalance = feedBalance += amountToPlay;
        thirstBalance = thirstBalance += amountToPlay;

    }

    public void performActionOption4() {
        int amountToWaste = 15;
        waste(amountToWaste);
        feedBalance = feedBalance -= amountToWaste;
        thirstBalance = thirstBalance -= amountToWaste;
    }

    public void tick() {
        int amountToTick = 10;
        feedBalance = feedBalance -= amountToTick;
        thirstBalance = thirstBalance -= amountToTick;
        wasteBalance = wasteBalance += amountToTick;
        boredomBalance = boredomBalance += amountToTick;
    }

    public void displayBalances() {
        System.out.println("Huger: " + feedBalance);
        System.out.println("Thirst: " + thirstBalance);
        System.out.println("Boredom: " + boredomBalance);
        System.out.println("Waste: " + wasteBalance);
        System.out.println();
    }
}









