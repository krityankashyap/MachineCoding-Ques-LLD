package ATMMachine_Coding.apis;

import ATMMachine_Coding.Dtos.AtmIdDTO;
import ATMMachine_Coding.Dtos.UpdateAtmStateDto;

public class ATMMachineApi implements APIInterface{
  // this is only responsible for connecting to the backend and get response from it

  public int createTransaction(AtmIdDTO atmIdDto){

    // 1) Validation for atmId

    if(atmIdDto.getAtmId() == null || atmIdDto.getAtmId().isEmpty()){
      throw new IllegalArgumentException("Invalid ATM ID");
    }

    // 2) Connect to backend and create transaction and get transaction id
    int newTransactionId= (int)(Math.random()*100000); // Simulating transaction ID generation


    // 3) Return the transaction ID
    return newTransactionId;
  }
  
  @Override
  public boolean updateState(UpdateAtmStateDto updateAtmState){
    // Assume we have some logics to change this state

    return true;
  }

}
