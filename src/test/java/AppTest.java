import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class AppTest extends FluentTest {
  public WebDriver webDriver = new HtmlUnitDriver();

  @Override
  public WebDriver getDefaultDriver() {
    return webDriver;
  }

  @ClassRule
  public static ServerRule server = new ServerRule();

  @Test
  public void RootTest() {
    goTo("http://localhost:4567/");
    assertThat(pageSource()).contains("What is That Word?");
  }

  @Test
  public void RootTest2() {
    goTo("http://localhost:4567/");
    fill("#input").with("apple");
    submit(".btn");
    assertThat(pageSource()).contains("Take a Guess!");
  }

  @Test
  public void replacewordTest() {
    goTo("http://localhost:4567/");
    fill("#input").with("apple");
    submit(".btn");
    assertThat(pageSource()).contains("-ppl-");
  }
}
