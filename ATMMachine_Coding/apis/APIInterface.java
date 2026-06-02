package ATMMachine_Coding.apis;

import ATMMachine_Coding.Dtos.AtmIdDTO;
import ATMMachine_Coding.Dtos.UpdateAtmStateDto;

public interface APIInterface {

  int createTransaction(AtmIdDTO atmIdDto);

  boolean updateState(UpdateAtmStateDto updateAtmState);
  
} 
