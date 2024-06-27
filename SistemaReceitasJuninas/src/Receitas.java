import java.util.List;

public class Receitas {
    protected String receita;
    protected List<String> ingredientes;

    public Receitas(String receita, List<String> ingredientes) {
        this.receita = receita;
        this.ingredientes = ingredientes;
    }

    @Override
    public String toString(){
        return "Receita -> " + receita;
    }
}
