public class BankAccount {
    private double amount;

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void deposit(double sum){
        this.amount += sum;
    }

    public void withDraw(int sum){
        if (sum < getAmount()){
            setAmount(getAmount() - sum);
            limitExceptionForAmountOfMoney.setRemainingAmount(amount);
            System.out.println(limitExceptionForAmountOfMoney.getRemainingAmount());
        } else {
            System.out.println(limitExceptionForAmountOfMoney.getMessage());
        }
    }

    public double getAmount() {
        return amount;
    }
    LimitException limitExceptionForAmountOfMoney = new LimitException("You don't have enough money to get that amount. You have " + amount + ".", amount);
}
