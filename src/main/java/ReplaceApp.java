

public class ReplaceApp {
  public static void main(String[] args) {


  }
  public String replaceIt(String word){

    char[] wordVowels = {'a','e','i','o','u'};
    String replaceA = word.replace(wordVowels[0],'-');
    String replaceAE = replaceA.replace(wordVowels[1],'-');
    String replaceAEI = replaceAE.replace(wordVowels[2],'-');
    String replaceAEIO = replaceAEI.replace(wordVowels[3],'-');
    // String replaceAEIOU = replaceAEIO.replace(wordVowels[4],'-');
    return replaceAEIO;

    }
  }
