
class Circle {

    public double x;

    

   
    public void printCircle() {
        System.out.println("Окружность с центром ("+x+";"+y+") и радиусом "+r);
    }    
    
    public void moveCircle(double a, double b) {
        x = 2; 
        y = x;
    }
    
    public void zoomCircle(double k) {
        r = r * k;
    }    

}
