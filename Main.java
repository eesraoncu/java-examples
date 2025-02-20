import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the lenght of edge: ");
        float edge_a= scn.nextFloat();
        System.out.println("enter the height:");
        float edge_h= scn.nextFloat();
        float area=edge_a*edge_h/2;
        System.out.println(area);
    }
}
