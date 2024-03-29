/*
 * Your cell phone rings. Return true if you should answer it. Normally you
 * answer, except in the morning you only answer if it is your mom calling.
 * In all cases, if you are asleep, you do not answer.
 */

public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
  // ifAsleep, or if isMorning and it is not mom calling, return false
  if(isAsleep || (isMorning && !isMom)) 
    return false;
  
  // In all other cases, you would pick up the phone. Return true
  return true;
}
