import java.util.Scanner;

public class RunBloodData {
    public static void main(String[] args) {
        BloodData bloodDataObject = new BloodData();
        Scanner userInput = new Scanner(System.in);
        clearScreen();
        while(true) {
            String userBloodTypeFinal = bloodDataObject.checkBloodType(userInput);
            String userRhFactorFinal = bloodDataObject.checkRhFactor(userInput);
            if(!userBloodTypeFinal.isEmpty() && userRhFactorFinal.isEmpty()) {
                System.out.println("Only blood type is added! Please try again!");
                continue;
            }
            if(userBloodTypeFinal.isEmpty() && !userRhFactorFinal.isEmpty()) {
                System.out.println("Only user Rhesus factor is added! Please try again!");
                continue;
            }
            if(!(userBloodTypeFinal.isEmpty() && userRhFactorFinal.isEmpty())) {
                bloodDataObject.setBloodType(userBloodTypeFinal);
                bloodDataObject.setRhFactor(userRhFactorFinal);
                System.out.print(bloodDataObject.getBloodType() + bloodDataObject.getRhFactor() + " is added to the blood bank.\n");
                continue;
            }
            System.out.print(bloodDataObject.getBloodType() + bloodDataObject.getRhFactor() + " is added to the blood bank.\n");
        }
    }
    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();
    }  
}