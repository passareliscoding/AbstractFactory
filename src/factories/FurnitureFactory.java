package factories;

import chair.Chair;
import coffeeTable.CoffeeTable;
import sofa.Sofa;

public interface FurnitureFactory {
    Chair createChair();
    CoffeeTable createCoffeeTable();
    Sofa createSofa();
}
