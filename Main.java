import java.util.Scanner;

/*
-Loop break
-Search for a String and determine if it cointains the letter 'A'
*/

class Main {
  public static void main(String[] args) {

      //Get text
      System.out.println("Enter a word");
      Scanner scanner = new Scanner(System.in);
      String word = scanner.next();
      scanner.close();

      //Search for the letter 'A'
      for(int i=0; i<word.length(); i++)
        char letter = word;
        System.out.println("The letter is: " + letter);

  }
}
