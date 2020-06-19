import java.util.LinkedList;
import java.util.List;

public class Inventory {
    private List<Guitar> guitars;

    public Inventory() {
        guitars = new LinkedList<Guitar>();
    }

    public void addGuitar(String serialNumber, double price,
                          Builder builder, String model,
                          Type type, Wood backWood, Wood topWood) {
        Guitar guitar = new Guitar(serialNumber, price, builder,
                                   model, type, backWood, topWood);
        guitars.add(guitar);
    }
    public Guitar getGuitar(String serialNumber) {
        for (Guitar guitar : guitars) {
            if (guitar.getSerialNumber().equals(serialNumber)) {
                return guitar;
            }
        }
        return null;
    }

    public List<Guitar> search(Guitar searchGuitar) {
        List<Guitar> matchingGuitars = new LinkedList<Guitar>();
        for (Guitar guitar : guitars) {
            // Ignore serial number since that's unique
            // Ignore price since that's unique
            if (guitar.getBuilder() != searchGuitar.getBuilder())
                continue;
            String model = searchGuitar.getModel();
            if ((model != null) && (!model.equals("")) &&
                (!model.equals(guitar.getModel())))
                continue;
            if (guitar.getType() != searchGuitar.getType())
                continue;
            if (guitar.getBackWood() != searchGuitar.getBackWood())
                continue;
            if (guitar.getTopWood() != searchGuitar.getBackWood())
                continue;
            matchingGuitars.add(guitar);
        }
        return matchingGuitars;
    }
}
