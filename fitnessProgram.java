import java.util.Scanner;
import java.util.InputMismatchException;

public class fitnessProgram {
	public static void BMICalculator(Scanner scnr) {
	bmi user1 = new bmi();
        int weight = 0;
        int height = 0;
       
        while(true){
           try{
                System.out.println("Enter weight in pounds: ");
                weight = scnr.nextInt();
		System.out.println("Enter your height in inches: );
                height= scnr.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Error: Please enter a number.");
                scnr.next();
             }
          }
        
          user1.setWeight(weight);
          user1.setHeight(height);
          try {
              user1.getBMI(weight, height);
          } catch (Exception e) {
            System.out.println(e.getMessage());
          }
    }
    public static void main(String[] args) {
    	Scanner scnr = new Scanner(System.in);
       
	menu(scnr);
	scnr.close();

    }
}
