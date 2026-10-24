package Middle1Test;

import Middle.Middle1.Converter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConverterTest {

    Converter converter = new Converter();

    @Test
    public void testConverter() {
        double result = converter.convert("100");
        Assertions.assertEquals(8197.0, result);
    }

    @Test
    public void testExceptions() {
        Assertions.assertThrows(RuntimeException.class, () -> converter.convert("-1"));
        Assertions.assertThrows(RuntimeException.class, () -> converter.convert("Привет"));
        Assertions.assertThrows(RuntimeException.class, () -> converter.convert("()"));
    }

}
