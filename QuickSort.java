import java.util.Scanner;


public class QuickSort{


    public static int parciona(int vetor[], int inicio, int fim){

        int pivo = (vetor[inicio] + vetor[fim]) / 2; //38
        //42 7 13 89 21 5 64 37 18 73 73 11 56 92 34
        while (inicio < fim) {

            while (inicio < fim && vetor[inicio] <= pivo) {
                inicio = inicio + 1; //3
            }

            while (inicio < fim && vetor[fim] > pivo) {
                fim = fim - 1;
            }

            int aux = vetor[fim]; //34
            vetor[fim] = vetor[inicio]; //42
            vetor[inicio] = aux; //34           
        }

        return inicio;
    }

    public static void quickSort(int vetor[], int inicio, int fim){
        if(inicio < fim){
            int posicao = parciona(vetor, inicio, fim);
            quickSort(vetor, inicio, posicao-1);
            quickSort(vetor, posicao+1, fim);
        }       
    }

    public static void imprimir(int vetor[]){
        for (int i : vetor) {
            System.out.print(" " + i);
        }
    }

    public static void main(String[] args){

        //Ordenação de dados com Quick-sort

        //Logica: 
        //1 - Encontre o pivo.
        //2 - Apos encontrar o pivo precisa percorrer o vetor da esquerda para centro
        //ate encontrar um elemento que seja maior que o pivo.
        //3 - Percorrer o vetor da direita para o centro ate encontrar um elemento que seja menor que o pivo
        //4 - Apos encontrar maior e menor faz a troca deles
        Scanner sc = new Scanner(System.in);

        int[] vetor = {42, 7, 13, 89, 21, 5, 64, 37, 18, 73, 73, 11, 56, 92, 34};
        imprimir(vetor);
        quickSort(vetor, 0, 14);
        System.out.println();
        System.out.println("Vetor ordenado com Quick-sort:");
        imprimir(vetor);

        sc.close();
    }
}