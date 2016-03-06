package CodeFiles;

/**
 * Created by Joshua on 3/5/2016.
 */
public class ModelColor {
    private float red;
    private float green;
    private float blue;

    public ModelColor(){

    }
    public ModelColor(float red, float green, float blue){
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public float getRed() {
        return red;
    }

    public void setRed(float red) {
        this.red = red;
    }

    public float getGreen() {
        return green;
    }

    public void setGreen(float green) {
        this.green = green;
    }

    public float getBlue() {
        return blue;
    }

    public void setBlue(float blue) {
        this.blue = blue;
    }
}
