import org.junit.*;
import static org.junit.Assert.*;

public class ReplaceAppTest {

  @Test
  public void Scrabble_SingleLetterReturnValue_True() {
    ReplaceApp getWord = new ReplaceApp();
    String expected = "-pple";
    assertEquals(expected,getWord.replaceIt("apple"));
  }
}
