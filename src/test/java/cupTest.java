import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class cupTest {

  cup c = new cup("Mango juice", 90.00);

  @Test
  void getLiquidType() {
    assertEquals("Mango juice", c.getLiquidType());
  }

  @Test
  void getPercentFull() {
    assertEquals(90.00, c.getPercentFull());
  }

  @Test
  void setLiquidType() {
    c.setLiquidType("Apple");
    assertEquals("Apple", c.getLiquidType());
  }

  @Test
  void setPercentFull() {
    c.setPercentFull(89);
    assertEquals(89.00, c.getPercentFull());
  }
}
