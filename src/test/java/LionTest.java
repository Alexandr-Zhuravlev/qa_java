import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;

    private final String sex = "Самец";

    @Test(expected = Exception.class)
    public void constructorWithIncorrectSexShouldThrowException() throws Exception {
        final String wrongSex = "Оно";
        Lion lion = new Lion(feline, wrongSex);

    }

    @Test
    public void getKittensLionShouldReturnKittensCount() throws Exception {
        final int kittenCount = 1;
        Lion lion = new Lion(feline, sex);

        Mockito.when(feline.getKittens()).thenReturn(kittenCount);

        Assert.assertEquals(kittenCount, lion.getKittens());
    }


    @Test
    public void getFoodLionShouldReturnListOfFood() throws Exception {
        final List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
        final String animalKind = "Хищник";
        Lion lion = new Lion(feline, sex);

        Mockito.when(feline.getFood(animalKind)).thenReturn(expectedResult);

        Assert.assertEquals(expectedResult, lion.getFood());
    }
}
