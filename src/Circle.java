import java.awt.geom.QuadCurve2D;

public class Circle {


    private double pi;
    private double radius = 3.5;
   public  Circle( double pi, double radius){
       this.pi=pi;
       this.radius = radius;

   }
   public static void area(double pi, double radius){

       System.out.println("Плошадь круга "+pi*(radius*radius));


   }
   public static void circumforence(double pi,double radius){
       System.out.println(("длина: "+pi*2*radius));
   }




    public void setPi(double pi) {
        this.pi = pi;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "pi=" + pi +
                ", radius=" + radius +
                '}';
    }

    public double getPi(){
       return  pi;



   }
}






