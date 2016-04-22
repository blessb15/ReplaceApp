import org.junit.*;
import static org.junit.Assert.*;

public class ReplaceAppTest {

  @Test
  public void ReplaceApp_RelaceAWithinWord_pple() {
    ReplaceApp getWord = new ReplaceApp();
    String expected = "-pp";
    assertEquals(expected,getWord.replaceIt("app"));
  }

  @Test
  public void ReplaceApp_ReplaceAEWithinWord_papr() {
    ReplaceApp getWord = new ReplaceApp();
    String expected = "p-p-r";
    assertEquals(expected,getWord.replaceIt("paper"));
  }

  @Test
  public void ReplaceApp_ReplaceAEIWithinWord_d() {
    ReplaceApp getWord = new ReplaceApp();
    String expected = "-d--";
    assertEquals(expected,getWord.replaceIt("idea"));
  }

  @Test
  public void ReplaceApp_ReplaceAEIOWithinWord_rng() {
    ReplaceApp getWord = new ReplaceApp();
    String expected = "-r-ng-";
    assertEquals(expected,getWord.replaceIt("orange"));
  }
}
