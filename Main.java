/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
// === CLASSE PRODUTO ===
class Produto {
    public double calcularDesconto(double valor) {
        return valor * 0.10;
    }

    public boolean verificarFreteGratis(double valorTotal) {
        return valorTotal > 100.0;
    }
}

// === CLASSE DE TESTES ===
public class Main {
    public static void assertEquals(double esperado, double atual) {
        if (Math.abs(esperado - atual) < 0.001) {
            System.out.println("  [PASSOU] assertEquals: Esperado " + esperado + " e obteve " + atual);
        } else {
            System.out.println("  [FALHOU] assertEquals: Esperado " + esperado + " mas obteve " + atual);
        }
    }

    public static void assertTrue(boolean condicao) {
        if (condicao) {
            System.out.println("  [PASSOU] assertTrue: A condicao e verdadeira.");
        } else {
            System.out.println("  [FALHOU] assertTrue: Esperava verdadeiro, mas foi falso.");
        }
    }

    public static void assertFalse(boolean condicao) {
        if (!condicao) {
            System.out.println("  [PASSOU] assertFalse: A condicao e falsa.");
        } else {
            System.out.println("  [FALHOU] assertFalse: Esperava falso, mas foi verdadeiro.");
        }
    }

    public static void main(String[] args) {
        Produto produto = new Produto();

        System.out.println("=== EXECUTANDO TESTES DA CLASSE PRODUTO ===");

        System.out.println("\nTestando calcularDesconto():");
        assertEquals(10.0, produto.calcularDesconto(100.0));
        assertEquals(2.5, produto.calcularDesconto(25.0));

        System.out.println("\nTestando verificarFreteGratis():");
        assertTrue(produto.verificarFreteGratis(100.01));
        assertFalse(produto.verificarFreteGratis(100.0));
        assertFalse(produto.verificarFreteGratis(50.0));

        System.out.println("\n===========================================");
    }
}