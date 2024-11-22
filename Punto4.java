
import java.util.Scanner;
import java.util.Stack;

public class Punto4 {

    public static Scanner cp = new Scanner(System.in);

    public static void main(String[] args) {

        Stack<Character> pila = new Stack<>();
        String entrada;

        System.out.println("\t\n--- Bienvenido al programa ---\n");

        while (true) {

            if (pila.isEmpty()) {
                System.out.println("Ingrese un número o un caracter para llenar la pila (escriba 'finalizar' para no agregar mas): ");
                entrada = cp.next();
            

                while (!entrada.equalsIgnoreCase("finalizar")) {
                    if (entrada.matches("[a-zA-Z0-9]{1}")) {
                        pila.push(entrada.charAt(0));

                    } else {
                        System.out.println("Entrada invalida..");
                    }

                    System.out.println("\nIngrese otro número o carácter (escriba 'finalizar' para no agregar más):");
                    entrada = cp.next();
                }
            }
            System.out.println(pila);

            System.out.println("\nIngrese el caracter o el numero que desa buscar: ");
            char caracter = cp.next().charAt(0);

            Stack<Character> pilaAux = new Stack<>();
            int aux = pila.size();
            boolean encontrado = false;
           

            for (int i = 0; i < aux ; i++) {

                
                if (pila.peek().equals(caracter)) {
                    System.out.println("\nSe ha encontrado el carácter en la pila y está en la posición: " + (aux - i));
                    encontrado = true;
                    break;
                } else {
                    pilaAux.push(pila.pop());
                   
                }
                
            }

            while (!pilaAux.isEmpty()) {
                pila.push(pilaAux.pop());
            }

            if (!encontrado) {
                System.out.println("\nEl caracter no se encuentra en la pila");
            } else {
                System.out.println("\n\t--- Vuelva pronto ---");
                break;
            }

      

        }

    }
}
