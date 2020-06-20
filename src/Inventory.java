import java.util.LinkedList;
import java.util.List;

public class Inventory {
    private List<Guitar> guitars;

    public Inventory() {
        guitars = new LinkedList<Guitar>();
    }

    public void addGuitar(String serialNumber,
                          double price,
                          Builder builder,
                          String model,
                          Type type,
                          Wood backWood,
                          Wood topWood) {
        Guitar guitar = new Guitar(serialNumber,
                                   price,
                                   builder,
                                   model,
                                   type,
                                   backWood,
                                   topWood);
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

    public List<Guitar> search(GuitarSpec searchSpec) {
        List<Guitar> matchingGuitars = new LinkedList<Guitar>();
        for (Guitar guitar : guitars) {
            GuitarSpec guitarSpec = guitar.getGuitarSpec();
            if (guitar.getGuitarSpec().getBuilder() != searchSpec.getBuilder())
                continue;
            String model = searchSpec.getModel();
            if ((model != null) && (!model.equals("")) &&
                (!model.equals(guitarSpec.getModel())))
                continue;
            if (guitarSpec.getType() != searchSpec.getType())
                continue;
            if (guitarSpec.getBackWood() != searchSpec.getBackWood())
                continue;
            if (guitarSpec.getTopWood() != searchSpec.getBackWood())
                continue;
            matchingGuitars.add(guitar);
        }
        return matchingGuitars;
    }
}
