import java.util.ArrayList;
import java.util.Scanner;

public class WordCount {
  ArrayList<String> words;

  public WordCount() {
    words = new ArrayList<>();
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Type or paste your text: ");
    String paragraph = scanner.nextLine();
    String[] words = paragraph.split(" ");
    System.out.println("Number of words are: " + words.length);
  }


}
