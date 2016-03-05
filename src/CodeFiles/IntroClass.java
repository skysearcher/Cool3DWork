package CodeFiles;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

/**
 * Created by Joshua on 3/4/2016.
 */
public class IntroClass {
    public static void main(String args[]){
        IntroClass myClass = new IntroClass();
        myClass.runGl();

    }

    public void runGl(){
        try {
            Display.setDisplayMode(new DisplayMode(800, 600));
            Display.create();
            while(!Display.isCloseRequested()) {
                Display.update();
            }
            Display.destroy();
        } catch(LWJGLException e) {
            e.printStackTrace();
        }
    }
}
