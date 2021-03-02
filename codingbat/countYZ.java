package codingbat;

/*
String-3 > countYZ

Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count, but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)


countYZ("fez day") → 2
countYZ("day fez") → 2
countYZ("day fyyyz") → 2
*/

class CountYZ {
  public static void main(String[] args) {

  }

  public int countYZ(String str) {
    if (str.length() == 0)
      return 0;
    int count = 0;
    // check for multiple words
    if (str.indexOf(" ") == -1) {
      if (getLastLetterInStr(str) == true) {
        return ++count;
      }
    }

    // there are multiple words
    String[] splitStr = str.split(" ");
    for (int i = 0; i < splitStr.length; i++) {
      if (getLastLetterInStr(splitStr[i]) == true)
        count++;
      else
        continue;
    }

    return count;

  }

  // helper function that takes a str & returns true or false if the last char is
  // y or z
  public boolean getLastLetterInStr(String s) {

    /*
     * 1. starting from the end of a string, check if the current char is
     * alphabetical 2. if it is, return that letter. 3. if not, search towards the
     * beginning of the string until you find an alphabetical char
     */
    for (int i = s.length() - 1; i >= 0; i--) {
      if (Character.isLetter(s.charAt(i)) == true && (s.charAt(i) == 'y' || s.charAt(i) == 'z')) {
        return true;
      }
      continue;
    }
    return false;
  }
}

/*
 * SOL 2 1. check if string is empty 2. check if there is a space present in str
 * to see if there are multiple words 3. if there's only one word, check if the
 * last char in the string is a letter. -> if not a letter, call helper to find
 * the last letter in that str -> Q will there be characters followed by a
 * number? need helper func to check if last char is alphabetic 4. if there are
 * multiple words, split the str by spaces 5. iterate the individual strings and
 * check if there end in y or z 6. increment global count variable
 * 
 * i need a function to remove non alphabetic characters from a string
 * while(Character.isLetter(str[i])){ currChar = str[i] i++ }
 */
