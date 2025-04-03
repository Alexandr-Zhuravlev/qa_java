import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class LionParametrizedTest {

    @Parameterized.Parameter
    public String sex;

    @Parameterized.Parameter(1)
    public boolean doesHaveMane;

    @Parameterized.Parameters
    public static Object[][] sex() {
        return new Object[][] {
                {"Самец", true},
                {"Самка", false}
        };
    }

    @Test
    public void doesHaveManeShouldReturnHaveMane() throws Exception {
        Lion lion = new Lion(sex);

        Assert.assertEquals(doesHaveMane, lion.doesHaveMane());
    }
}
