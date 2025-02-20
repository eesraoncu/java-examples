import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("kenar uzunluğunu girin:");
        float kenar_a= scn.nextFloat();
        System.out.println("yüksekliği girin:");
        float kenar_h= scn.nextFloat();
        float alan=kenar_a*kenar_h/2;
        System.out.println(alan);
    }
}