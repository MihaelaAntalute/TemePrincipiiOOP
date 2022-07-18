package tema4PrincipiiOOP;

public abstract class Card {
    private boolean isActive;
    private int PIN;
    private int cardNumber;
    private String cardHolderName;
    private double cardBalance;

    public Card(boolean isActive, int PIN,int cardNumber, String cardHolderName, double cardBalance) {
        this.isActive = isActive;
        this.PIN = PIN;
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.cardBalance = cardBalance;
    }


    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public int getPIN() {
        return PIN;
    }

    public void setPIN(int PIN) {
        this.PIN = PIN;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public double getCardBalance() {
        return cardBalance;
    }

    public void setCardBalance(double cardBalance) {
        this.cardBalance = cardBalance;
    }

    public void changePin() {
     if()

// schimba valoarea PIN-ului, dar doar daca aceasta este o valoare formata din 4 cifre
    }

    public boolean freezeCard(boolean isActive1) {
        if(isActive1 != isActive()){
            System.out.println("Cardul este innactiv");
        }
        return false;
   //face ca cardul sa fie inactiv
    }

}
