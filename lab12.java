import mycal.mycalculator;

public class lab12 {
    public static void main(String[] args) {
        mycalculator cal=new mycalculator();
        System.out.println("addition="+cal.add(5, 3));
        System.out.println("subrataction="+cal.subtract(5, 3));
        System.out.println("multiplication="+cal.multiply(5, 3));
        System.out.println("division="+cal.divide(5, 3));
    } 
}