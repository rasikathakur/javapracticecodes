
import java.util.*;
class Main {
    
    public static void main(String[] args) {
        float towerheight=100.0f;
        float height = 0.2f;
        float length = 0.4f;
        
        double numberofsteps = Math.ceil(towerheight/height);
        double verticaldistance = towerheight;
        double horizontaldistance = numberofsteps*length;
        int totaldistance = (int) (verticaldistance + horizontaldistance);
        
        System.out.println("Try programiz.pro"+totaldistance);
        
    }
}
