
import java.util.Scanner;

class Account_balance {
    private float account_Balance;
    private int PIN = 12345;
    boolean pinCheck = false;
    Scanner in = new Scanner(System.in);
    public float getAccount_Balance(){
        return this.account_Balance;
    }
    public int getPIN(){
        return this.PIN;
    }

    public void setAccount_Balance(float balance){
        this.account_Balance = balance;
    }
    public void setPIN(int pin){
        this.PIN = pin;
    }

    public boolean PIN_Checker(){
        System.out.print("Enter your PIN: ");
        int enterPin = in.nextInt();
        if(enterPin == PIN){
            pinCheck = true;
        }
        else {
            System.out.println("Sorry Invaild PIN Please Re-Enter");
            pinCheck = false;
        }
        return pinCheck;
    }


}
