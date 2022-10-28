/*
 * The "key" array is an array containing the correct answers to an exam, like
 * {"a", "a", "b", "b"}. the "answers" array contains a student's answers, with
 * "?" representing a question left blank. The two arrays are not empty and are
 * the same length. Return the score for this array of answers, giving +4 for
 * each correct answer, -1 for each incorrect answer, and +0 for each blank answer.
 */

public int scoreUp(String[] key, String[] answers) {
  int score = 0;
  
  // Go over the answers array, seeing how the student scores
  for(int i = 0; i < answers.length; i++){
    if(answers[i] != key[i] && answers[i] != "?")
      score--;
    if(answers[i] == key[i])
      score += 4;
  }
  
  // Return the score
  return score;
}
