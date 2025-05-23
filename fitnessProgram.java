public class fitnessProgram {
  public static bmi BMICalculator(Scanner scnr) {
        bmi user1 = new bmi();
        int weight = 0;
        int height = 0;
        

        while (true) {
            try {
                System.out.println("Enter weight in pounds: ");
                weight = scnr.nextInt();
                System.out.println("Enter your height in inches: ");
                height = scnr.nextInt();
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
        return user1;
    }
  public static void menu(Scanner scnr) {
      int choice = 0
      workoutPlan user2 = null;
      bmi user1 = null;
          
      while (true) {
          System.out.println(x:"1. BMI Calculator");
          System.out.println(x:"2. Workout Plan");
          System.out.println(x:"3. Exit");
          System.out.println(s:"Enter your choice: ");

          try {
              choice = scnr.nextInt();
              if (choice == 4) {
                  System.out.println(x:"Exiting...");
                  break;
              }
              menuSelect(choice, scnr);
          } catch(InputMismatchExeption e) {
              System.out.println(x:"Invalid input. Please enter a number.");
          }
      }
}
  public static void menuSelect(int choice, Scanner scnr) {
      switch (choice) {
          case 1:
              BMICalculator(scnr);
              break;
          case 2:
              System.out.println(x:"Workout Plan");
              new workoutPlan();
              break;
          case 3:
              System.out.println(x:"Weekly Report");
              new weeklyReport();
              break;
          
          default:
              System.out.println(x:"Invalid choice. Please try again.");
      }
  }

public static void main (String[] args) {
    Scanner scnr = new Scanner(System.in);

    menu(scnr);
    scnr.close();
}




