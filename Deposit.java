
import java.util.Scanner;

class Deposit{
    public float deposit(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your Deposit Amount: ");
        float dAmount = in.nextFloat();
        return dAmount; 
    }
}
