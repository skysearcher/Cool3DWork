package CodeFiles;

/**
 * Created by Joshua on 3/5/2016.
 */
public class CameraPosition {
    private double x;
    private double y;
    private double z;
    private double angle;

    public CameraPosition(){

    }

    public CameraPosition(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
        angle = 0;
    }


    public double getAngle() {
        return angle;
    }

    public void setAngle(double angle) {
        this.angle = angle;
    }
    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }


}
