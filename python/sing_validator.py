
class SignValidator:
    def is_valid(self, text: str) -> bool:
        
        stack = []
        for character in text:
            if self.get_is_apertura(character):
                stack.append(character)  # ingresar a la pila
            else:
                if not stack:
                    return False
                ultimo = stack.pop()  # APERTURA
                if not self.is_tipo_igual(ultimo, character):
                    return False

        return len(stack) == 0

    def get_is_apertura(self, c: str) -> bool:
        return c in "([{"

    def is_tipo_igual(self, apertura: str, cierre: str) -> bool:
        return (apertura == '(' and cierre == ')') or \
               (apertura == '[' and cierre == ']') or \
               (apertura == '{' and cierre == '}')
