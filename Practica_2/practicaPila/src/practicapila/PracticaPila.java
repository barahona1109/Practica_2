
package practicapila;

import java.util.Stack;


public class PracticaPila {


    public static void main(String[] args) {
        //Con datos primitivos
        Stack<Alumno> pila = new Stack<Alumno>();
        Alumno a = new Alumno("Ariel","Fidelitas");
        Alumno b = new Alumno("Juan","Fidelitas");
        
        pila.push(a);
        pila.push(b);
        
        System.out.println(pila.peek().getNombre()+ pila.peek().getUniversidad());
        
//        for (int i = 0; i < 10; i++) {
//            pila.push(i);//Para ingresar datos a la pila
//            
//        }
//        System.out.println(pila);//Se imprime la pila completa
//        System.out.println(pila.peek());// El peek se utiliza para visualizar el ultimo elemento de la pila
//        pila.pop();//Para sacar el ultimo elemento de la pila
//        System.out.println(pila);

    }
    
}
