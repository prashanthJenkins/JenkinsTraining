import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

  private MyCalculator classUnderTest;

  @Before
  public void setUp() throws Exception {
    this.classUnderTest = new MyCalculator();
  }

  @After
  public void tearDown() throws Exception {
    classUnderTest = null;
  }

  @Test
  public void testAdd_positiveNumbers_shouldReturnResult() {
    assertEquals("add", 7, MyCalculator.add(3, 4));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testAdd_negativeNumbers_shouldThrowException() {
    classUnderTest.add(-3, -4);
  }

  @Test
  public void testSubstract() {
    assertEquals("substract", 2, classUnderTest.substract(5, 3));
  }

}