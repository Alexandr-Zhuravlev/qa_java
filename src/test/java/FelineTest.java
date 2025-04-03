import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    @Spy
    Feline feline;

    @Test
    public void getFamilyShouldReturnFelineFamily(){
        final String felineFamily = "Кошачьи";

        Assert.assertEquals(felineFamily, feline.getFamily());
    }

    @Test
    public void getKittensFelineShouldReturnKittensCount() {
        final int kittenCount = 1;

        Assert.assertEquals(kittenCount, feline.getKittens());
    }

    @Test
    public void getEatMeatShouldReturnFood() throws Exception {
        final List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");

        Assert.assertEquals(expectedFood, feline.eatMeat());
    }

}
