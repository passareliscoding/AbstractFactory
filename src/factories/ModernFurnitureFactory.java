package factories;

import chair.Chair;
import chair.ModernChair;
import coffeeTable.CoffeeTable;
import coffeeTable.ModernCoffeeTable;
import sofa.ModernSofa;
import sofa.Sofa;

public class ModernFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new ModernCoffeeTable();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }
}
