package ATMMachine_Coding.state;

import ATMMachine_Coding.Dtos.AtmIdDTO;
import ATMMachine_Coding.Enums.ATMState;
import ATMMachine_Coding.apis.APIInterface;
import ATMMachine_Coding.model.ATM;
import ATMMachine_Coding.model.Card;

public class ReadyForTransaction implements State {  // While Ready-for-transaction only init method should be performed
  
  private final ATM atm;
  private final APIInterface MachineApi;

  public ReadyForTransaction(ATM atm, APIInterface ATMMachineApi){
    this.atm= atm;
    this.MachineApi= ATMMachineApi;
  }

  @Override
	public int initTransaction() {
    AtmIdDTO atmIdDTO= new AtmIdDTO(atm.getAtmId());  // Creating AtmIdDTO object using the ATM ID from the ATM model
    int newTxnId= this.MachineApi.createTransaction(atmIdDTO); // Calling the createTransaction method of the ATMMachineApi to create a new transaction and get the transaction ID
		return newTxnId;  // Returning the transaction ID to the caller
	}

	@Override
	public ATMState getState() {
    return ATMState.READY_FOR_TRANSACTION;
		
	}

	@Override
	public boolean readCashWithDrawalDetails(int amount, int accountNumber) {
		throw new UnsupportedOperationException("readCashWithDrawalDetails is not supported in ReadyForTransaction state");
	}

	@Override
	public void ejectCard() {
		// Implementation for ejectCard
	}

	@Override
	public boolean readCardDetailsAndPin(Card card) {
		throw new UnsupportedOperationException("readCardDetailsAndPin is not supported in ReadyForTransaction state");
	}

	@Override
	public int despenseCash(int amount) {
		throw new UnsupportedOperationException("despenseCash is not supported in ReadyForTransaction state");
	}
}
