

public class ReplaceApp {
  public static void main(String[] args) {


  }
  public String replaceIt(String word){

    char[] wordVowels = {'a','e','i','o','u'};
    String replaceA = word.replace(wordVowels[0],'-');
    String replaceE = replaceA.replace(wordVowels[1],'-');
    // String replaceI = word.replace(wordVowels[2],'-');
    // String replaceO = word.replace(wordVowels[3],'-');
    // String replaceU = word.replace(wordVowels[4],'-');
    return replaceE;

    }
  }
