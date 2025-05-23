import java.util.ArrayList;


public class weeklyReport {
    public weeklyReport(bmi user1, workoutPlan user2) {
       int weight = user1.getWeight();
       int height = user1.getHeight();
       double bmi = user1.returnBMI();
       System.out.println("Your BMI is: " + bmi);
       System.out.println("Weight: " + weight);
       System.out.println("Height: " + height);
        for (String day : user2.getDays()) {
            System.out.println("day: " + day);
        }
    }
}
