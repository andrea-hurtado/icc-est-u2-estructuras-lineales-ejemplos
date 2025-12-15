import java.util.Stack;

import utils.QueueUtils;
import utils.SignValidator;
import utils.StackSorter;

public class App {

    
    public static void main(String[] args) throws Exception {
        runSingValidator();
        runStackSorter();
        runQueuePalindrome();
    }

    private static void runSingValidator() { 
        System.out.println("\n--- VALIDACIÓN DE SIGNOS ---");
        SignValidator signValidator = new SignValidator(); 
        String cadena1 = "{[()]}"; // VALIDO 
        String cadena2 = "{[(])}"; // NO VALIDO 
 
        System.out.println("Cadena: " + cadena1 + " es valida? " + signValidator.isValid(cadena1)); 
        System.out.println("Cadena: " + cadena2 + " es valida? " + signValidator.isValid(cadena2)); 
    }

    private static void  runStackSorter(){
        System.out.println("\n--- ORDENAR STACK ---");
        Stack<Integer> stack = new Stack<>();
        stack.push(2);
        stack.push(4);
        stack.push(1);
        stack.push(5);
        System.out.println("Input: " + stack);
        StackSorter.sortAscending(stack);      
        System.out.println("Output: " + stack);
        System.out.println("Menor en tope y orden ascendente: " + StackSorter.isSortedAscTopMin(stack));

    }

    private static void runQueuePalindrome(){

        System.out.println("\n--- PALÍDROMO USANDO COLAS ---");
        
        String s1 = "ana";
        String s2 = "radar";
        String s3 = "java";

        System.out.println("Input: \"" + s1 + "\" -> " + QueueUtils.isPalindromeQueues(s1));
        System.out.println("Input: \"" + s2 + "\" -> " + QueueUtils.isPalindromeQueues(s2));
        System.out.println("Input: \"" + s3 + "\" -> " + QueueUtils.isPalindromeQueues(s3));
       

    }
}
