/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Login {
    public boolean autenticar(String usuario, String senha) {
        return "admin".equals(usuario) && "123".equals(senha);
    }
}

public class Main {
    public static void assertTrue(boolean condicao) {
        if (condicao) System.out.println("  [PASSOU] Usuario autenticado.");
        else System.out.println("  [FALHOU] Esperava sucesso.");
    }

    public static void assertFalse(boolean condicao) {
        if (!condicao) System.out.println("  [PASSOU] Acesso negado corretamente.");
        else System.out.println("  [FALHOU] Permitiu acesso incorreto.");
    }

    public static void main(String[] args) {
        Login login = new Login();
        System.out.println("=== TESTES LOGIN ===");
        assertTrue(login.autenticar("admin", "123"));
        assertFalse(login.autenticar("admin", "senha_errada"));
        assertFalse(login.autenticar("usuario_errado", "123"));
    }
}