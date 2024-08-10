import java.util.Scanner;

public class Withdrawal{
    public float withdrawal(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your Withdrawl Amount: ");
        float wAmount = in.nextFloat();
        return wAmount; 
    }
}
