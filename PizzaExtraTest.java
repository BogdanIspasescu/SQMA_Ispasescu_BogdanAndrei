import static org.junit.Assert.*;
import org.junit.Test;
import java.lang.IllegalArgumentException; 

public class PizzaExtraTest {

      @Test
    public void testPrice() {
        Pizza pizza = new Pizza();
        pizza.setPrice(-5);
        assertTrue("Price should not be negative", pizza.getPrice() < 0);
    }

    @Test
    public void testSize() {
        Pizza pizza = new Pizza();
        pizza.setSize(25);
        assertTrue("Should support up to family size large.", pizza.getSize() > 20);
    }
}
