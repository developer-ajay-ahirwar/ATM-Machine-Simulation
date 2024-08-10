import java.util.ArrayList;
import java.util.Scanner;

public class ATM_Machine {
    public static void main(String[] args) {
        Account_balance aBalance = new Account_balance();
        Main_Manu manu = new Main_Manu();
        Deposit d = new Deposit();
        Withdrawal w = new Withdrawal();
        All_Ruls all_Ruls = new All_Ruls();
        ArrayList<String> hisroty = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int i = 0;
        do { 
            boolean pin = aBalance.PIN_Checker();
            if(pin == true){
                System.out.println("-----------------Welcome ATM Machine Simulation-------------");
                int j = 5;
                while(j > 0){
                    manu.home_Manu();
                    System.out.print("Please Select Options: ");
                    int select = in.nextInt();
                    switch (select) {
                        case 1 -> {
                            System.out.println(aBalance.getAccount_Balance());
                            j += 1;
                        }
                        case 2 -> {
                            float d_CashAmount = d.deposit();
                            float add = aBalance.getAccount_Balance() + d_CashAmount;
                            aBalance.setAccount_Balance(add);
                            String sAString = Float.toString(d_CashAmount);
                            hisroty.add(sAString);
                            System.out.println("Thank YOU, Suscess Deposit Cash");
                        }
                        case 3 -> {
                            float w_CashAmount = w.withdrawal();
                            if(all_Ruls.withdrawal_Rul(w_CashAmount)){
                                float subtract = aBalance.getAccount_Balance() - w_CashAmount;
                                aBalance.setAccount_Balance(subtract);
                                String sAString = Float.toString(w_CashAmount);
                                String sSString = "-"+sAString; 
                                hisroty.add(sSString);
                                System.out.println("Thank YOU, Suscess Withdrawal Cash");
                            }
                            
                        }
                        case 4 -> {
                            System.out.print("Enter Your New PIN: ");
                            int newPIN = in.nextInt();
                            aBalance.setPIN(newPIN);
                            System.out.println("Your New PIN Suscessfuly Created Please RE-Login");
                            j += 1;
                            break;
                        }
                        case 5 -> {
                            System.out.println(hisroty);
                        }
                        case 6 -> {
                            System.out.println("your PIN: "+aBalance.getPIN());
                        }
                        case 7 -> {
                            break;
                        }
                        default -> {
                        }
                    }
                }
            }
            i += 1;
        } while (i < 3);
    }
}   
