package ATMMachine_Coding.model;

import java.lang.Thread.State;

import ATMMachine_Coding.Dtos.UpdateAtmStateDto;
import ATMMachine_Coding.apis.APIInterface;
import ATMMachine_Coding.apis.ATMMachineApi;
import ATMMachine_Coding.state.ReadyForTransaction;

public class ATM {

  private final String atmId;

  private ReadyForTransaction state;

  private final APIInterface atmMachineApiState;

  public ATM(String atmId){
    this.atmId= atmId;
    this.atmMachineApiState= new ATMMachineApi();
    this.state = new ReadyForTransaction(this, this.atmMachineApiState);
  }

  public String getAtmId(){
    return atmId;
  }

  public void changeState(ReadyForTransaction newState){  // this function should be capable to calling our api to update the state in the backend as well as updating the state in the ATM model.
    this.state = newState;

    // now call the server to persist the state change in the backend as well.
    this.atmMachineApiState.updateState(new UpdateAtmStateDto(this.atmId, newState.getState()));
     
  }
  
}
