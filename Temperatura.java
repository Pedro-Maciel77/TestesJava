/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Conversor {
    public double celsiusParaFahrenheit(double c) { return (c * 9 / 5) + 32; }
    public boolean verificarTemperaturaAlta(double c) { return c > 30.0; }
}

public class Temperatura {
    public static void main(String[] args) {
        Conversor t = new Conversor();
        System.out.println("=== TESTES TEMPERATURA ===");
        
        System.out.println("0C em Fahrenheit: " + t.celsiusParaFahrenheit(0)); // 32.0
        System.out.println("Temperatura Alta (35C): " + t.verificarTemperaturaAlta(35)); // true
        System.out.println("Temperatura Normal (25C): " + t.verificarTemperaturaAlta(25)); // false
    }
}