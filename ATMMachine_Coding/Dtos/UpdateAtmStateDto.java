package ATMMachine_Coding.Dtos;

import ATMMachine_Coding.Enums.ATMState;

public class UpdateAtmStateDto {
  
  private final String atmId;
  private final ATMState state;

  public UpdateAtmStateDto(String atmId, ATMState state) {
    this.atmId= atmId;
    this.state= state;
  }

  public String getAtmId() {
    return atmId;
  }

  public ATMState getState() {
    return state;
  }
}
