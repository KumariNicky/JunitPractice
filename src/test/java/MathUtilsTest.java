import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MathUtilsTest {
  MathUtils mathUtils = new MathUtils();

  @Test
  void add() {
    assertEquals(8, mathUtils.add(3, 5));
  }

  @Test
  void subtract() {
    assertEquals(6, mathUtils.subtract(14, 8));
  }

  @Test
  void multiply() {
    assertEquals(20, mathUtils.multiply(5, 4));
  }

  @Test
  void divide() {
    assertThrows(ArithmeticException.class, () -> mathUtils.divide(1, 0));
  }

  @Test
  void computeCircleArea() {
    assertEquals(314.1592653589793238, mathUtils.computeCircleArea(10));
  }
}
