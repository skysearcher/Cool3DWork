package CodeFiles;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.PrimitiveIterator;

/**
 * @author Brennan Smith
 */
public abstract class WireFrame {
    private Point3D center;
    private double rotation;
    private ModelColor color;

    public Iterator<Line3D> getLines() {
        return new ArrayList<Line3D>().iterator();
    }
    public Point3D getCenter(){
        return center;
    }
    public void setCenter(Point3D point){
        center = point;
    }

    public double getRotation() {
        return rotation;
    }

    public void setRotation(double rotation) {
        this.rotation = rotation;
    }

    public ModelColor getColor() {
        return color;
    }

    public void setColor(ModelColor color) {
        this.color = color;
    }
}
