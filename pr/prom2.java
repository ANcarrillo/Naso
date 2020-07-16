import java.util.Scanner;


 
public final class prom2 {
 
static Scanner teclado = new Scanner(System.in);

static String[] nombres;
static double[][] n;
static double[] promedios;
 
public static void main(String[] args) {
 
System.out.print("¿Cuantas alumnos introducirá?: ");
int a = Integer.parseInt(teclado.nextLine());
 

nombres = new String[a];
n = new double[a][6]; 
promedios = new double[a];
 

for (int i = 0; i < a; i++)
{
System.out.println("\n\nDatos del alumno #" + (i+1));

System.out.print("Nombre: ");
nombres[i] = teclado.nextLine();

System.out.println("Introduzca ahora las 6 calificaciones...");
for (int j = 0; j < 6; j++)
{
System.out.print("Calificacion #" + (j+1) + ": ");
n[i][j] = Double.parseDouble(teclado.nextLine());
}

promedios[i] = calculaPromedio(n[i]);

}
 for(int i=0; i<n.length;i++){

System.out.print(nombres[i]+" ");
for(int j=0; j<n[0].length;j++){
    System.out.print(" "+n[i][j]+" ");
}

 }
 System.out.println("promedio: ");
 
for(int i=0; i<a;i++){

    System.out.print(nombres[i]+ " ");
    System.out.println(promedios[i]);
}

}
static double calculaPromedio(double[] filaCalificaciones)
{
double suma = 0;
for (int i = 0; i < n.length; i++)

    suma += filaCalificaciones[i];
 
    return suma / n.length;

}

 

}


 
