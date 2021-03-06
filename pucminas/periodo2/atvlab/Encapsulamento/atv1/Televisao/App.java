package br.pucminas.periodo2.atvlab.Encapsulamento.atv1.Televisao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.TimeUnit;

/**
 * Main Televisão
 */
public class App {
    public static void main(String[] args) throws InterruptedException, IOException {
        Televisao tv = new Televisao();
        while (tv.getEstado()) {
            menu();
            tv.interpreta();
            TimeUnit.SECONDS.sleep(3);
            System.out.println("Digite algo para prosseguir");
            readLine();
        }
    }

    public static String readLine() throws IOException {
        InputStreamReader streamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(streamReader);
        return bufferedReader.readLine();
    }

    public static void menu() {
        System.out.print("\033\143");
        System.out.println("Super Ultra Televisão 3000");
        System.out.println("1 - Ligar");
        System.out.println("2 - Desligar");
        System.out.println("3 - Mudar o canal");
        System.out.println("4 - Exibir o canal atual");
        System.out.println("5 - Aumentar o volume");
        System.out.println("6 - Aumentar o volume");
        System.out.println("7 - Exibir o volume");
        System.out.println("0 - Sair");
        System.out.println("Digite a opção desejada");
    }
}
