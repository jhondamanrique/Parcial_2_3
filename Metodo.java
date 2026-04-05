
import java.util.Scanner;
import java.util.Stack;

public class Metodo {
    Scanner sc = new Scanner(System.in);
    public Stack<Dato> LlenarPila(Stack<Dato> P, int n){
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el numero [" + (i+1) + "]: ");
            int num = sc.nextInt();
            Dato d = new Dato(num);
            P.push(d);
        }
        return P;
    }

    public void MostrarPila(Stack<Dato> P){
        if (P.isEmpty()) {
            System.out.println("La pila está vacía.");
        } else {
            System.out.println("Elementos en la pila:");
            for (Dato d : P) {
                System.out.println(d);
            }
        }
    }

    public Stack<Dato> ValidarReemplazar(Stack<Dato> P){
        Stack<Dato> Aux = new Stack<>();
        int n = P.size();
        for (int i = 0; i < n; i++) {
            Dato obj = P.pop();
            int num = obj.getNumero();
            
            if (num < 0){
                obj.setNumero(0);
            }
            else if (num >= 8 && num <= 20){
                obj.setNumero(50);
            }
            else if (num == 61){
                obj.setNumero(100);
            }
            Aux.push(obj);
        }
            while (!Aux.isEmpty()){
                P.push(Aux.pop());
            }
            return P;
        }
    }
