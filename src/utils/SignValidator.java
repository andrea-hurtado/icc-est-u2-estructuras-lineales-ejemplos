package utils;

import java.util.Stack;

public class SignValidator {

    public boolean isValid(String signos){

        Stack<Character> stack = new  Stack<Character>();
        char[] characteres = signos.toCharArray();
        for (Character character : characteres) {
            //character -> (
            // -> {
            // 1 -> comprobar si es apertura o cierre
            if (getIsApertura(character)){
                 //ingresar a la pila
                 stack.push(character); 
            } else{
                if (stack.isEmpty()){
                    return false;
                }
                char ultimo = stack.pop(); // APERTURA
                //el ultimo es del mismo tipo que el character?
                // mismoTipo = isTipoIgual(character, ultimo);
                                //ultimo ( && character ) -> true
                                //ultimo [ && character ] -> true
                                //ultimo { && character } -> true
                                //ultimo ( && character ] -> false
                if (!isTipoIgual(ultimo, character)) {
                    return false;
                    
                }

            }
            
        }
        return stack.isEmpty();
    }

    
    public boolean getIsApertura(char c) {
        return c == '(' || c == '[' || c == '{';
    }


   
    public boolean isTipoIgual(char apertura, char cierre) {
        return (apertura == '(' && cierre == ')') ||
               (apertura == '[' && cierre == ']') ||
               (apertura == '{' && cierre == '}');
    }
    
}
