import java.util.Scanner;

public class Main {

    // identaC'C#o do bloco da classe Exemplo

    public static void main(String[] args) {

        // identaC'C#o do bloco do mC)todo main

        // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);

        double mediald, sa, dias;
        { // inicio

            System.out.println("Digite seu saldo atual:");

            sa = Double.parseDouble(sc.nextLine());

            System.out.println("digite a quantidade de dias");

            // futuramente extrair o dado de uma api de calendario quantos dias tem o mes e
            // quantos dias elegiveis / uteis

            dias = Double.parseDouble(sc.nextLine());
            while (dias > 0) {
                while (sa > 0) {
                    mediald = sa / dias;

                    System.out.println("limite diario " + mediald);

                    System.out.println("Digite quanto gastou hoje");

                    mediald = Double.parseDouble(sc.nextLine());
                    sa = sa - mediald;
                    System.out.println("Seu saldo atual:" + sa);

                    // System.out.println ("Seu limite diario ate o fim do mes:" + mediald);

                    // seu limite

                    dias = dias - 1;

                    mediald = sa / dias;

                    System.out.println("Dias ate o fim do mes: " + dias);

                    System.out.println("Seu limite diario ate o fim do mes: " + mediald);

                }
            } // fim do processo 1 agora inserir while aqui pra repetir while dias > 0
        }
        // System.out.println ("A sua mC)dia C): " + media);

    }
}
