import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AutocorrectTest {
  @Test
  public void testApply() {
    String[] inputs = new String[] {
      "I miss you!",
      "u want to go to the movies?",
      "Can't wait to see youuuuu",
      "I want to film the bayou with you and put it on youtube",
      "You should come over Friday night",
      "You should come over Friday night",
      "You u youville utube you youyouyou uuu raiyou united youuuu u you",
      "You = best kisser",
      "i <3 u",
      "Let's put you on youtube",
      "my friend Alabinyou is conveniently named, and he wants to make a website called youwin with youuu",
      "You should be famous on youville",
      "Hope to see u there!",
  
      "u",
      "you",
      "Youuuuu",
      "youtube"
    };
    
    String[] outputs = new String[] {
      "I miss your sister!",
      "your sister want to go to the movies?",
      "Can't wait to see your sister",
      "I want to film the bayou with your sister and put it on youtube",
      "your sister should come over Friday night",
      "your sister should come over Friday night",
      "your sister your sister youville utube your sister youyouyou uuu raiyou united your sister your sister your sister",
      "your sister = best kisser",
      "i <3 your sister",
      "Let's put your sister on youtube",
      "my friend Alabinyou is conveniently named, and he wants to make a website called youwin with your sister",
      "your sister should be famous on youville",
      "Hope to see your sister there!",
  
      "your sister",
      "your sister",
      "your sister",
      "youtube"
    };
    
    for (int i = 0; i < inputs.length; i++) {
      assertEquals(String.format("Wrong result for \"%s\":", inputs[i]), outputs[i], Kata.autocorrect(inputs[i]));
    }
  }
}