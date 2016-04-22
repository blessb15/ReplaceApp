import java.util.*;
import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class ReplaceApp {
  public static void main(String[] args) {
    staticFileLocation("/public");

    get("/",(request,response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/home.vtl");
      return new ModelAndView(model, "templates/layout.vtl");
    }, new VelocityTemplateEngine());

    get("/detector",(request,response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      String userInput = request.queryParams("userinput").toLowerCase();
      ReplaceApp newApp = new ReplaceApp();
      String newReplace = newApp.replaceIt(userInput);
      model.put("newReplace", newReplace);
      model.put("template", "templates/detector.vtl");
      return new ModelAndView(model, "templates/layout.vtl");
    }, new VelocityTemplateEngine());


  }
  public String replaceIt(String word){

    char[] wordVowels = {'a','e','i','o','u'};
    String replaceA = word.replace(wordVowels[0],'-');
    String replaceAE = replaceA.replace(wordVowels[1],'-');
    String replaceAEI = replaceAE.replace(wordVowels[2],'-');
    String replaceAEIO = replaceAEI.replace(wordVowels[3],'-');
    String replaceAEIOU = replaceAEIO.replace(wordVowels[4],'-');
    return replaceAEIOU;

    }
  }
