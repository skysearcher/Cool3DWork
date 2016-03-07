package CodeFiles;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Joshua on 3/7/2016.
 */
public class PollModel extends WireFrame{
    List<Line3D> lines = new ArrayList<>();
    public PollModel(){
//        ground
        lines.add(new Line3D(new Point3D(-1, 0, -3), new Point3D(-3, 0, -1)));
        lines.add(new Line3D(new Point3D(-3, 0, -1), new Point3D(-3, 0, 1)));
        lines.add(new Line3D(new Point3D(-3, 0, 1), new Point3D(-1, 0, 3)));
        lines.add(new Line3D(new Point3D(-1, 0, 3), new Point3D(1, 0, 3)));
        lines.add(new Line3D(new Point3D(1, 0, 3), new Point3D(3, 0, 1)));
        lines.add(new Line3D(new Point3D(3, 0, 1), new Point3D(3, 0, -1)));
        lines.add(new Line3D(new Point3D(3, 0, -1), new Point3D(1, 0, -3)));
        lines.add(new Line3D(new Point3D(1, 0, -3), new Point3D(-1, 0, -3)));

        //top
        //        ground
        lines.add(new Line3D(new Point3D(-1, 10, -3), new Point3D(-3, 10, -1)));
        lines.add(new Line3D(new Point3D(-3, 10, -1), new Point3D(-3, 10, 1)));
        lines.add(new Line3D(new Point3D(-3, 10, 1), new Point3D(-1, 10, 3)));
        lines.add(new Line3D(new Point3D(-1, 10, 3), new Point3D(1, 10, 3)));
        lines.add(new Line3D(new Point3D(1, 10, 3), new Point3D(3, 10, 1)));
        lines.add(new Line3D(new Point3D(3, 10, 1), new Point3D(3, 10, -1)));
        lines.add(new Line3D(new Point3D(3, 10, -1), new Point3D(1, 10, -3)));
        lines.add(new Line3D(new Point3D(1, 10, -3), new Point3D(-1, 10, -3)));

        //        ground
        lines.add(new Line3D(new Point3D(-1, 0, -3), new Point3D(-1, 10, -3)));
        lines.add(new Line3D(new Point3D(-3, 0, -1), new Point3D(-3, 10, -1)));
        lines.add(new Line3D(new Point3D(-3, 0, 1), new Point3D(-3, 10, 1)));
        lines.add(new Line3D(new Point3D(-1, 0, 3), new Point3D(-1, 10, 3)));
        lines.add(new Line3D(new Point3D(1, 0, 3), new Point3D(1, 10, 3)));
        lines.add(new Line3D(new Point3D(3, 0, 1), new Point3D(3, 10, 1)));
        lines.add(new Line3D(new Point3D(3, 0, -1), new Point3D(3, 10, -1)));
        lines.add(new Line3D(new Point3D(1, 0, -3), new Point3D(1, 10, -3)));
    }
    @Override
    public Iterator<Line3D> getLines() {
        return lines.iterator();
    }

    public int getSize() {
        return lines.size();
    }
}
