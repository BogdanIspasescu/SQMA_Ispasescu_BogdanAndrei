// PizzaTest.java
import static org.junit.Assert.*;

public class PizzaTest {

    @Test
    public void testCalculatePricePerInch() {
        Pizza pizza = new Pizza("Pepperoni", 12, 18.0);
        assertEquals(1.5, pizza.calculatePricePerInch());

        Pizza smallPizza = new Pizza("Cheese", 8, 12.0);
        assertEquals(1.5, smallPizza.calculatePricePerInch());

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Pizza invalidPizza = new Pizza("Veggie", 0, 10.0);
            invalidPizza.calculatePricePerInch();
        });
        assertEquals("Size must be greater than 0", exception.getMessage());
    }

    @Test
    public void testGettersAndSetters() {
        Pizza pizza = new Pizza("Margherita", 10, 15.0);
        assertEquals("Margherita", pizza.getType());
        assertEquals(10, pizza.getSize());
        assertEquals(15.0, pizza.getPrice());

        pizza.setType("BBQ Chicken");
        pizza.setSize(14);
        pizza.setPrice(20.0);

        assertEquals("BBQ Chicken", pizza.getType());
        assertEquals(14, pizza.getSize());
        assertEquals(20.0, pizza.getPrice());
    }
}
