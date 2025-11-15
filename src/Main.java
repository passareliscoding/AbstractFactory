import chair.Chair;
import coffeeTable.CoffeeTable;
import factories.ArtDecoFurnitureFactory;
import factories.FurnitureFactory;
import factories.ModernFurnitureFactory;
import factories.VictorianFurnitureFactory;
import sofa.Sofa;

public class Main {

    public static void main(String[] args) {
        FurnitureFactory artDeco = new ArtDecoFurnitureFactory();
        CoffeeTable artDecoCoffeeTable = artDeco.createCoffeeTable();

        FurnitureFactory modern = new ModernFurnitureFactory();
        Sofa modernSofa = modern.createSofa();

        FurnitureFactory victorian = new VictorianFurnitureFactory();
        Chair victorianChair = victorian.createChair();
    }
}
