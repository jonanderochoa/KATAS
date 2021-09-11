import com.katasjon.fizzbuzz.FizzBuzz;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @project miKata
 * @author: jonan on 06/09/2021
 */
class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @BeforeEach
    void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    void unoTest() {
        // Arrange (Preparar)
        // Act (Actuar)
        String result = fizzBuzz.fizzBuzz(1);
        // Assert (Afirmar)
        assertEquals("1", result);
    }

    @Test
    void multiploTresTest() {
        // Arrange (Preparar)
        // Act (Actuar)
        String result = fizzBuzz.fizzBuzz(3);
        // Assert (Afirmar)
        assertEquals("Fizz", result);
    }

    @Test
    void MutiploCincoTest() {
        // Arrange (Preparar)
        // Act (Actuar)
        String result = fizzBuzz.fizzBuzz(5);
        // Assert (Afirmar)
        assertEquals("Buzz", result);
    }

    @Test
    void multiploTresYCincoTest() {
        // Arrange (Preparar)
        // Act (Actuar)
        String result = fizzBuzz.fizzBuzz(15);
        // Assert (Afirmar)
        assertEquals("com/katasjon/fizzbuzz", result);
    }

}