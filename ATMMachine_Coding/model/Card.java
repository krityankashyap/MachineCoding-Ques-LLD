package ATMMachine_Coding.model;

public class Card {
  private final long cardNumber;

  private final int pin;

  private final String name;

  private final String bankName;

  private final String cardType;

  public Card(long cardNumber, int pin, String name, String bankName, String cardType) {
    this.cardNumber = cardNumber;
    this.pin = pin;
    this.name = name;
    this.bankName = bankName;
    this.cardType = cardType;
  }

  public long getCardNumber(){
    return cardNumber;
  }

  public int getPin() {
    return pin;
  }

  public String getName() {
    return name;
  }

  public String getBankName() {
    return bankName;
  }

  public String getCardType() {
    return cardType;
  }
}
