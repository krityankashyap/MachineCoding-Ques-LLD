package ATMMachine_Coding.state;

import ATMMachine_Coding.Enums.ATMState;
import ATMMachine_Coding.model.Card;

public class ReadCardDetailsAndPin implements State {  // initTranaction is done not we r in reading details state.
  
 public int initTransaction(){
  System.out.println("Transaction initialized");
  return 0;
 }

 public boolean readCardDetailsAndPin(Card card){
  System.out.println("Card details and PIN read successfully");
  return true;
 }

  public int despenseCash(int transactionId){
    throw new IllegalStateException("Cannot dispense cash while reading card details and PIN");
    
  }

  public void ejectCard(){
    throw new IllegalStateException("Cannot eject card while reading card details and PIN");
  }

  public boolean readCashWithDrawalDetails(int transactionId, int amount){
    throw new IllegalStateException("Cannot read cash withdrawal details while reading card details and PIN");
  }

  public ATMState getState(){
    return ATMState.READ_CARD_DETAILS_AND_PIN;
  }
 
}
