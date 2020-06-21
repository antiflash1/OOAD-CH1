public class GuitarSpec {

    private Builder builder;
    private String model;
    private Type type;
    private int numStrings;
    private Wood backWood;
    private Wood topWood;

    public GuitarSpec(
                  Builder builder,
                  String model,
                  Type type,
                  int numStrings,
                  Wood backWood,
                  Wood topWood)
    {
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.numStrings = numStrings;
        this.backWood = backWood;
        this.topWood = topWood;
    }

    public Builder getBuilder() {
        return builder;
    }

    public String getModel() {
        return model;
    }

    public Type getType() {
        return type;

    }

    public Wood getBackWood() {
        return backWood;

    }
  
    public Wood getTopWood() {
        return topWood;
    }

    public int getNumStrings() {
        return numStrings;
    }
    @Override
    public boolean equals(Object aSpec) {
        GuitarSpec thatSpec = (GuitarSpec) aSpec;
        return thatSpec.getBuilder() == this.builder &&
            thatSpec.getModel().equals(this.model) &&
            thatSpec.getType() == this.type &&
            thatSpec.getBackWood() == this.backWood &&
            thatSpec.getTopWood() == this.topWood;
    }
    @Override
    public int hashCode() {
        return builder.hashCode() +
            model.hashCode() +
            type.hashCode() +
            backWood.hashCode() +
            topWood.hashCode();
    }
}
