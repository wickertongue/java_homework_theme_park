package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {
    Playground playground;
    Visitor child;
    Visitor adult;

    @Before
    public void setUp() throws Exception {
        playground = new Playground("Fun Zone", 7);
        child = new Visitor(10,143.5, 2.50);
        adult = new Visitor(38, 175.8, 50.23);
    }

    @Test
    public void hasName() {
        assertEquals("Fun Zone", playground.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(7, playground.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, playground.getVisitCount());
    }

    @Test
    public void visitorIsAllowedInThePlayground() {
        assertEquals(true, playground.isAllowedTo(child));
    }

    @Test
    public void visitorIsNotAllowedInThePlayground() {
        assertEquals(false, playground.isAllowedTo(adult));
    }
}
