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
import org.lwjgl.input.Mouse;

import java.util.Iterator;
import java.util.List;

import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.util.glu.GLU.gluPerspective;

/**
 * @author Brennan Smith
 */
public class StudentLWJGLController implements CS355LWJGLController {
    private CameraPosition myCamera;
    private double moveFactor;
    private double rotateFactor;
    private double xAdd;
    private double zAdd;
    private int width;
    private int height;
    private TownModel myTown;
    private int boxSize;
    private int spacing;
    public StudentLWJGLController(){
        width = 1280;
        height = 720;
        myCamera = new CameraPosition();
        moveFactor = 5;
        rotateFactor = 2;
        boxSize = 100;
        spacing = 30;
        myTown = new TownModel();
        generateTown();
    }
    public void generateTown(){
        WireFrame addModel = new HouseModel();
//        addModel.setCenter(new Point3D(15, 0, -10));
//        addModel.setColor(new ModelColor(1.0f, 0.5f, 0.5f));
//        myTown.addModel(addModel);
//        addModel = new HouseModel();
//        addModel.setCenter(new Point3D(30, 0, -10));
//        addModel.setColor(new ModelColor(0.5f, 0.5f, 0.5f));
//        myTown.addModel(addModel);
//        addModel = new HouseModel();
//        addModel.setCenter(new Point3D(0, 0, -10));
//        addModel.setColor(new ModelColor(0.5f, 0.5f, 1.0f));
//        myTown.addModel(addModel);
        for(int i = 0; i < boxSize; i++){
            for(int j = 0; j < 1; j++){
                for(int k = 0; k < boxSize; k++){
                    addModel = new HouseModel();
                    addModel.setCenter(new Point3D(spacing * i, spacing * j, -spacing* k));
                    addModel.setColor(new ModelColor(0.5f, 0.5f, 1.0f));
                    myTown.addModel(addModel);
                }
            }
        }
    }


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
        glViewport(0, 0, width, height);
        glMatrixMode (GL_PROJECTION);
        glLoadIdentity ();
        gluPerspective(90f, ((float)width)/((float)height), 0.5f, 10000f);
        glMatrixMode(GL_MODELVIEW);
        glLoadIdentity();
        myCamera.setY(-2);
        glTranslated(myCamera.getX(), myCamera.getY(), myCamera.getZ());
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
            glLoadIdentity();
            xAdd = (moveFactor)*Math.sin(Math.toRadians(myCamera.getAngle()));
            zAdd = (moveFactor)*Math.cos(Math.toRadians(myCamera.getAngle()));
            myCamera.setX(myCamera.getX() - xAdd);
            myCamera.setZ(myCamera.getZ() + zAdd);
            glRotated(myCamera.getAngle(), 0, 1, 0);
            glTranslated(myCamera.getX(), myCamera.getY(), myCamera.getZ());
        }
        if (Keyboard.isKeyDown(Keyboard.KEY_S)) {
            glLoadIdentity();
            xAdd = (moveFactor)*Math.sin(Math.toRadians(myCamera.getAngle()));
            zAdd = (moveFactor)*Math.cos(Math.toRadians(myCamera.getAngle()));
            myCamera.setX(myCamera.getX() + xAdd);
            myCamera.setZ(myCamera.getZ() - zAdd);
            glRotated(myCamera.getAngle(), 0, 1, 0);
            glTranslated(myCamera.getX(), myCamera.getY(), myCamera.getZ());
        }
        if (Keyboard.isKeyDown(Keyboard.KEY_A)) {
            glLoadIdentity();
            xAdd = (moveFactor)*Math.cos(Math.toRadians(myCamera.getAngle()));
            zAdd = (moveFactor)*Math.sin(Math.toRadians(myCamera.getAngle()));
            myCamera.setX(myCamera.getX() + xAdd);
            myCamera.setZ(myCamera.getZ() + zAdd);
            glRotated(myCamera.getAngle(), 0, 1, 0);
            glTranslated(myCamera.getX(), myCamera.getY(), myCamera.getZ());
        }

        if (Keyboard.isKeyDown(Keyboard.KEY_D)) {
            glLoadIdentity();
            xAdd = (moveFactor)*Math.cos(Math.toRadians(myCamera.getAngle()));
            zAdd = (moveFactor)*Math.sin(Math.toRadians(myCamera.getAngle()));
            myCamera.setX(myCamera.getX() - xAdd);
            myCamera.setZ(myCamera.getZ() - zAdd);
            glRotated(myCamera.getAngle(), 0, 1, 0);
            glTranslated(myCamera.getX(), myCamera.getY(), myCamera.getZ());
        }
        if (Keyboard.isKeyDown(Keyboard.KEY_Q)) {
            glLoadIdentity();
            myCamera.setAngle(myCamera.getAngle() - rotateFactor);
            glRotated(myCamera.getAngle(), 0, 1, 0);
            glTranslated(myCamera.getX(), myCamera.getY(), myCamera.getZ());
        }
        if (Keyboard.isKeyDown(Keyboard.KEY_E)) {
            glLoadIdentity();
            myCamera.setAngle(myCamera.getAngle() + rotateFactor);
            glRotated(myCamera.getAngle(), 0, 1, 0);
            glTranslated(myCamera.getX(), myCamera.getY(), myCamera.getZ());
        }
        if (Keyboard.isKeyDown(Keyboard.KEY_R)) {
            glLoadIdentity();
            myCamera.setY(myCamera.getY() - moveFactor);
            glRotated(myCamera.getAngle(), 0, 1, 0);
            glTranslated(myCamera.getX(), myCamera.getY(), myCamera.getZ());
//            System.out.println("You are pressing R!");
        }
        if (Keyboard.isKeyDown(Keyboard.KEY_F)) {
            glLoadIdentity();
            myCamera.setY(myCamera.getY() + moveFactor);
            glRotated(myCamera.getAngle(), 0, 1, 0);
            glTranslated(myCamera.getX(), myCamera.getY(), myCamera.getZ());
//            System.out.println("You are pressing F!");
        }
        if (Keyboard.isKeyDown(Keyboard.KEY_H)) {
            myCamera = new CameraPosition(0, -2, -6.5);
            glLoadIdentity();
            glRotated(myCamera.getAngle(), 0, 1, 0);
            glTranslated(myCamera.getX(), myCamera.getY(), myCamera.getZ());
        }
        if (Keyboard.isKeyDown(Keyboard.KEY_O)) {
            glMatrixMode (GL_PROJECTION);
            glLoadIdentity ();
            glOrtho(-10.0, 10.0, -10.0, 10.0, 1.0, 25.0);
            glMatrixMode(GL_MODELVIEW);
        }
        if (Keyboard.isKeyDown(Keyboard.KEY_P)) {
            glMatrixMode (GL_PROJECTION);
            glLoadIdentity ();
            gluPerspective(90f, ((float)width)/((float)height), 0.5f, 25f);
            glMatrixMode(GL_MODELVIEW);
        }

    }

    //This method is the one that actually draws to the screen.
    @Override
    public void render() {
        boolean test = false;
        Line3D myLine = new Line3D(new Point3D(0, 0, 0), new Point3D(1, 1, 1));
        Point3D myStart = new Point3D(0, 0, 0);
        Point3D myEnd = new Point3D(0, 0, 0);
        //This clears the screen.
        glClear(GL_COLOR_BUFFER_BIT);
        glBegin(GL_LINES);

        if (test) {
            Iterator<Line3D> myIter = model.getLines();
            glColor3f(1.0f, 0.2f, 0.2f);
            while (myIter.hasNext()) {
                myLine = myIter.next();
                myStart = myLine.start;
                myEnd = myLine.end;

                glVertex3d(myStart.x, myStart.y , myStart.z);
                glVertex3d(myEnd.x, myEnd.y , myEnd.z);
            }
            glEnd();
        } else {
            List<WireFrame> myModels = myTown.getModels();
            for(int i = 0; i < myModels.size(); i++){
                WireFrame aModel = myModels.get(i);
                glColor3f(aModel.getColor().getRed(), aModel.getColor().getBlue(), aModel.getColor().getBlue());

                Iterator<Line3D> myIter = aModel.getLines();
                Point3D myCenter = aModel.getCenter();

                while (myIter.hasNext()) {
                    myLine = myIter.next();
                    myStart = myLine.start;
                    myEnd = myLine.end;

                    glVertex3d(myStart.x + myCenter.x, myStart.y + myCenter.y, myStart.z + myCenter.z);
                    glVertex3d(myEnd.x + myCenter.x, myEnd.y + myCenter.y, myEnd.z + myCenter.z);
                }
            }
            glEnd();
        }


        //Do your drawing here.
    }

}
