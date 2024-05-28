import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
/*Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
ordem crescente ou decrescente.
Exemplos:
Entrada: Saída:
6 24 Sao Multiplos
Entrada: Saída:
6 25 Nao sao Multiplos
Entrada: Saída:
24 6 Sao Multiplos */
    Scanner sc  = new Scanner(System.in);
    System.out.println("Entre com 2 valores inteiros");
    int a = sc.nextInt();
    int b = sc.nextInt();
    if(a % b == 0 || b % a == 0 ){
        System.out.println("São Multiplos " + a + " é " + b);
    }else{
        System.out.println("Não são Multiplos " + a + " é " + b);
    }
    }
}
