import org.example.Main;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @ParameterizedTest
    @ValueSource(ints = {-10,-20,0})
    public void checkAge(int age) {
        assertEquals("Invalid age", Main.getGroupCategory(age));
    }

    @ParameterizedTest
    @ValueSource(ints = {10,17,5})
    public void checkAgeMolod(int age) {
        assertEquals("ты маленький мальчик", Main.getGroupCategory(age));
    }

    @ParameterizedTest
    @ValueSource(ints = {19,27,25})
    public void checkAgeAdult(int age) {
        assertEquals("ты взросли", Main.getGroupCategory(age));
    }

    @ParameterizedTest
    @ValueSource(ints = {92,42,75})
    public void checkAgePlesen(int age) {
        assertEquals("хайпует плесень", Main.getGroupCategory(age));
    }
}
