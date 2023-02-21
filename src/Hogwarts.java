public class Hogwarts {

    private String name;
    private int powerMagic;
    private int distanceTransgression;

    public Hogwarts(String name, int powerMagic, int distanceTransgression) {

        this.name = name;
        this.powerMagic = powerMagic;
        this.distanceTransgression = distanceTransgression;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPowerMagic() {
        return powerMagic;
    }

    public void setPowerMagic(int powerMagic) {
        this.powerMagic = powerMagic;
    }

    public int getDistanceTransgression() {
        return distanceTransgression;
    }

    public void setDistanceTransgression(int distanceTransgression) {
        this.distanceTransgression = distanceTransgression;
    }

    @Override
    public String toString() {

        return "Ученик Хогвардса: " +
                "имя - " + name + ", сила магии - " + powerMagic +
                ", расстояние трансгресии - " + distanceTransgression + ".";
    }

    private int sumOfQualities() {
        return this.powerMagic + this.distanceTransgression;
    }

    public String compare(Hogwarts hogwartsStudent) {

        if (this.sumOfQualities() > hogwartsStudent.sumOfQualities()) {
            return this.getName() + " лучше ученик в Хогвартсе, чем " + hogwartsStudent.getName() + ".";
        } else {
            return hogwartsStudent.getName() + " лучше ученик в Хогвартсе, чем " + this.getName() + ".";
        }

    }

}
