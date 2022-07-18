package tema4PrincipiiOOP;

public abstract class CreditCard extends Card implements Payable{
    private final double maxOverDraft; //nu se va putea schimba valoarea acestui atribut

    public CreditCard(boolean isActive, int PIN,int cardNumber, String cardHolderName, double cardBalance, double maxOverDraft) {
        super(isActive, PIN, cardNumber, cardHolderName, cardBalance);
        this.maxOverDraft = maxOverDraft;
    }

    public double getMaxOverDraft() {
        return maxOverDraft;
    }

    public void pay(double amountPaid){
        setCardBalance(getCardBalance()+maxOverDraft);
   //nu se va putea plati mai mult decat cardBalance + maxOverDraft
    }



}
