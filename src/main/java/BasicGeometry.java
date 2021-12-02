import java.awt.*;


public class BasicGeometry{
    public static double calculateDistance(Point p1, Point p2){
        double Distance = 0;
        var xChange = p1.x - p2.x;
        var yChange = p1.y - p2.y;
        //x*x is more efficient than Math.Pow(x, 2)
        var intermediate = xChange*xChange + yChange*yChange; //oops
        Distance = Math.sqrt(intermediate);
        return Distance;
    }
}
