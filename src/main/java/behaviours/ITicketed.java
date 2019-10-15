package behaviours;

import people.Visitor;

public interface ITicketed {

    public void defaultPrice();

    public void priceFor(Visitor visitor);

}
