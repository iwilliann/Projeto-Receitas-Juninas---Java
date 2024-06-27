import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.net.URL;

public class ImagemReceitas {
    private String imagem;

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public BufferedImage dimImagem(BufferedImage imagemOriginal, int largura, int altura){
        Image resultado = imagemOriginal.getScaledInstance(largura, altura, Image.SCALE_SMOOTH);
        BufferedImage saida = new BufferedImage(largura, altura, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g = saida.createGraphics();
        g.drawImage(resultado, 0, 0, null);
        g.dispose();
        return saida;
    }

    public void mostrarImagem(int largura, int altura){
        JFrame frame = new JFrame("Imagem Receita");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setResizable(false);

        try{
            URL urlImagem = getClass().getResource(imagem);
            if (urlImagem == null) {
                throw new IllegalArgumentException("Imagem não encontrada: " + imagem);
            }

            BufferedImage imagemOriginal = ImageIO.read(urlImagem);
            if (imagemOriginal == null) {
                throw new IOException("Não foi possível ler a imagem: " + imagem);
            }

            BufferedImage imagemDim = dimImagem(imagemOriginal, largura, altura);
            ImageIcon icon = new ImageIcon(imagemDim);
            JLabel label = new JLabel(icon);
            frame.add(label);
        }catch (IOException | IllegalArgumentException e){
            e.printStackTrace();
        }

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
