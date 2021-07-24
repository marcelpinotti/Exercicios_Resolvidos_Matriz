import java.io.IOException;
import java.util.Scanner;



public class AreaEsquerda {


    public static void main(String[] args) throws IOException {

        Scanner leitor = new Scanner(System.in);
        double soma = 0.0;
        double somaUm = 0.0;
        double somaDois = 0.0;

        System.out.print("Soma ou Multipicação: ");
        char O = leitor.next().toUpperCase().charAt(0);
        System.out.println(" ");

        double M[][] = {{1, 2, 3, 4, 5, 6} , {5, 6, 7, 8, 9, 1}, {9, 1, 2, 3, 4, 5},
                        {4, 5, 6, 7, 8, 9}, {1, 2, 3, 4, 5, 6} , {5, 6, 7, 8, 9, 1}};

        for(int i = 0; i < M.length; i++) {
            for (int j = 0; j < M.length; j++) {
                System.out.print( "| " + M[i][j] + " | ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");

        for(int i = 0; i < M.length; i++) {
            for (int j = 0; j < M.length; j++) {
                somaDois += M[i][j];
            }
        }
        System.out.println(String.format( "A soma de todos os valores é: %.1f", somaDois));

        System.out.println(" ");

        System.out.println(("Linhas e Colunas do TRIÂNGULO DA ÁREA ESQUERDA."));
        for (int i = 1; i < M.length - 1; i++) {
            if (i <= 2){
                for (int j = 0 ; j < i; j++) {
                    System.out.print("| Linha: " + i + " Coluna: " + j + " | ");
                    somaUm += M[i][j];
                }
            } else if (i >= 3) {
                for (int j = 0; j < M.length - 1 - i; j++) {
                    System.out.print("| Linha: " + i + " Coluna: " + j + " | ");
                    somaUm += M[i][j];
                }
            }
        }

        System.out.println(" ");
        if (O =='S') {
            soma = somaUm;
            System.out.println(String.format( "A soma de todos os valores do triângulo da área esquerda é: %.1f" , soma));
        } else if (O == 'M'){
            soma = somaUm/6;
            System.out.println(String.format( "A multiplicação de todos os valores do triângulo da área esquerda é: %.1f" , soma));
        }
    }

}
