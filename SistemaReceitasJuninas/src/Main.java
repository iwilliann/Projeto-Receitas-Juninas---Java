import java.util.ArrayList;
import java.util.List;
import java.text.Normalizer;

public class Main{
    public static void main(String[] args) {
        List<Receitas> receita = new ArrayList<>();
        Cabeçalho menu = new Cabeçalho();
        ImagemReceitas imagemReceitas = new ImagemReceitas();
        ReceitaEscrita receitaEscrita = new ReceitaEscrita();

        receita.add(new Receitas("Arroz Doce", List.of("arroz", "Leite", "acucar", "Canela")));
        receita.add(new Receitas("Bolo de Milho", List.of("milho", "leite condensado", "ovo","oleo", "queijo ralado", "fermento em po")));
        receita.add(new Receitas("Bolo de Fubá", List.of("fuba", "acucar", "leite", "oleo", "fermento em pó", "erva-doce")));
        receita.add(new Receitas("Caldo Verde", List.of("batata", "couve", "linguiça", "cebola", "alho", "sal", "pimenta")));
        receita.add(new Receitas("Canjica", List.of("milho", "leite de coco", "leite condensado", "canela", "acucar")));
        receita.add(new Receitas("Cocada", List.of("coco", "acucar", "agua")));
        receita.add(new Receitas("Curau", List.of("milho", "leite", "acucar", "canela")));
        receita.add(new Receitas("Maçã do Amor", List.of("maca", "acucar", "agua", "vinagre", "corante vermelho")));
        receita.add(new Receitas("Pé de Moleque", List.of("amendoim", "acucar", "rapadura")));
        receita.add(new Receitas("Quentão", List.of("cachaça", "agua", "acucar", "gengibre", "limao", "canela")));

        while (menu.getNumMenu() != 3){
            menu.cabecalho();
            menu.setNumMenu(menu.getNumMenu());
            switch (menu.getNumMenu()) {
                case 1:
                    do {
                        menu.cabecalhoReceita();
                        menu.setEscolhaReceita(menu.getEscolhaReceita());
                        switch (menu.getEscolhaReceita()) {
                            case 1:
                                receitaEscrita.getArrozDoce();
                                imagemReceitas.setImagem("/resources/imagens/Arroz doce.png");
                                imagemReceitas.mostrarImagem(600, 750);
                                break;
                            case 2:
                                receitaEscrita.getBolo_deMilho();
                                imagemReceitas.setImagem("/resources/imagens/Bolo de milho.png");
                                imagemReceitas.mostrarImagem(600, 750);
                                break;
                            case 3:
                                receitaEscrita.getBolo_deFuba();
                                imagemReceitas.setImagem("/resources/imagens/Bolo fubá.png");
                                imagemReceitas.mostrarImagem(600, 750);
                                break;
                            case 4:
                                receitaEscrita.getCaldoVerde();
                                imagemReceitas.setImagem("/resources/imagens/Caldo verde.png");
                                imagemReceitas.mostrarImagem(600, 750);
                                break;
                            case 5:
                                receitaEscrita.getCanjica();
                                imagemReceitas.setImagem("/resources/imagens/Canjica.png");
                                imagemReceitas.mostrarImagem(600, 750);
                                break;
                            case 6:
                                receitaEscrita.getCocada();
                                imagemReceitas.setImagem("/resources/imagens/Cocada.png");
                                imagemReceitas.mostrarImagem(600, 750);
                                break;
                            case 7:
                                receitaEscrita.getCurau();
                                imagemReceitas.setImagem("/resources/imagens/Curau.png");
                                imagemReceitas.mostrarImagem(600, 750);
                                break;
                            case 8:
                                receitaEscrita.getMaca_doAmor();
                                imagemReceitas.setImagem("/resources/imagens/Maça do amor.png");
                                imagemReceitas.mostrarImagem(600, 750);
                                break;
                            case 9:
                                receitaEscrita.getPe_deMoleque();
                                imagemReceitas.setImagem("/resources/imagens/Pé de moleque.png");
                                imagemReceitas.mostrarImagem(600, 750);
                                break;
                            case 10:
                                receitaEscrita.getQuentao();
                                imagemReceitas.setImagem("/resources/imagens/Quentão.png");
                                imagemReceitas.mostrarImagem(600, 750);
                                break;
                            case 11:
                                break;
                            default:
                                System.out.println(ConsoleColors.RED + "ERRO. Digite uma opção válida." + ConsoleColors.RESET);
                        }
                    } while (menu.getEscolhaReceita() < 11);
                    break;

                case 2:
                    menu.setEscIngrediente(menu.getEscIngrediente());
                    String escolhaIngrediente = Normalizer.normalize(menu.getEscIngrediente(), Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");

                    List<Receitas> receitasEncontradas = new ArrayList<>();
                    for (Receitas receitas : receita) {
                        if (receitas.ingredientes.contains(escolhaIngrediente)) {
                            receitasEncontradas.add(receitas);
                        }
                    }

                    if (receitasEncontradas.isEmpty()) {
                        System.out.println(ConsoleColors.RED + "!ERRO! Não existe receita com o(a) " + menu.getEscIngrediente() + " como ingrediente." + ConsoleColors.RESET);
                    } else {
                        System.out.println(ConsoleColors.BLUE + "Receitas com " + menu.getEscIngrediente() + "." + ConsoleColors.RESET);
                        for (Receitas receitas : receitasEncontradas) {
                            System.out.println(ConsoleColors.PURPLE + "---------------------------------");
                            System.out.println(receitas);
                        }
                    }
                    System.out.println("---------------------------------" + ConsoleColors.RESET);
                    break;
                case 3:
                    break;
                default:
                    System.out.println(ConsoleColors.RED + "ERRO. Digite uma opção válida." + ConsoleColors.RESET);
            }

        }
        System.out.println(ConsoleColors.GREEN + "Obrigado por visitar nosso Arraiá do Sabor! Volte Sempre!");
    }
}