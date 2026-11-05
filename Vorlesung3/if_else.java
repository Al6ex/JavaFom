public class if_else extends Tools {
    public static void main(String[] args) {
        System.out.println("Bitte drei ganze Zahlen eingeben:");
        int a = intEingabe();
        int b = intEingabe();
        int c = intEingabe();
        
        if (a > b && a > c) {
            System.out.println("Die größte Zahl ist: " + a);
        } 
        else if (b > a && b > c) {
            System.out.println("Die größte Zahl ist: " + b);
        } 
        else {
            System.out.println("Die größte Zahl ist: " + c);
        }
    }
}
