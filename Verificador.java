/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Verificacao {
    public boolean ehPar(int numero) { return numero % 2 == 0; }
    public boolean ehPositivo(int numero) { return numero > 0; }
}

public class Verificador {
    public static void main(String[] args) {
        Verificacao v = new Verificacao();
        System.out.println("=== TESTES VERIFICADOR ===");
        
        System.out.println("Numero Par (4): " + v.ehPar(4)); // true
        System.out.println("Numero Impar (7): " + v.ehPar(7)); // false
        System.out.println("Numero Positivo (10): " + v.ehPositivo(10)); // true
        System.out.println("Numero Negativo (-5): " + v.ehPositivo(-5)); // false
    }
}