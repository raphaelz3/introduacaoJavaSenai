import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        //Crie e imprima um vetor
//        int[] num = new int[5];
//
//        for(int i = 0; i < num.length; i++){
//            num[i] = i + 10;
//            System.out.println(num[i]);
//        }

//        //preencher e listar 10 elementos
//        int[] lista = new int[10];
//
//        for(int i = 0; i < lista.length; i++){
//            System.out.printf("Digite o " + (i+1) + "º numero: ");
//            lista[i] = scan.nextInt();
//        }
//        for(int i = 0; i < lista.length; i++)
//            System.out.println(lista[i]);
//
//        //Soma dos elementos do vetor
//        int[] listaSoma = new int[4];
//        int result = 0;
//
//        for(int i = 0; i < listaSoma.length; i++){
//            System.out.printf("Digite o " + (i+1) + "º numero para somar: ");
//            listaSoma[i] = scan.nextInt();
//        }
//        for(int i = 0; i < listaSoma.length; i++)
//            result += listaSoma[i];
//        System.out.println("A soma é: " + result);
//
//        //Encontre o maior valor
//        int[] maior = new int[6];
//        int oMaior = 0;
//
//     for(int i = 0; i < maior.length; i++) {
//         System.out.printf("Digite o " + (i + 1) + "º numero: ");
//         maior[i] = scan.nextInt();
//     }
//     for(int i = 0; i< maior.length; i++){
//         if(maior[i] > oMaior)
//             oMaior = maior[i];
//     }
//     System.out.println(oMaior);
//
//        //Intermediario
//        //Contar numeros pares em um vetor
//        int[] listaPares = new int[10];
//        int result = 0;
//
//        for(int i = 0; i < listaPares.length; i++){
//            System.out.printf("Digite o " + (i+1) + "º numero: ");
//            listaPares[i] = scan.nextInt();
//        }
//        for(int i = 0; i < listaPares.length; i++){
//            if(listaPares[i] % 2 == 0)
//                result++;
//        }
//        System.out.println("Voce digitou: " + result + " numeros pares. (Zero é par? aqui sim)");
//
//        //Buscar um valor no vetor
//        int[] buscar = new int[]{10, 12, 16, 18, 32, 20, 0, -15};
//        int buscado;
//        boolean naoAchou = false;
//
//        System.out.printf("Digite o numero a ser buscado: ");
//        buscado = scan.nextInt();
//
//        for(int i = 0; i<buscar.length;i++){
//            if (buscar[i] == buscado) {
//                System.out.println("o numero " + buscado + " esta na posicao " + i + " do vetor");
//                naoAchou = true;
//            }
//        }
//        if (!naoAchou)
//            System.out.println("Numero nao encontrado");

        //Copiar e inverter vetor
        int[]  inverter = new int[5];
        int[] invertido = new int[5];
        int contador = 0;

        inverter = preencherInt(5);
        for(int i = inverter.length - 1; i >= 0; i--){
            invertido[contador] = inverter[i];
            contador++;
        }
        printarVetor(inverter);
        printarVetor(invertido);
//
//        //Avancado
//        //Remover duplicatas
//        int[] vetorDuplicado = new int[3];
//        int[] vetorUnico = new int[vetorDuplicado.length];
//        int aux = 1;
//        vetorDuplicado = preencherInt(vetorDuplicado.length);
//
//        for(int i = 0; i < vetorDuplicado.length; i++){
//
//            while (aux != vetorDuplicado.length){
//                aux++;//Nao finalizado
//            }
//        }


     scan.close();
    }
    public static int[] preencherInt(int tamanho){
        Scanner scan = new Scanner(System.in);

        int[] preencherInt = new int[tamanho];

        for(int i = 0; i < preencherInt.length; i++) {
            System.out.printf("Digite o " + (i + 1) + "º numero: ");
            preencherInt[i] = scan.nextInt();
        }
        return preencherInt;
    }

    public static void printarVetor(int[] printar){
        for(int i = 0; i < printar.length; i++)
            System.out.print(printar[i]);
        System.out.printf("\n");
    }

}