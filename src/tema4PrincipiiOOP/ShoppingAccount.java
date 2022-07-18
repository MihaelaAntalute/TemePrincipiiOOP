package tema4PrincipiiOOP;

public class ShoppingAccount {
    private Card[] cardList;
    private Address[] addressList;
    private String firstName;
    private String lastName;
    private double currentPaymentMethod;// poate fi de fapt un CreditCard sau un DebitCard
    private String currentBillingAddress;
    private int numberOfAddresses;

    public ShoppingAccount(Card[] cardList, Address[] addressList, String firstName, String lastName, double currentPaymentMethod, String currentBillingAddress) {
        this.cardList = cardList;
        this.addressList = addressList;
        this.firstName = firstName;
        this.lastName = lastName;
        this.currentPaymentMethod = currentPaymentMethod;
        this.currentBillingAddress = currentBillingAddress;
    }

    public Card[] getCardList() {
        return cardList;
    }

    public void setCardList(Card[] cardList) {
        this.cardList = cardList;
    }

    public Address[] getAddressList() {
        return addressList;
    }

    public void setAddressList(Address[] addressList) {
        this.addressList = addressList;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getCurrentPaymentMethod() {
        return currentPaymentMethod;
    }

    public void setCurrentPaymentMethod(double currentPaymentMethod) {
        this.currentPaymentMethod = currentPaymentMethod;
    }

    public String getCurrentBillingAddress() {
        return currentBillingAddress;
    }

    public void setCurrentBillingAddress(String currentBillingAddress) {
        this.currentBillingAddress = currentBillingAddress;
    }


    public void addPaymentMethod() {

    }

    public void addAddress(Address address) {
        addressList[numberOfAddresses]=address;
        numberOfAddresses++;
    }

    public void removePaymentMethod() {

    }

    public void removeAddress(Address address) {
        addressList[numberOfAddresses]=address;
        numberOfAddresses--;

    }

    public void selectPaymentMethod(String cardNumber) {
       // if( .getCurrentPaymentMethod() instanceof CreditCard){


        }
        // seteaza currentPaymentMethod in functie de numarul de card primit ca si parametru

    public void selectAddress(String street) {
        if(street.equals(currentBillingAddress)){
            setCurrentBillingAddress(getCurrentBillingAddress()+street);
        }
        // seteaza currentBillingAddress in functie de strada primita ca si parametru
    }

    public void generateInvoice() {
        System.out.println("Nume: "+ firstName + lastName +"."+"Ati platit suma "+"folosind cardul cu numarul "+ "pentru adresa " );

    }
//se va printa un mesaj in functie de suma, cardul si adresa cu care a fost facuta tranzactia
//de exemplu: “Nume: Olimpiu Stefan. Ati platit suma 2300 RON folosind cardul cu numarul 1234 1234 1234 1234 pentru adresa:
// str. Republicii, nr. 12, Cluj-Napoca”

}
