public enum Builder {
    COLLINGS, FENDER, MARTIN, GIBSON, OLSON, PRS, RYAN, ANY;

    @Override
    public String toString() {
        switch (this) {
            case COLLINGS:
                return "Collings";
            case FENDER:
                return "Fender";
            case MARTIN:
                return "Martin";
            case GIBSON:
                return "Gibson";
            case OLSON:
                return "Olson";
            case PRS:
                return "PRS";
            case RYAN:
                return "Ryan";
            case ANY:
                return "Any";
        }
        return null;
    }
}
