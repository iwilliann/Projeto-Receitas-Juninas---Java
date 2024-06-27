public class ReceitaEscrita {
    private String arrozDoce;
    private String bolo_deMilho;
    private String bolo_deFuba;
    private String caldoVerde;
    private String canjica;
    private String cocada;
    private String curau;
    private String maca_doAmor;
    private String pe_deMoleque;
    private String quentao;

    public String getArrozDoce() {
        System.out.println(ConsoleColors.BLUE + "========================");
        System.out.println("       Arroz Doce       ");
        System.out.println("========================");
        System.out.println("------------------------");
        System.out.println("Ingredientes");
        System.out.println("------------------------");
        System.out.println(ConsoleColors.PURPLE + """
                1 xícara (chá) de arroz
                1 litro de leite
                1 xícara (chá) de açúcar
                1 pau de canela
                Canela em pó a gosto
                """);
        System.out.println(ConsoleColors.BLUE + "------------------------");
        System.out.println("Modo de Preparo");
        System.out.println("------------------------");
        System.out.println(ConsoleColors.PURPLE + """
                1 -> Cozinhe o arroz em água até ficar macio e a água secar.
                2 -> Adicione o leite, o açúcar e o pau de canela.
                3 -> Cozinhe em fogo baixo, mexendo sempre, até o arroz ficar bem cremoso.
                4 -> Despeje em uma travessa e polvilhe canela em pó.
                5 -> Sirva quente ou frio.
                """ + ConsoleColors.RESET);
        return arrozDoce;
    }

    public String getBolo_deMilho() {
        System.out.println(ConsoleColors.BLUE + "========================");
        System.out.println("     Bolo de Milho      ");
        System.out.println("========================");
        System.out.println("------------------------");
        System.out.println("Ingredientes");
        System.out.println("------------------------");
        System.out.println(ConsoleColors.PURPLE + """
                2 latas de milho verde (sem a água)
                1 lata de leite condensado
                3 ovos
                1/2 xícara (chá) de óleo
                1 xícara (chá) de queijo ralado
                1 colher (sopa) de fermento em pó
                """ + ConsoleColors.RESET);
        System.out.println(ConsoleColors.BLUE + "------------------------");
        System.out.println("Modo de Preparo");
        System.out.println("------------------------");
        System.out.println(ConsoleColors.PURPLE + """
                1 -> Preaqueça o forno a 180°C.
                2 -> Bata no liquidificador o milho, o leite condensado, os ovos e o óleo até obter uma mistura homogênea.
                3 -> Adicione o queijo ralado e bata novamente.
                4 -> Acrescente o fermento e misture com uma colher.
                5 ->Despeje a massa em uma forma untada e enfarinhada.
                6 -> Asse por cerca de 40 minutos ou até dourar.
                """);
        return bolo_deMilho;
    }

    public String getBolo_deFuba() {
        System.out.println(ConsoleColors.BLUE + "========================");
        System.out.println("      Bolo de Fubá      ");
        System.out.println("========================");
        System.out.println("------------------------");
        System.out.println("Ingredientes");
        System.out.println("------------------------");
        System.out.println(ConsoleColors.PURPLE + """
                2 xícaras (chá) de fubá
                1 xícara (chá) de açúcar
                3 ovos
                1 xícara (chá) de leite
                1/2 xícara (chá) de óleo
                1 colher (sopa) de fermento em pó
                1 colher (chá) de erva-doce                               
                """);
        System.out.println(ConsoleColors.BLUE + "------------------------");
        System.out.println("Modo de Preparo");
        System.out.println("------------------------");
        System.out.println(ConsoleColors.PURPLE + """
                1 -> Preaqueça o forno a 180°C.
                2 -> Bata no liquidificador o leite, os ovos e o óleo.
                3 -> Adicione o açúcar e o fubá e bata novamente.
                4 -> Acrescente o fermento e a erva-doce, misturando com uma colher.
                5 -> Despeje a massa em uma forma untada e enfarinhada.
                6 -> Asse por cerca de 40 minutos ou até dourar.
                """ + ConsoleColors.RESET);
        return bolo_deFuba;
    }

    public String getCaldoVerde() {
        System.out.println(ConsoleColors.BLUE + "========================");
        System.out.println("      Caldo Verde       ");
        System.out.println("========================");
        System.out.println("------------------------");
        System.out.println("Ingredientes");
        System.out.println("------------------------");
        System.out.println(ConsoleColors.PURPLE + """
                5 batatas grandes descascadas e cortadas em pedaços
                1 maço de couve cortada em tiras finas
                2 linguiças portuguesas cortadas em rodelas
                1 cebola picada
                2 dentes de alho picados
                Sal e pimenta a gosto
                Azeite para refogar                              
                """);
        System.out.println(ConsoleColors.BLUE + "------------------------");
        System.out.println("Modo de Preparo");
        System.out.println("------------------------");
        System.out.println(ConsoleColors.PURPLE + """
                1 -> Cozinhe as batatas em água até ficarem macias.
                2 -> Reserve a água do cozimento.
                3 -> Amasse as batatas até formar um purê.
                4 -> Em uma panela grande, aqueça o azeite e refogue a cebola e o alho até dourar.
                5 -> Adicione a linguiça e refogue por alguns minutos.
                6 -> Acrescente o purê de batatas e a água do cozimento.
                7 -> Tempere com sal e pimenta.
                8 -> Deixe ferver e adicione a couve.
                9 -> Cozinhe por mais 10 minutos e sirva quente.
                """ + ConsoleColors.RESET);
        return caldoVerde;
    }

    public String getCanjica() {
        System.out.println(ConsoleColors.BLUE + "========================");
        System.out.println("        Canjica         ");
        System.out.println("========================");
        System.out.println("------------------------");
        System.out.println("Ingredientes");
        System.out.println("------------------------");
        System.out.println(ConsoleColors.PURPLE + """
                500g de milho branco
                1 litro de leite de coco
                1 lata de leite condensado
                1 pau de canela
                5 cravos-da-índia
                Açúcar a gosto                             
                """);
        System.out.println(ConsoleColors.BLUE + "------------------------");
        System.out.println("Modo de Preparo");
        System.out.println("------------------------");
        System.out.println(ConsoleColors.PURPLE + """
                1 -> Deixe o milho de molho em água por pelo menos 12 horas.
                2 -> Cozinhe o milho em água até ficar macio (aproximadamente 1 hora).
                3 -> Adicione o leite de coco, o leite condensado, a canela e os cravos.
                4 -> Cozinhe em fogo baixo, mexendo sempre, até a canjica engrossar.
                5 -> Adicione açúcar a gosto e cozinhe por mais alguns minutos.
                6 -> Sirva quente ou fria.                               
                """ + ConsoleColors.RESET);
        return canjica;
    }

    public String getCocada() {
        System.out.println(ConsoleColors.BLUE + "========================");
        System.out.println("         Cocada         ");
        System.out.println("========================");
        System.out.println("------------------------");
        System.out.println("Ingredientes");
        System.out.println("------------------------");
        System.out.println(ConsoleColors.PURPLE + """
                2 xícaras (chá) de coco ralado
                2 xícaras (chá) de açúcar
                1 xícara (chá) de água                            
                """);
        System.out.println(ConsoleColors.BLUE + "------------------------");
        System.out.println("Modo de Preparo");
        System.out.println("------------------------");
        System.out.println(ConsoleColors.PURPLE + """
                1 -> Em uma panela, misture o coco ralado, o açúcar e a água.
                2 -> Leve ao fogo médio, mexendo sempre, até a mistura desgrudar do fundo da panela.
                3 -> Despeje a mistura em uma superfície untada com manteiga.
                4 -> Deixe esfriar e corte em pedaços.                              
                """ + ConsoleColors.RESET);
        return cocada;
    }

    public String getCurau() {
        System.out.println(ConsoleColors.BLUE + "========================");
        System.out.println("         Curau          ");
        System.out.println("========================");
        System.out.println("------------------------");
        System.out.println("Ingredientes");
        System.out.println("------------------------");
        System.out.println(ConsoleColors.PURPLE + """
                6 espigas de milho verde
                1 litro de leite
                1 xícara (chá) de açúcar
                Canela em pó a gosto                           
                """ + ConsoleColors.RESET);
        System.out.println(ConsoleColors.BLUE + "------------------------");
        System.out.println("Modo de Preparo");
        System.out.println("------------------------");
        System.out.println(ConsoleColors.PURPLE + """
                1 -> Rale as espigas de milho e bata no liquidificador com o leite.
                2 -> Coe a mistura e despeje em uma panela.
                3 -> Adicione o açúcar e leve ao fogo baixo, mexendo sempre, até engrossar.
                4 -> Despeje em um recipiente e polvilhe canela em pó.
                5 -> Deixe esfriar antes de servir.                              
                """ + ConsoleColors.RESET);
        return curau;
    }

    public String getMaca_doAmor() {
        System.out.println(ConsoleColors.BLUE + "========================");
        System.out.println("      Maçã do Amor      ");
        System.out.println("========================");
        System.out.println("------------------------");
        System.out.println("Ingredientes");
        System.out.println("------------------------");
        System.out.println(ConsoleColors.PURPLE + """
                6 maçãs
                2 xícaras (chá) de açúcar
                1 xícara (chá) de água
                1 colher (sopa) de vinagre
                Corante vermelho a gosto
                Palitos de sorvete                           
                """);
        System.out.println(ConsoleColors.BLUE + "------------------------");
        System.out.println("Modo de Preparo");
        System.out.println("------------------------");
        System.out.println(ConsoleColors.PURPLE + """
                1 -> Lave bem as maçãs e espete um palito de sorvete em cada uma.
                2 -> Em uma panela, misture o açúcar, a água, o vinagre e o corante.
                3 -> Leve ao fogo médio, sem mexer, até formar uma calda em ponto de bala dura.
                4 -> Banhe cada maçã na calda, cobrindo bem.
                5 -> Coloque as maçãs em uma superfície untada com manteiga para secar.                              
                """ + ConsoleColors.RESET);
        return maca_doAmor;
    }

    public String getPe_deMoleque() {
        System.out.println(ConsoleColors.BLUE + "========================");
        System.out.println("     Pé de Moleque      ");
        System.out.println("========================");
        System.out.println("------------------------");
        System.out.println("Ingredientes");
        System.out.println("------------------------");
        System.out.println(ConsoleColors.PURPLE + """
                500g de amendoim
                2 xícaras (chá) de açúcar mascavo
                1 xícara (chá) de rapadura ralada                           
                """ + ConsoleColors.RESET);
        System.out.println(ConsoleColors.BLUE + "------------------------");
        System.out.println("Modo de Preparo");
        System.out.println("------------------------");
        System.out.println(ConsoleColors.PURPLE + """
                1 -> Torre o amendoim em uma frigideira até ficar dourado.\s
                2 -> Deixe esfriar e retire a pele.
                3 -> Em uma panela, derreta o açúcar mascavo e a rapadura em fogo baixo, mexendo sempre até formar um caramelo.
                4 -> Adicione o amendoim ao caramelo e misture bem.
                5 -> Despeje a mistura em uma superfície untada com manteiga e espalhe com uma espátula.
                6 -> Deixe esfriar e corte em pedaços.                              
                """ + ConsoleColors.RESET);
        return pe_deMoleque;
    }

    public String getQuentao() {
        System.out.println(ConsoleColors.BLUE + "========================");
        System.out.println("     Pé de Moleque      ");
        System.out.println("========================");
        System.out.println("------------------------");
        System.out.println("Ingredientes");
        System.out.println("------------------------");
        System.out.println(ConsoleColors.PURPLE + """
                1 litro de cachaça
                1 xícara (chá) de água
                500g de açúcar
                50g de gengibre cortado em fatias
                2 limões cortados em rodelas
                5 cravos-da-índia
                2 paus de canela                          
                """);
        System.out.println(ConsoleColors.BLUE + "------------------------");
        System.out.println("Modo de Preparo");
        System.out.println("------------------------");
        System.out.println(ConsoleColors.PURPLE + """
                1 -> Em uma panela grande, coloque o açúcar, o gengibre, os cravos e a canela.
                2 -> Leve ao fogo baixo, mexendo sempre, até o açúcar derreter e formar um caramelo.
                3 -> Adicione a água, a cachaça e as rodelas de limão.
                4 -> Deixe ferver por 20 minutos.
                5 -> Sirva quente.                              
                """ + ConsoleColors.RESET);
        return quentao;
    }
}
