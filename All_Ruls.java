class All_Ruls {
    Account_balance account_balance = new Account_balance();
    private boolean withdrawal_primision = false;
    public boolean withdrawal_Rul(float with_Amount){
        if(account_balance.getAccount_Balance() >= with_Amount){
            withdrawal_primision = true;
        }
        else{
            System.out.println("Amount Not Vaild Re-Try");
        }
        return withdrawal_primision;
    }
}
