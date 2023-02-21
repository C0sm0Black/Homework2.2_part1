public class Hufflepuff extends Hogwarts {

    private int industriousness;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, int powerMagic, int distanceTransgression, int industriousness, int loyalty,
                      int honesty) {

        super(name, powerMagic, distanceTransgression);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;

    }

    public int getIndustriousness() {
        return industriousness;
    }

    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public String toString() {

        return super.toString() + " Принадлежит факультету Пуффендуй, присущи " +
                "трудолюбие - " + industriousness +
                ", верность - " + loyalty +
                ", честность - " + honesty + ".";

    }

    private int sumOfQualities() {
        return this.industriousness + this.loyalty + this.honesty;
    }

    public String compare(Hufflepuff hufflepuffStudent) {

        if (this.sumOfQualities() > hufflepuffStudent.sumOfQualities()) {
            return this.getName() + " лучше ученик на факультете Грифиндора, чем " + hufflepuffStudent.getName() + ".";
        } else {
            return hufflepuffStudent.getName() + " лучше ученик на факультете Пуффендуй, чем " + this.getName() + ".";
        }

    }

}
