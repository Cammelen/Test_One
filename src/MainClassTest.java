import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass {

    @Test
    public void testGetClassNumber() {

        int actual = getClassNumber();
        Assert.assertTrue("Возвращается число меньше или равное 45: вернулось " + actual ,  + 45 <= actual);
    }
}