package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class DodgemTest {

    Dodgems dodgems;
    Visitor adult;
    Visitor child;
    Visitor short_adult;
    Visitor tall_child;
    Visitor tall_adult;

    @Before
    public void setUp() throws Exception {
        dodgems = new Dodgems("Bumper Cars", 5);
        child = new Visitor(10,143.5, 2.50);
        tall_child = new Visitor(12,200, 2.50);
        adult = new Visitor(38, 175.8, 50.23);
        tall_adult = new Visitor(38, 250, 50.23);
        short_adult = new Visitor(28, 125.8, 50.23);
    }


    @Test
    public void hasName() {
        assertEquals("Bumper Cars", dodgems.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(5, dodgems.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, dodgems.getVisitCount());
    }

    @Test
    public void canGetDefaultPriceForDodgems() {
        assertEquals(4.50, dodgems.defaultPrice(), 1);
    }

    @Test
    public void chargeForAverageSizedAdultOnRollerCoaster() {
        assertEquals(4.50, dodgems.priceFor(adult), 1);
        assertEquals(2.25, dodgems.priceFor(child), 1);
    }

}
