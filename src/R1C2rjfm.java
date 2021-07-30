import java.util.Scanner;

public class R1C2rjfm {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de publicaciones: ");
        int cant_pub_amigo = Integer.parseInt(sc.nextLine());
        int cant_amigos = 2 * cant_pub_amigo + 4;
        int indice_calidad = (cant_amigos + cant_pub_amigo) / 5;
        System.out.println(cant_pub_amigo + " " + cant_amigos + " " + indice_calidad);
        if (0 <= indice_calidad && indice_calidad <= 20) {
            System.out.println("uno");
        } else if (21 <= indice_calidad && indice_calidad <= 30) {
            System.out.println("dos");
        } else if (31 <= indice_calidad && indice_calidad <= 50) {
            System.out.println("tres");
        } else if (51 <= indice_calidad) {
            System.out.println("cuatro");
        }

    }

}