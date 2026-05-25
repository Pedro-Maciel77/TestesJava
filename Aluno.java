/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Notas {
    public double calcularMedia(double n1, double n2) { return (n1 + n2) / 2.0; }
    public boolean verificarAprovacao(double media) { return media >= 7.0; }
}

public class Aluno {
    public static void main(String[] args) {
        Notas aluno = new Notas();
        System.out.println("=== TESTES ALUNO ===");
        
        System.out.println("Media (7.0 e 8.0): " + aluno.calcularMedia(7.0, 8.0)); // 7.5
        System.out.println("Aprovado (Media 7.0): " + aluno.verificarAprovacao(7.0)); // true
        System.out.println("Reprovado (Media 6.5): " + aluno.verificarAprovacao(6.5)); // false
    }
}
