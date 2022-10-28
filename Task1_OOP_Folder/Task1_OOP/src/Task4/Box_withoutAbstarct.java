package Task4;

public class Box_withoutAbstarct extends Shape_withAbstarct {

    public boolean add(Shape_withAbstarct shape) {
        if (this.getVolume() < shape.getVolume()) {
            return false;
        } else {
            double freeVolume = this.getVolume() - shape.getVolume();
            this.setVolume(freeVolume);
            return true;
        }
    }
}
