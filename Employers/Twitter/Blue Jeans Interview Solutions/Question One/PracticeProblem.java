// http://stackoverflow.com/questions/5837572/generate-a-random-point-within-a-circle-uniformly
import java.lang.Math;

public class PracticeProblem {

    public static void main(String[] args) {
        double t = 2 * Math.PI * Math.random();
        double u = Math.random() * Math.random();
        double h = 0;
        if (u > 1 ) h = 2-u;
        else h = u;
        System.out.println("(" + h*Math.cos(t) + ", " + h*Math.sin(t) + ")");
    }


}
