import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> descricoes = new ArrayList<>();
        ArrayList<Double> valores = new ArrayList<>();

        int escolha = 0;
        do {
            System.out.println("Bem vindo ao gestor de gastos\nBy: Cavz");
            System.out.println("1. Adicionar gasto.");
            System.out.println("2. Listas gastos.");
            System.out.println("3. Ver total gasto.");
            System.out.println("4. Ver média de gastos.");
            System.out.println("5. Ver maior gasto.");
            System.out.println("6. Sair.");
            System.out.println("Escolha uma opção: ");

            escolha = sc.nextInt();

            switch (escolha) {
                case 1:
                    sc.nextLine();
                    System.out.println("Adicionar gasto");
                    System.out.println("Qual foi o gasto? ");
                    String descricao = sc.nextLine();
                    System.out.println("De quanto foi o gasto? ");
                    double valor = sc.nextDouble();
                    descricoes.add(descricao);
                    valores.add(valor);
                    System.out.println("Valor adicionado com sucesso!");
                    break;
                case 2:
                    if (valores.isEmpty()) {
                        System.out.println("Nenhum gasto cadastrado.");
                    } else {
                        System.out.println("Listar gastos");
                        for (int i = 0; i < descricoes.size(); i++) {
                            System.out.println(descricoes.get(i) + " - R$ " + valores.get(i));
                        }
                    }
                    break;
                case 3:
                    System.out.println("Ver total gasto");
                    if (valores.isEmpty()) {
                        System.out.println("Nenhum gasto cadastrado.");
                    } else {
                        double total = 0;
                        for (double valorGasto : valores) {
                            total += valorGasto;
                        }
                        System.out.printf("Total gasto: R$ %.2f%n", total);
                    }
                    break;
                case 4:
                    System.out.println("Ver média de gastos");

                    if (valores.isEmpty()) {
                        System.out.println("Nenhum gasto cadastrado.");
                    } else {
                        double total = 0;

                        for (int i = 0; i < valores.size(); i++) {
                            total += valores.get(i);
                        }

                        double media = total / valores.size();

                        System.out.printf("Média de gastos: R$ %.2f%n", media);
                    }
                    break;
                case 5:
                    System.out.println("Ver maior gasto");
                    if (valores.isEmpty()){
                        System.out.println("Nenhum gasto cadastrado.");
                    } else {
                        int indiceMaior = 0;
                        for (int i = 1; i < valores.size(); i++){
                            if (valores.get(i) > valores.get(indiceMaior)) {
                                indiceMaior = i;
                            }
                        }
                        System.out.printf("Maior gasto: %s - R$ %.2f%n",
                                descricoes.get(indiceMaior),
                                valores.get(indiceMaior));
                    }
                    break;
                case 6:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção Inválida.");
            }

            System.out.println();

        } while (escolha != 6);
    sc.close();
    }
}
