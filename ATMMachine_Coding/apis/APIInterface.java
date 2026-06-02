package ATMMachine_Coding.apis;

import ATMMachine_Coding.Dtos.AtmIdDTO;

public interface APIInterface {

  int createTransaction(AtmIdDTO atmIdDto);
  
} 
