
class Circle {

    public double x; 
    public double y; 
    

   
    public void printCircle() {
        System.out.println("Окружность с центром ("+x+";"+y+") и радиусом "+r);
    }    
    
    public void moveCircle(double a, double b) {
        x = x + a;
        y = y + b;
    }
    
    public void zoomCircle(double k) {
        r = r * k;
    }    

}