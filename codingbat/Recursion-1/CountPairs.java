// https://beginnersbook.com/2013/05/first-java-program/
class CountPairs {
  public static void main(String[] args) {
    System.out.println(countPairs("axa"));
  }

  public static int countPairs(String str) {
    if (str.length() <= 2) {
      return 0;
    }

    int count = 0;
    char firstCharInStr = str.charAt(0);
    char thirdCharInStr = str.charAt(2);
    String newStr = "";

    if (firstCharInStr == thirdCharInStr) {
      count++;
    }
    for (int i = 1; i < str.length(); i++) {
      newStr += str.charAt(i);
    }

    return count + countPairs(newStr);

  }
}

/*
 * 1. check if curr char is an a, then check if the char 2 indexes ahead is an x
 * 2. if yes, check if next char is another a, count++ 3. remove the first char
 */
