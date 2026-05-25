# ☕ Laboratório de Testes Unitários Nativos em Java

Este repositório contém um conjunto de pequenos programas em Java desenvolvidos para exercitar a lógica de programação, orientação a objetos e a criação de **testes unitários nativos** (manuais), ou seja, sem o uso de frameworks externos como JUnit ou TestNG.

Cada arquivo simula um cenário do mundo real com regras de negócio simples e uma estrutura de validação por meio do console.

---

## 📂 Estrutura do Projeto

O projeto é composto por 5 módulos independentes de teste:

| Arquivo | Classe Principal | Domínio / Regra de Negócio | Métodos Testados |
| :--- | :--- | :--- | :--- |
| `Aluno.java` | `Aluno` | Notas e aprovação escolar. | `calcularMedia`, `verificarAprovacao` |
| `Login.java` | `Main` | Autenticação simples de usuário. | `autenticar` (com validações Custom `assertTrue`/`assertFalse`) |
| `Main.java` | `Main` | E-commerce (Descontos e Frete Grátis). | `calcularDesconto`, `verificarFreteGratis` (com `assertEquals` manual) |
| `Temperatura.java` | `Temperatura` | Conversão e monitoramento de clima. | `celsiusParaFahrenheit`, `verificarTemperaturaAlta` |
| `Verificador.java` | `Verificador` | Validações matemáticas básicas. | `ehPar`, `ehPositivo` |

---

## 🔬 Detalhes dos Cenários de Teste

### 1. Sistema de Notas (`Aluno.java`)
Calcula a média aritmética entre duas notas e valida se o aluno atingiu a média mínima para aprovação ($\ge 7.0$).
* **Saída esperada:** Demonstração dos retornos das médias e booleanos de aprovação direto no console.

### 2. Autenticação Simples (`Login.java`)
Valida credenciais de acesso para um usuário administrador. Este arquivo introduz métodos customizados de asserção:
* `assertTrue(condicao)`: Exibe `[PASSOU]` se a condição for verdadeira.
* `assertFalse(condicao)`: Exibe `[PASSOU]` se a condição for falsa (esperada).

### 3. E-commerce e Descontos (`Main.java`)
Gere o cálculo de 10% de desconto sobre produtos e validação de frete grátis para compras acima de R$ 100,00. É o arquivo mais robusto de testes manuais, implementando o método:
* `assertEquals(esperado, atual)`: Utiliza uma margem de erro (`delta = 0.001`) para comparar números de ponto flutuante (`double`).

### 4. Conversor de Clima (`Temperatura.java`)
Converte Celsius para Fahrenheit e monitora se o ambiente está com temperatura considerada alta ($> 30.0^\circ C$).

### 5. Verificador Matemático (`Verificador.java`)
Contém funções utilitárias para descobrir se um número inteiro é par/impar ou se é positivo/negativo.

---

## 🚀 Como Executar

Como os arquivos possuem o método `main` em suas estruturas e são independentes, você pode compilar e executar qualquer um deles diretamente pelo terminal.

### Pré-requisitos
* Java JDK instalado (versão 8 ou superior).

### Passo a Passo
1. Abra o terminal na pasta onde os arquivos estão salvos.
2. Compile o arquivo desejado:
   ```bash
   javac NomeDoArquivo.java