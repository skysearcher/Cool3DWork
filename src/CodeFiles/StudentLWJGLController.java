package CodeFiles;


//You might notice a lot of imports here.
//You are probably wondering why I didn't just import org.lwjgl.opengl.GL11.*
//Well, I did it as a hint to you.
//OpenGL has a lot of commands, and it can be kind of intimidating.
//This is a list of all the commands I used when I implemented my project.
//Therefore, if a command appears in this list, you probably need it.
//If it doesn't appear in this list, you probably don't.
//Of course, your milage may vary. Don't feel restricted by this list of imports.

import org.lwjgl.input.Keyboard;

import java.util.Iterator;

import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.util.glu.GLU.gluPerspective;

/**
 * @author Brennan Smith
 */
public class StudentLWJGLController implements CS355LWJGLController {
    CameraPosition myState = new CameraPosition();

    //This is a model of a house.
    //It has a single method that returns an iterator full of Line3Ds.
    //A "Line3D" is a wrapper class around two Point2Ds.
    //It should all be fairly intuitive if you look at those classes.
    //If not, I apologize.
    private WireFrame model = new HouseModel();

    //This method is called to "resize" the viewport to match the screen.
    //When you first start, have it be in perspective mode.
    @Override
    public void resizeGL() {
        glViewport(0, 0, 640, 480);
        glMatrixMode (GL_PROJECTION);
        glLoadIdentity ();
        gluPerspective(120f, 640f/480f, 1.5f, 25f);
        glMatrixMode(GL_MODELVIEW);
        glLoadIdentity();
        glTranslated(0.0, -2, -20);
    }

    @Override
    public void update() {

    }

    //This is called every frame, and should be responsible for keyboard updates.
    //An example keyboard event is captured below.
    //The "Keyboard" static class should contain everything you need to finish
    // this up.
    @Override
    public void updateKeyboard() {
        if (Keyboard.isKeyDown(Keyboard.KEY_W)) {
            System.out.println("You are pressing W!");
        }
        if (Keyboard.isKeyDown(Keyboard.KEY_A)) {
            System.out.println("You are pressing A!");
            glLoadIdentity();
            glTranslated(0.0, -2, -20);
        }
        if (Keyboard.isKeyDown(Keyboard.KEY_S)) {
            System.out.println("You are pressing S!");
        }
        if (Keyboard.isKeyDown(Keyboard.KEY_D)) {
            System.out.println("You are pressing D!");
        }
        if (Keyboard.isKeyDown(Keyboard.KEY_Q)) {
            System.out.println("You are pressing Q!");
        }
        if (Keyboard.isKeyDown(Keyboard.KEY_E)) {
            System.out.println("You are pressing E!");
        }
        if (Keyboard.isKeyDown(Keyboard.KEY_R)) {
            System.out.println("You are pressing R!");
        }
        if (Keyboard.isKeyDown(Keyboard.KEY_F)) {
            System.out.println("You are pressing F!");
        }
        if (Keyboard.isKeyDown(Keyboard.KEY_H)) {
            System.out.println("You are pressing H!");
        }
        if (Keyboard.isKeyDown(Keyboard.KEY_O)) {
            System.out.println("You are pressing O!");
        }
        if (Keyboard.isKeyDown(Keyboard.KEY_P)) {
            System.out.println("You are pressing P!");
        }
//        a
//        Move left
//        d
//        Move right
//        w
//        Move forward
//        s
//        Move backward
//        q
//        Turn left
//        e
//        Turn right
//        r
//        Move up
//        f
//        Move down
//        h
//        Return to the original “home” position and orientation
//                o
//        Switch to orthographic projection
//        p
//        Switch to perspective projection
    }

    //This method is the one that actually draws to the screen.
    @Override
    public void render() {
        boolean test = true;
        Line3D myLine = new Line3D(new Point3D(0, 0, 0), new Point3D(1, 1, 1));
        Point3D myStart = new Point3D(0, 0, 0);
        Point3D myEnd = new Point3D(0, 0, 0);
        //This clears the screen.
        glClear(GL_COLOR_BUFFER_BIT);
        glColor3f(1.0f, 0.2f, 0.2f);

        if (test) {
            Iterator<Line3D> myIter = model.getLines();
            glBegin(GL_LINES);
            while (myIter.hasNext()) {

//                glTranslated(20.0, 20.0, 20.0);
//                glRotated(0.0, 20.0, 20.0, 20.0);

//                glRotated(0.0, 0.0, 0.0, 0.0);
//
//                glScaled(1.0, 1.0, 1.0);

                myLine = myIter.next();
                myStart = myLine.start;
                myEnd = myLine.end;

                glVertex3d(myStart.x - 8, myStart.y , myStart.z);
                glVertex3d(myEnd.x - 8, myEnd.y , myEnd.z);
            }

            Iterator<Line3D> myIter2 = model.getLines();
            glLoadIdentity();
            while (myIter2.hasNext()) {

//                glTranslated(20.0, 20.0, 20.0);
//                glRotated(0.0, 20.0, 20.0, 20.0);

//                glRotated(0.0, 0.0, 0.0, 0.0);
//
//                glScaled(1.0, 1.0, 1.0);

                myLine = myIter2.next();
                myStart = myLine.start;
                myEnd = myLine.end;

                glVertex3d(myStart.x + 8, myStart.y , myStart.z);
                glVertex3d(myEnd.x  + 8, myEnd.y , myEnd.z);
            }
            glEnd();
        } else {
            glScaled(1.0, 1.0, 1.0);
            glRotated(0.0, 0.0, 0.0, 0.0);
            glTranslated(0.0, 0.0, 0.0);
            glMatrixMode(GL_MODELVIEW);
            glMatrixMode(GL_PROJECTION);
        }


        //Do your drawing here.
    }

}
