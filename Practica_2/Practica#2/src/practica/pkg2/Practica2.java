
package practica.pkg2;

import java.util.Stack;


public class Practica2 {

   
    public static void main(String[] args) {
        Stack<String> pilaLetras = new Stack<>();
        String MyWord = "hey jude!";
        for (int i = 0; i < MyWord.length(); i++) {
            char letra = MyWord.charAt(i);
            pilaLetras.push(String.valueOf(letra));
            System.out.println(pilaLetras.peek());
            
        }
        String MyWord1 = "Kashmere";
        for (int i = 0; i < MyWord1.length(); i++) {
            char letra = MyWord1.charAt(i);
            pilaLetras.push(String.valueOf(letra));
            System.out.println(pilaLetras.peek());
            
        }
        String MyWord2 = "##Mary had a Little Lamb!%^";
        for (int i = 0; i < MyWord2.length(); i++) {
            char letra = MyWord2.charAt(i);
            pilaLetras.push(String.valueOf(letra));
            System.out.println(pilaLetras.peek());
            
        }
        String MyWord3 = "Error 404 Page not Found!";
        for (int i = 0; i < MyWord3.length(); i++) {
            char letra = MyWord3.charAt(i);
            pilaLetras.push(String.valueOf(letra));
            System.out.println(pilaLetras.peek());
            
        }
       
        }
    }
    

