import java.util.Scanner;

public class prom {
    public static void main(String[] args) {
        Scanner q=new Scanner(System.in);
        double n1,n2,n3,pro;
        System.out.println("primer nota");
        n1=q.nextDouble();
        System.out.println("segunda nota");
        n2=q.nextDouble();
        System.out.println("tercera nota");
        n3=q.nextDouble();
        pro=(n1+n2+n3)/3;
        System.out.println("su promedio es: "+pro);
    }
}
