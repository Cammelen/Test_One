import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass {

    @Test
    public void testGetClassNumber() {

        String expected = "Подстрока есть";
        String actual = getClassString();
        Assert.assertTrue("Подстрока \"Hello\" или \"hello\" отсутствует: вернулось " + "\"" + actual + "\"",
                expected == actual);
    }
}