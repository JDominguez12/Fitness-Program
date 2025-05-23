import java.util.InputMismatchException;
import java.io.*;
public class bmi {
	private int weight;
    private int height;
    public void setWeight(int weight){
        this.weight = weight;
    }
    public int getWeight(){
        return weight;
    }
    public  void setHeight(int height){
        this.height = height;
    }
    public int getHeight(){
        return height;
    }
    public double returnBMI(){
        return ((double) weight / (height * height)) * 703;
    }
    public double getBMI(int weight, int height) throws Exception{
        double bmiCalc = 0.0;
        try{
            if (weight < 0 || height < 0){
                throw new Exception("Error: weight and height must be positive numbers");
            }
            else if (weight == 0 || height == 0){
                throw new ArithmeticException("Error: height cannot be zero");
            }
            bmiCalc = ((double) weight / (height * height)) * 703;
            System.out.print("Your BMI is: ");
            System.out.printf("%.2f", bmiCalc);
            writeBMI(bmiCalc);
        }
        catch(InputMismatchException e){
            System.out.println("Error: Please enter a number");
        }
        catch (ArithmeticException a){
            System.out.println(a.getMessage());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        return bmiCalc;
    }
}
