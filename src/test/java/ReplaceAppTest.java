import org.junit.*;
import static org.junit.Assert.*;

public class ReplaceAppTest {

  @Test
  public void ReplaceApp_RelaceAInWord_pple() {
    ReplaceApp getWord = new ReplaceApp();
    String expected = "-pp";
    assertEquals(expected,getWord.replaceIt("app"));
  }

  @Test
  public void ReplaceApp_ReplaceAEInWord_ppl() {
    ReplaceApp getWord = new ReplaceApp();
    String expected = "p-p-r";
    assertEquals(expected,getWord.replaceIt("paper"));
  }
}
