import org.junit.Test;

import java.awt.*;

public class GeometryTest{
    @Test
    public void testDistance(){
        Point p1 = new Point(0, 3);
        Point p2 = new Point(4, 0);
        assert BasicGeometry.calculateDistance(p1, p2) == 5;
        assert true;
    }
    @Test
    public void testZeroDistance(){
        var p1 = new Point(23, 546);
        var p2 = new Point(23, 546);
        assert BasicGeometry.calculateDistance(p1, p2) == 0;
    }
}
