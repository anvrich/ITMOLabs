package Person;
public class Location {
    private Float x;
    private Double y;
    private Float z;

    public Location(Float x, Double y, Float z) {
        if (x == null) {
            throw new IllegalArgumentException("Invalid arguments for Location");
        }
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Float getX() {
        return x;
    }

    public Double getY() {
        return y;
    }

    public Float getZ() {
        return z;
    }


}

