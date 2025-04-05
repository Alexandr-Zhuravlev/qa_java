import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class FelineParametrizedTest {

    @Parameterized.Parameter
    public int kittensCount;

    @Parameterized.Parameters
    public static Object[] count() {
        return new Object[] {1, 2};
    }

    @Test
    public void getKittensWithKittenCountShouldReturnKittensCount() {

        Feline feline = new Feline();
        Assert.assertEquals(kittensCount, feline.getKittens(kittensCount));
    }
}
