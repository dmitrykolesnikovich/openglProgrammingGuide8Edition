import static org.lwjgl.opengl.GL11.*;

/**
 * Created by root on 5.6.17.
 */
public class Example extends AbstractExample {

    public static void main(String[] args) {
        new Example().run();
    }

    @Override
    public void tick() {
        float x = 0.2f;
        float y = 0.2f;
        float w = 0.2f;
        float h = 0.2f;
        glPushMatrix();  //Make sure our transformations don't affect any other transformations in other code
        glTranslatef(x, y, 0);  //Translate rectangle to its assigned x and y position
        //Put other transformations here
        glBegin(GL_QUADS);   //We want to draw a quad, i.e. shape with four sides
        glColor3f(1, 0, 0); //Set the colour to red 
        glVertex2f(0, 0);            //Draw the four corners of the rectangle
        glVertex2f(0, h);
        glVertex2f(w, h);
        glVertex2f(w, 0);
        glEnd();
        glPopMatrix();
    }

}
