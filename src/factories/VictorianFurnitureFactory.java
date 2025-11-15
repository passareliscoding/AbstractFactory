package factories;

import chair.Chair;
import chair.VictorianChair;
import coffeeTable.CoffeeTable;
import coffeeTable.VictorianCoffeeTable;
import sofa.Sofa;
import sofa.VictorianSofa;

public class VictorianFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new VictorianCoffeeTable();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }
}
