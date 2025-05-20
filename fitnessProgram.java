public class fitnessProgram {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        MenuHandler menuHandler = new MenuHandler();

        System.out.println("Welcome to the Fitness Program!");

        while (true) {
            try {
                menuHandler.displayMenu();
                System.out.print("Enter option: ");
                int choice = scnr.nextInt();
                menuHandler.handleSelection(choice, scnr);
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number between 1 and 3.");
                scnr.nextLine(); // Clear buffer
            }
        }
    }
}
  public static void menu(Scanner scnr) {
      int choice = 0

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




