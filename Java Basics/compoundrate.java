public class compoundrate {
    public static void main(String args[]){
        double amount;
        double principal = 10000;
        double rate  =0.1;
        for(int day = 1; day<=30; day++){
            amount = principal * Math.pow((1 + rate/100), day);
            System.out.println(day+ " : " + amount);
        }
        
    }
}
