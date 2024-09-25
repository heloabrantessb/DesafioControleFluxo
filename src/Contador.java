import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int parametroUm, parametroDois;

        System.out.println("Digite o primeiro número");
        parametroUm = teclado.nextInt();
        System.out.println("Digite o segundo número");
        parametroDois = teclado.nextInt();

        try {
            contagem(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println("<ERRO>: O SEGUNDO NÚMERO DEVE SER MAIOR QUE O PRIMEIRO.");
        }
    }

    public static void contagem(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroDois < parametroUm)
            throw new ParametrosInvalidosException();

        int contagem = 0;
        for (int i = parametroUm + 1; i <= parametroDois; i++) {
            System.out.println("Imprimindo o número " + i);
            contagem++;
        }
        System.out.println("O número de contagens foi: " + contagem);
    }
}