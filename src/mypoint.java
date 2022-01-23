import java.util.Comparator;

public class mypoint implements Comparable<mypoint> {

    double x;
    double y;

    public mypoint(double x, double y){
        this.x=x;
        this.y=y;
    }

    @Override
    public int compareTo(mypoint o) {
        int big = -1, les = 1;
        // dist from 0,0
        return Math.sqrt(Math.pow(x,2) + Math.pow(y,2)) > Math.sqrt(Math.pow(o.x,2) + Math.pow(o.y,2)) ? big : les;

    }


    public String toString(){
        return ("x is : "+ this.x + ", y is "  + this.y);
    }

}
