import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
public class workoutPlan{
    private Scanner scnr = new Scanner(System.in);
    private ArrayList<String> workoutList = new ArrayList<>();
    private ArrayList<String> days = new ArrayList<>();
    private String line; 

    public workoutPlan() {
        System.out.println("Add the days of the week you want to work out (e.g., Monday, Tuesday). type 'done' if done:");
        for (int i = 0; i < 7; i++) {
            String day = scnr.nextLine();
            if (day.equalsIgnoreCase("done")) {
                System.out.println("You have finished adding days.");
                break;
            }
            days.add(day);
        }
        for (String day : days) {
            System.out.println("You have selected: " + day);
        }
        try{
            FileReader fr = new FileReader("workouts.txt");
            BufferedReader br = new BufferedReader(fr);
           
            System.out.println("Do you want to see recommended workouts? (y/n)");
            String answer = scnr.nextLine();
            if (answer.equalsIgnoreCase("y")) {
                System.out.println("Here are some recommended workouts:");
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
            } else {
                System.out.println("No workouts to display.");
            }

            br.close();
            fr.close();
        }
        catch (FileNotFoundException e){
            System.out.println("File not found");
        }
        catch (IOException e){
            System.out.println("Error reading file");
        }
        try{
            FileWriter fw = new FileWriter("workoutPlan.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            for (String day : days) {
                System.out.println("Enter your workout for " + day + "(or stop with 'done'):");
                while(true){
                    String workout = scnr.nextLine();
                    if (workout.equals("done")) {
                        break;
                    }
                    workoutList.add(workout);
                    
                }
                bw.write("\n" + day + ": \n" + String.join("\n ", workoutList));
                bw.newLine();
            }
            bw.close();
            fw.close();
        }
        catch (IOException e){
            System.out.println("Error writing to file");
        }
        System.out.println("Your workout plan has been saved to workoutPlan.txt");
        
        System.out.println("Do you want to see your workout plan? (y/n)");
        String answer = scnr.nextLine();
        if (answer.equalsIgnoreCase("y")) {
            try {
                FileReader fr = new FileReader("workoutPlan.txt");
                BufferedReader br = new BufferedReader(fr);
                System.out.println("Your workout plan:");
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
                br.close();
                fr.close();
            } catch (FileNotFoundException e) {
                System.out.println("File not found");
            } catch (IOException e) {
                System.out.println("Error reading file");
            }
        } else {
            System.out.println("No workout plan to display.");
        }
    }
}