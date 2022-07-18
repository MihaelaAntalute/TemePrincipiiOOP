package tema4PrincipiiOOP;

public abstract class DebitCard extends Card implements Payable{
    private double maxTransactionAmount;

    public DebitCard(boolean isActive,int PIN, int cardNumber, String cardHolderName, double cardBalance, double maxTransactionAmount) {
        super(isActive,PIN,cardNumber, cardHolderName, cardBalance);
        this.maxTransactionAmount = maxTransactionAmount;
    }

    public double getMaxTransactionAmount() {
        return maxTransactionAmount;
    }

    public void setMaxTransactionAmount(double maxTransactionAmount) {
        this.maxTransactionAmount = maxTransactionAmount;
    }

    public void pay(double amountPaid) {
        if (amountPaid <= maxTransactionAmount) {
            setCardBalance(getCardBalance() + amountPaid);
            //nu se va putea plati mai mult decat maxTransactionAmount
        }
    }


    public void changeTransactionLimit(double amountPaid){
            setMaxTransactionAmount(getMaxTransactionAmount()+amountPaid);
        }
        // va da o noua valoare atributului maxTransactionAmount
    }


