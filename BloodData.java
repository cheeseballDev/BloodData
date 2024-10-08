package BloodData;

import java.util.Scanner;

public class BloodData {
    private String bloodType;
    private String rhFactor;
    private final String[] validBloodTypes = {"A", "B", "O", "AB", ""};
    private final String[] validRhFactors = {"-", "+"};

    public BloodData() {
        bloodType = "O";
        rhFactor = "+";
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType; 
    }

    public void setRhFactor(String rhFactor) {
        this.rhFactor = rhFactor;    
    }

    public String getBloodType() {
        return this.bloodType;
    }

    public String getRhFactor() {
        return this.rhFactor;
    }

    String checkBloodType(Scanner userInput) {
        while (true) {
            System.out.print("Enter blood type of patient: ");
            String userBloodType = userInput.nextLine().trim().toUpperCase();
            if (userBloodType.equals(""))
                return userBloodType;
            for (String bloodTypes: validBloodTypes) {
                if (userBloodType.equals(bloodTypes)) 
                    return userBloodType;
            }
            System.out.println("Invalid blood type! (Accepted values are A,B,O,AB)");
        }
    }

    String checkRhFactor(Scanner userInput) {
        while (true) {
            System.out.print("Enter the Rhesus factor (+ or -): ");
            String userRhFactor = userInput.nextLine().trim();
            if (userRhFactor.equals(""))
                return userRhFactor;
            for (String rhFactors: validRhFactors) {
                if (userRhFactor.equals(rhFactors)) 
                    return userRhFactor;
            }
            System.out.println("Invalid Rhesus factor! (Accepted values are: -,+)");
        }
    }
}