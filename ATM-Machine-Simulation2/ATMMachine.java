import java.util.ArrayList;
import java.util.Scanner;

public class ATMMachine {
    public static void main(String[] args) {
        ATM atm = new ATM();
        Manu m = new Manu();
        Deposite p = new Deposite();
        Withdrol w = new Withdrol();
        ArrayList<String> history = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int i = 0;

        do{
           
            if(atm.checkPin()){
                System.out.println("--------------Welcome The ATM Machine Simulation--------------------");
                while (true) { 
                    
                    m.manu();
                    System.out.print("Please Enter your Option: ");
                    int selection = in.nextInt();
                    if(selection == 1){
                        System.out.println(atm.balance_check());
                    }
                    else if(selection == 2){
                        float pAmount = p.deposite_Amount();
                        float add = atm.balance_check() + pAmount;
                        atm.balance = add;
                        System.out.println("-------------------SuscessFully Deposite Amount: "+ pAmount+"--------------");
                        String sdString = Float.toString(pAmount);
                        history.add(sdString);
                    }
                    else if(selection == 3){
                        float wAmount = w.Withdrol_Amount();
                        float subtract = atm.balance_check() - wAmount;
                        atm.balance = subtract;
                        System.out.println("--------------------SuscessFully Withdrol Amount: "+ wAmount+"-----------------------------");
                        String sdString = Float.toString(wAmount);
                        String sdString1 = "-"+sdString;
                        history.add(sdString1);
                    }
                    else if(selection == 4){
                        System.out.print("Enter Your New PIN: ");
                        int pin = in.nextInt();
                        atm.setPIN(pin);
                        System.out.println("SuscessFully pin change: ");
                        history.add("Pin Changing");
                        break;
                    }
                    else if(selection == 5){
                        System.out.println(history);
                    }
                    else if(selection == 6){
                        break;
                    }
                    else{
                        System.out.println("Inviled Option: ");
                    }
                }
                
            }
           
            
            i += 1;
               
            
        }while(i < 3);
        
    }

}

class ATM{
    float balance;
    int PIN = 12345;
    Manu m = new Manu();
    
    public boolean  checkPin(){
        boolean pincheck = false;
        System.out.print("-----------------------Enter your PIN: ");
        Scanner in = new Scanner(System.in);
        int enterPIN = in.nextInt();
        if(enterPIN == PIN){
            pincheck = true;
        }else{
            System.out.println("Wrone PIN Please Re-Enter PIN:");
        }
        return pincheck;
    }
    public float balance_check(){
        return this.balance;
    }
    public void setPIN(int pin){
        this.PIN = pin;
    }
}

class Manu{
    public void manu(){
        Scanner in = new Scanner(System.in);
       
        System.out.println("1. Balance Check: ");
        System.out.println("2. Cash Deposite: ");
        System.out.println("3. Cash Withdrol: ");
        System.out.println("4. PIN change: ");
        System.out.println("5. Transiction History: ");
        System.out.println("6. Exit:");
    }
}
class Deposite{

    public float deposite_Amount(){
        Scanner in = new Scanner(System.in);
        System.out.print("-----------------Enter Your Deposite Amount: ");
        float deposite_Amount = in.nextFloat();
        return deposite_Amount;
    }
}

class Withdrol{

    public float Withdrol_Amount(){
        Scanner in = new Scanner(System.in);
        System.out.print("------------------Enter Your Withdrol Amount: ");
        float Withdrol_Amount = in.nextFloat();
        return Withdrol_Amount;
    }
}
