import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int surfaceN = in.nextInt(); // the number of points used to draw the surface of Mars.
        int lastX = -1;
        int lastY = -1;
        int x = -1;
        int y = -1;



        for (int i = 0; i < surfaceN; i++) {
            int landX = in.nextInt(); // X coordinate of a surface point. (0 to 6999)
            int landY = in.nextInt(); // Y coordinate of a surface point. By linking all the points together in a sequential fashion, you form the surface of Mars.

            if (landY == lastY) {
                x = (lastX + landX)/2;
                y = lastY;
            }
            lastX = landX;
            lastY = landY;

        }
        while(true) {
            int X = in.nextInt();
            int Y = in.nextInt();
            int hSpeed = in.nextInt(); // the horizontal speed (in m/s), can be negative.
            int vSpeed = in.nextInt(); // the vertical speed (in m/s), can be negative.
            int fuel = in.nextInt(); // the quantity of remaining fuel in liters.
            int rotate = in.nextInt(); // the rotation angle in degrees (-90 to 90).
            int power = in.nextInt(); // the thrust power (0 to 4).
            int landX = lastX;
            int landY = lastY;

            // game loop

            if ((Y - y) > 100) {
                rotate = ((X - x)/100) + hSpeed * 64/100 ;
            }
            else {
                rotate = 0;
            }
            if ((vSpeed < -20) || (hSpeed*hSpeed > 1600)) {
                power = 4;
            }
            else{
                power = 2;
            }


            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");


            // rotate power. rotate is the desired rotation angle. power is the desired thrust power.
            System.out.println(rotate + " " + power);

        }

    }
}

