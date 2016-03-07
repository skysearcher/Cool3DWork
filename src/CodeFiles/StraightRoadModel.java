package CodeFiles;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Joshua on 3/7/2016.
 */
public class StraightRoadModel extends WireFrame {
    List<Line3D> lines = new ArrayList<>();
    public StraightRoadModel(){
//        ground
        lines.add(new Line3D(new Point3D(-5, 0, -5), new Point3D(-5, 0, 5)));
        lines.add(new Line3D(new Point3D(5, 0, 5), new Point3D(5, 0, -5)));
        lines.add(new Line3D(new Point3D(0, 0, -5), new Point3D(0, 0, -4)));
        lines.add(new Line3D(new Point3D(0, 0, -3), new Point3D(0, 0, -2)));
        lines.add(new Line3D(new Point3D(0, 0, -1), new Point3D(0, 0, 0)));
        lines.add(new Line3D(new Point3D(0, 0, 1), new Point3D(0, 0, 2)));
        lines.add(new Line3D(new Point3D(0, 0, 3), new Point3D(0, 0, 4)));


    }
    @Override
    public Iterator<Line3D> getLines() {
        return lines.iterator();
    }

    public int getSize() {
        return lines.size();
    }
}
