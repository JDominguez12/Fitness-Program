public class fitnessProgram {
    public static void main(String[] args) {
        canner scnr = new Scanner(System.in);
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

