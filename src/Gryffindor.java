public class Gryffindor extends Hogwarts {

    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, int powerMagic, int distanceTransgression, int nobility, int honor, int bravery) {

        super(name, powerMagic, distanceTransgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;

    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public String toString() {

        return super.toString() + " Принадлежит факультету Грифиндор, присущи " +
                "благородство - " + nobility +
                ", честь - " + honor +
                ", храбрость - " + bravery + ".";

    }

    private int sumOfQualities() {
        return this.nobility + this.honor + this.bravery;
    }

    public String compare(Gryffindor gryffindorStudent) {

        if (this.sumOfQualities() > gryffindorStudent.sumOfQualities()) {
            return this.getName() + " лучше ученик на факультете Грифиндора, чем " + gryffindorStudent.getName() + ".";
        } else {
            return gryffindorStudent.getName() + " лучше ученик на факультете Грифиндора, чем " + this.getName() + ".";
        }

    }

}
