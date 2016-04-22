import java.util.ArrayList;
import java.util.HashMap;

public class Scrabble {
  public static void main(String[] args) {}

  HashMap<String, Integer> values = new HashMap<String, Integer>();

  public Object getScore(String words){
    values.put("aeiounrst", 1);
    values.put("dg", 2);
    values.put("bcmp", 3);
    values.put("fhvwy", 4);
    values.put("k", 5);
    values.put("jx", 8);
    values.put("qz", 10);
    char[] wordtoChar = words.toCharArray();
    Integer total = 0;

    for (Integer index = 0; index < wordtoChar.length; index++){
      for (String key : values.keySet()){
        if(key.indexOf(String.valueOf(wordtoChar[index])) >= 0){
          total += values.get(key);
        }
      }
    }
    return total;
  }
}
