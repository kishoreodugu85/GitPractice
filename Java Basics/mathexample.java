public class mathexample{
    public static void main(String args[]){
        double x = 30;
        double y = 3;
        System.out.println("Maximum number of X and Y : " + Math.max(x, y));
        System.out.println("Square root of x is : " + Math.sqrt(x));
        System.out.println("Power of x and y is : " + Math.pow(x,y));
        System.out.println("Logaritham of X is : " + Math.log(x));
        System.out.println("Logaritham of Y is : " + Math.log(y));
        System.out.println("log10 of x : " + Math.log10(x));
        // return the log of x+1
        System.out.println("log of the x+1 : " + Math.log1p(x) );
        // 
        System.out.println("exp of x is: " + Math.exp(x));
        //
        System.out.println("exp of x is: " + Math.expm1(x));
    }
}