public class LimitException {
    private String message;
    private double remainingAmount;
    public LimitException(String message, double remainingAmount){
        this.message = message;
        this.remainingAmount = remainingAmount;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setRemainingAmount(double remainingAmount) {
        this.remainingAmount = remainingAmount;
    }

    public double getRemainingAmount() {
        return remainingAmount;
    }

    public String getMessage() {
        return message;
    }
}
