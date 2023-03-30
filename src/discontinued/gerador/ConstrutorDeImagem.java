package discontinued.gerador;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.font.FontRenderContext;
import java.awt.font.TextLayout;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.imageio.ImageIO;

import discontinued.Style;

/*
 * Desafios da aula 2
 * 
 * Criar diretório de saída das imagens, se ainda não existir.
 * 
 * Centralizar o texto na figurinha.
 * 
 * Colocar outra fonte como a Comic Sans ou a Impact.
 * 
 * Colocar contorno (outline) no texto da imagem.
 * 
 * Colocar uma imagem e fazer com que o texto da figurinha seja personalizado de acordo com as classificações do IMDB.
 * 
 */

public class ConstrutorDeImagem extends Style {

    public void gerar(InputStream is, String nome, int rating) throws Exception {

        // 2.1 - Ler a imagem

        // A partir de um arquivo local
        // is = new FileInputStream(new File("res/resultado_1.png"));

        // A partir de um link da internet
        // is = new URL("https://raw.githubusercontent.com/alura-cursos/imersao-java-2-api/main/MostPopularMovies_3.jpg").openStream();

        BufferedImage imagemOriginal = ImageIO.read(is);

        // 2.2 - Criar nova imagem com transparencia e dimensões novas
        int largura = imagemOriginal.getWidth();
        int altura = imagemOriginal.getHeight();
        int novaAltura = altura + 200;
        BufferedImage novaImagem = new BufferedImage(largura, novaAltura, BufferedImage.TRANSLUCENT);

        // 2.3 - Copiar a imagem original para a nova imagem
        Graphics2D g = (Graphics2D) novaImagem.getGraphics();
        g.drawImage(imagemOriginal, null, 0, 0);

        // 2.4 - Configurar o estilo da fonte
        int tamanhoFonte = 100;
        // Fonte genérica
        var fonte = new Font(Font.SANS_SERIF, Font.BOLD, tamanhoFonte);
        // Fonte específica
        //var fonte = new Font("Impact", Font.BOLD, tamanhoFonte);
        g.setFont(fonte);
        g.setColor(Color.YELLOW);

        // 2.5 - Gerar texto na imagem (e centralizar)
        String texto = "";
        BufferedImage emoji = null;
        switch (rating) {
            case 10:
                texto = "Nota 10"; 
                g.setColor(new Color(250, 202, 35)); 
                emoji = ImageIO.read(new FileInputStream(new File("assets/Sunglasses Emoji.png")));
                break;
            case 9:
                texto = "Nota 9";  
                g.setColor(new Color(250, 173, 28));
                emoji = ImageIO.read(new FileInputStream(new File("assets/Smiling Emoji with Eyes Opened.png")));
                break;
            case 8:
                texto = "Nota 8";  
                g.setColor(new Color(249, 136, 20));
                emoji = ImageIO.read(new FileInputStream(new File("assets/Slightly Smiling Face Emoji.png"))); 
                break;
            case 7:
                texto = "Nota 7";  
                g.setColor(new Color(248, 101, 11));
                emoji = ImageIO.read(new FileInputStream(new File("assets/Thinking Emoji.png"))); 
                break;
            case 6:
                texto = "Nota 6";  
                g.setColor(new Color(248, 71, 4));
                emoji = ImageIO.read(new FileInputStream(new File("assets/Grinmacing Face Emoji.png")));
                break;
            case 5:
                texto = "Nota 5";  
                g.setColor(new Color(248, 59, 1));
                emoji = ImageIO.read(new FileInputStream(new File("assets/Very Angry Emoji.png")));
                break;
        
            default:
                texto = "Não perca seu tempo...";  
                g.setColor(Color.RED);
                emoji = ImageIO.read(new FileInputStream(new File("assets/Voltage Emoji.png")));
                break;
        }
        
        g.drawImage(emoji, null, largura - 650, novaAltura - 650);

        FontMetrics fm = g.getFontMetrics();
        int tamanhoTexto = fm.stringWidth(texto);

        g.drawString(texto, (largura / 2) - (tamanhoTexto / 2), novaAltura - 60);

        // Adicionando contorno ao texto
        AffineTransform trans = g.getTransform();
        trans.translate((largura / 2) - (tamanhoTexto / 2), novaAltura - 60);
        g.transform(trans);

        FontRenderContext frc = g.getFontRenderContext();
        var tl = new TextLayout(texto, g.getFont().deriveFont((float)tamanhoFonte), frc);
        Shape shape = tl.getOutline(null);
        g.setStroke(new BasicStroke(3f));
        g.setColor(Color.BLACK);
        g.draw(shape);

        // 2.6 - Gerar um arquivo da imagem
        while (true) {
            try {
                ImageIO.write(novaImagem, "png", new File("saida/" + nome + ".png"));
                System.out.println(T_VERDE + "Imagem gerada com sucesso." + RESETAR);
                break;
            } catch (Exception e) {
                System.out.println(T_VERMELHA + "Pasta não existe." + RESETAR);
                Files.createDirectories(Paths.get("saida"));
                System.out.println(T_AZUL + "Nova pasta criada." + RESETAR);
            }
        }
    }

}
