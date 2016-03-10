package CodeFiles;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Josh on 3/9/2016.
 */
public class EdgeRoadModel extends WireFrame {
    List<Line3D> lines = new ArrayList<>();
    public EdgeRoadModel(){
        lines.add(new Line3D(new Point3D(-5, 0, -5), new Point3D(-4, 0, -4.949)));
        lines.add(new Line3D(new Point3D(-4, 0, -4.949), new Point3D(-3, 0, -4.798)));
        lines.add(new Line3D(new Point3D(-3, 0, -4.798), new Point3D(-2, 0, -4.539)));
        lines.add(new Line3D(new Point3D(-2, 0, -4.539), new Point3D(-1, 0, -4.16)));
        lines.add(new Line3D(new Point3D(-1, 0, -4.16), new Point3D(0, 0, -3.66)));
        lines.add(new Line3D(new Point3D(0, 0, -3.66), new Point3D(1, 0, -3)));
        lines.add(new Line3D(new Point3D(1, 0, -3), new Point3D(2, 0, -2.14)));
        lines.add(new Line3D(new Point3D(2, 0, -2.14), new Point3D(3, 0, -1)));
        lines.add(new Line3D(new Point3D(3, 0, -1), new Point3D(4, 0, 0.641)));
        lines.add(new Line3D(new Point3D(4, 0, 0.641), new Point3D(5, 0, 5)));
    }

    @Override
    public Iterator<Line3D> getLines() {
        return lines.iterator();
    }

    public int getSize() {
        return lines.size();
    }
}
