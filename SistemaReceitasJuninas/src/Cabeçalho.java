import java.util.Scanner;


public class Cabeçalho implements InterfaceCabeçalho{
    private int escolhaReceita;
    private int numMenu;
    private String escIngrediente;

    @Override
    public void cabecalho(){
        System.out.println(ConsoleColors.BLUE + "================================");
        System.out.println("         ARRAIÁ DO SABOR         ");
        System.out.println("================================" + ConsoleColors.RESET);
        System.out.println(ConsoleColors.YELLOW + "1 -> Receitas disponíveis");
        System.out.println("2 -> Pesquisar receita por ingrediente");
        System.out.println("3 -> Fechar Programa" + ConsoleColors.RESET);
        System.out.println("");
        System.out.println("Escolha uma opção (digite um número) para avançar:");
    }

    @Override
    public void cabecalhoReceita() {
        System.out.println(ConsoleColors.BLUE + "==================================");
        System.out.println("       RECEITAS DISPONÍVEIS       ");
        System.out.println("==================================" + ConsoleColors.RESET);
        System.out.println(ConsoleColors.YELLOW + "1 -> Arroz Doce");
        System.out.println("2 -> Bolo de Milho");
        System.out.println("3 -> Bolo de Fubá");
        System.out.println("4 -> Caldo Verde");
        System.out.println("5 -> Canjica");
        System.out.println("6 -> Cocada");
        System.out.println("7 -> Curau");
        System.out.println("8 -> Maçã do Amor");
        System.out.println("9 -> Pé de Moleque");
        System.out.println("10 -> Quentão");
        System.out.println("11 -> Voltar ao Menu Principal" + ConsoleColors.RESET);
        System.out.println("");
        System.out.println("Escolha a receita (Digite um número de 1 a 10):");
    }

    public int getEscolhaReceita() {
        return escolhaReceita;
    }

    public void setEscolhaReceita(int escolhaReceita) {
        Scanner teclado = new Scanner(System.in);
        int escolha = teclado.nextInt();
        escolhaReceita = escolha;
        this.escolhaReceita = escolhaReceita;
    }

    public int getNumMenu() {
        return numMenu;
    }

    public void setNumMenu(int numMenu) {
        Scanner t = new Scanner(System.in);
        numMenu = 0;
        numMenu = t.nextInt();
        this.numMenu = numMenu;
    }

    public String getEscIngrediente() {
        return escIngrediente;
    }

    public void setEscIngrediente(String escIngrediente) {
        Scanner tec = new Scanner(System.in);
        System.out.print("Digite o ingrediente para ver a(s) receita(s) -> ");
        String escolha = tec.nextLine();
        escIngrediente = escolha;
        this.escIngrediente = escIngrediente;
    }
}
