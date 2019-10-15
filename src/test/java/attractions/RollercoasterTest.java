package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.*;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor adult;
    Visitor child;
    Visitor short_adult;
    Visitor tall_child;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        child = new Visitor(10,143.5, 2.50);
        tall_child = new Visitor(12,200, 2.50);
        adult = new Visitor(38, 175.8, 50.23);
        short_adult = new Visitor(28, 125.8, 50.23);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void visitorIsAllowedToRideRollerCoaster() {
        assertTrue(rollerCoaster.isAllowedTo(adult));
    }

    @Test
    public void visitorIsNotAllowedToRideRollerCoaster() {
        assertFalse(rollerCoaster.isAllowedTo(child));
        assertFalse(rollerCoaster.isAllowedTo(tall_child));
        assertFalse(rollerCoaster.isAllowedTo(short_adult));
    }

}
