package factories;

import chair.ArtDecoChair;
import chair.Chair;
import coffeeTable.ArtDecoCoffeeTable;
import coffeeTable.CoffeeTable;
import sofa.ArtDecoSofa;
import sofa.Sofa;

public class ArtDecoFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ArtDecoChair();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new ArtDecoCoffeeTable();
    }

    @Override
    public Sofa createSofa() {
        return new ArtDecoSofa();
    }
}
