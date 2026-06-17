import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        final double SALARIO_BASE = 1000;
        final double COMISION_AUTO = 150;

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese cantidad de autos vendidos: ");
        int autosVendidos = sc.nextInt();

        System.out.print("Ingrese valor total de las ventas: ");
        double totalVentas = sc.nextDouble();

        double comision = autosVendidos * COMISION_AUTO;
        double extra = totalVentas * 0.05;

        double salarioFinal = SALARIO_BASE + comision + extra;

        System.out.println("El salario mensual es: $" + salarioFinal);

        sc.close();
    }
}