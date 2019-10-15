package stalls;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;
    Visitor child;
    Visitor adult;

    @Before
    public void setUp() throws Exception {
        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1);
        child = new Visitor(10,143.5, 2.50);
        adult = new Visitor(38, 175.8, 50.23);
    }

    @Test
    public void hasName() {
        assertEquals("Jacks Drum", tobaccoStall.getName());
    }

    @Test
    public void hasOwner() {
        assertEquals("Jack Jarvis", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(ParkingSpot.B1, tobaccoStall.getParkingSpot());
    }

    @Test
    public void visitorIsAllowedAtTobaccoStall() {
        assertEquals(true, tobaccoStall.isAllowedTo(adult));
    }

    @Test
    public void visitorIsNotAllowedAtTobaccoStall() {
        assertEquals(false, tobaccoStall.isAllowedTo(child));
    }

}
