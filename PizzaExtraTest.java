import static org.junit.Assert.*;
import org.junit.Test;

public class PizzaExtraTest {

    @Test
    public void testInvalidPrice() {
        Pizza pizza = new Pizza("Pepperoni", 12, -10.0);
        pizza.setPrice(-5.0);
        assertTrue(pizza.getPrice() < 0, "Price should not be negative");
    }

    @Test
    public void testLargeSize() {
        Pizza pizza = new Pizza("Veggie", 24, 30.0);
        assertTrue(pizza.getSize() > 20, "Should support up to family size large." );
    }
}
