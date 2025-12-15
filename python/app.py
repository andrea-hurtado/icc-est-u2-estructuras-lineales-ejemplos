from sing_validator import SignValidator

def run_sign_validator():
    signValidator = SignValidator()
    cadena1 = "{[()]}" #VALIDO
    cadena2 = "{[(]}" #NO VALIDO
    print(f"Cadena: {cadena1} es válida? {signValidator.is_valid(cadena1)}")
    print(f"Cadena: {cadena2} es válida? {signValidator.is_valid(cadena2)}")

    
    
if __name__ == "__main__":
    run_sign_validator()