package ATMMachine_Coding.state;

import ATMMachine_Coding.Enums.ATMState;
import ATMMachine_Coding.model.Card;

public interface State {
  
  int initTransaction();

  boolean readCardDetailsAndPin(Card card);  // returns true if card details and pin are correct, false otherwise

  int despenseCash(int transactionId); // returns the amount of cash dispensed for the given transaction ID

  void ejectCard();

  boolean readCashWithDrawalDetails(int transactionId, int amount); // returns true if the cash withdrawal details are valid, false otherwise

  ATMState getState();
}