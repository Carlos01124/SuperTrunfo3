import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        float carta1venceu = 0;
        float carta2venceu = 0;


        float superpoder1;
        float superpoder2;

        float cdp1;
        float cpc1;

        float cdp2;
        float cpc2;

        float pibcapital1;
        float pibcapital2;

        //carta 1
        char estado1;
        String codigo1;
        String nomecidade1;
        long populacao1;
        float area1;
        float pib1;
        int pontoturisticos1;


        //carta 2
        char estado2;
        String codigo2;
        String nomecidade2;
        long populacao2;
        float area2;
        float pib2;
        int pontoturisticos2;

        //Cadastro 1
        System.out.println("-------Cadastro de Carta-Super-Trunfo-------");

        //Cadastro de carta 1
        System.out.println("Faça a carta 1");

        System.out.println("informe o estado (A a H): ");
        estado1 = sc.nextLine().charAt(0);

        System.out.println("Informe o codigo da Carta (ex: A01): ");
        codigo1 = sc.nextLine();

        System.out.println("Informe o nome da cidade: ");
        nomecidade1 = sc.nextLine();

        System.out.println("Informe a populaçao: ");
        populacao1 = Integer.parseInt(sc.nextLine());

        System.out.println("Informe a area em Km²: ");
        area1 = Float.parseFloat(sc.nextLine());

        System.out.println("Informe o pib em reais: ");
        pib1 = Float.parseFloat(sc.nextLine());

        System.out.println("Informe o numero de pontos turísticos: ");
        pontoturisticos1 = Integer.parseInt(sc.nextLine());

        //calcular densidade populacional
        cdp1 = populacao1 / area1;


        //calcular pib capital
        pibcapital1 = pib1 / populacao1;


        System.out.println();


        //--------------------------------------------------------------------------------------------------------------

        //Cadastro 2
        System.out.println("-------Cadastro de Carta-Super-Trunfo-------");

        //Cadastro de carta 2
        System.out.println("faça a carta 2");

        System.out.println("informe o estado (A a H): ");
        estado2 = sc.nextLine().charAt(0);

        System.out.println("Informe o codigo da Carta (ex: A01): ");
        codigo2 = sc.nextLine();

        System.out.println("Informe o nome da cidade: ");
        nomecidade2 = sc.nextLine();

        System.out.println("Informe a populaçao: ");
        populacao2 = Integer.parseInt(sc.nextLine());

        System.out.println("Informe a area em Km²: ");
        area2 = Float.parseFloat(sc.nextLine());

        System.out.println("Informe o pib em reais: ");
        pib2 = Float.parseFloat(sc.nextLine());

        System.out.println("Informe o numero de pontos turísticos: ");
        pontoturisticos2 = Integer.parseInt(sc.nextLine());

        //densidade populacao cdp
        cdp2 = populacao2 / area2;
        System.out.println("Densidade populacional: " + cdp2);

        //Pib por capital
        pibcapital2 = pib2 / populacao2;
        System.out.println("Pib da Capital: " + pibcapital2);


        //exibiçao da carta 1
        System.out.println(" ------- carta 1 ---------");
        System.out.println("Estado: " + estado1);
        System.out.println("Codigo: " + codigo1);
        System.out.println("Nome da cidade: " + nomecidade1);
        System.out.println("Populacao: " + populacao1);
        System.out.println("Area: " + area1 + "km²");
        System.out.println("Pib: " + pib1 + "Bilhões de Reais");
        System.out.println("Ponto turisticos: " + pontoturisticos1);
        System.out.println("Densidade populacional: " + cdp1);
        System.out.println("Pib da Capital: " + pibcapital1);

        //exibiçao da carta 2
        System.out.println(" ------- carta 2 ---------");
        System.out.println("Estado: " + estado2);
        System.out.println("Codigo: " + codigo2);
        System.out.println("Nome da cidade: " + nomecidade2);
        System.out.println("Populacao: " + populacao2);
        System.out.println("Area: " + area2 + "km²");
        System.out.println("Pib: " + pib2 + "Bilhões de Reais");
        System.out.println("Ponto turisticos: " + pontoturisticos2);
        System.out.println("Densidade populacional: " + cdp2);
        System.out.println("Pib da Capital: " + pibcapital2);

        superpoder1 = populacao1 + area1 + pib1 + pibcapital1 + pontoturisticos1;

        superpoder2 = populacao2 + area2 + pib2 + pibcapital2 + pontoturisticos2;

        System.out.println("------------Comparaçao de cartas------------");
        if (pontoturisticos1 > pontoturisticos2) {
            System.out.println("Populaçao: carta 1 venceu");
            carta1venceu++;
        } else if (pontoturisticos1 < pontoturisticos2) {
            System.out.println("Populaçao: carta 2 venceu");
            carta2venceu++;
        } else {
            System.out.println("Populaçao: empate");
            carta1venceu++;
            carta2venceu++;
        }

        if (area1 > area2) {
            System.out.println("Area: carta 1 venceu");
            carta1venceu++;
        } else if (area1 < area2) {
            System.out.println("Area: carta 2 venceu");
            carta2venceu++;
        } else {
            System.out.println("Area: empate");
            carta1venceu++;
            carta2venceu++;
        }

        if (pib1 > pib2) {
            System.out.println("Pib: carta 1 venceu");
            carta1venceu++;
        } else if (pib1 < pib2) {
            System.out.println("Pib: carta 2 venceu");
            carta2venceu++;
        } else {
            System.out.println("Pib: empate");
            carta1venceu++;
            carta2venceu++;
        }

        if (populacao1 > populacao2) {
            System.out.println("Populacao: carta 1 venceu");
            carta1venceu++;
        } else if (populacao1 < populacao2) {
            System.out.println("Populacao: carta 2 venceu");
            carta2venceu++;
        } else {
            System.out.println("Populacao: empate");
            carta1venceu++;
            carta2venceu++;
        }

        if (cdp1 < cdp2) {
            System.out.println("Densidade Populacional: carta 1 venceu");
            carta1venceu++;
        } else if (cdp1 > cdp2) {
            System.out.println("Densidade Populacional: carta 2 venceu");
            carta2venceu++;
        } else {
            System.out.println("Empate");
            carta1venceu++;
            carta2venceu++;
        }

        if (pibcapital1 > pibcapital2) {
            System.out.println("Pib da capital: carta 1 venceu");
            carta1venceu++;
        } else if (pibcapital1 < pibcapital2) {
            System.out.println("Pib da capital: carta 2 venceu");
            carta2venceu++;
        } else {
            System.out.println("Pib da capital: empate");
            carta1venceu++;
            carta2venceu++;
        }

        if (superpoder1 > superpoder2) {
            System.out.println("Super poder: carta 1 venceu");
            carta1venceu++;
        }else if (superpoder1 < superpoder2) {
            System.out.println("Super poder: carta 2 venceu");
            carta2venceu++;
        }else {
            System.out.println("Super poder: empate");
            carta1venceu++;
            carta2venceu++;
        }

        if (carta1venceu > carta2venceu) {
            System.out.println("Carta 1 é a vencedora!");
        }else {
            System.out.println("Carta 2 é a vencedora!");
        }

        sc.close();
    }
}