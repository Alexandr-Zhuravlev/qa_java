import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import java.util.List;


public class FelineTest {


    @Test
    public void getFamilyShouldReturnFelineFamily(){
        final String felineFamily = "Кошачьи";
        Feline feline = new Feline();

        Assert.assertEquals(felineFamily, feline.getFamily());
    }

    @Test
    public void getKittensFelineShouldReturnKittensCount() {
        final int kittenCount = 1;
        Feline feline = new Feline();

        Assert.assertEquals(kittenCount, feline.getKittens());
    }

    @Test
    public void getEatMeatShouldReturnFood() throws Exception {
        final List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        Feline feline = new Feline();

        Assert.assertEquals(expectedFood, feline.eatMeat());
    }

}
