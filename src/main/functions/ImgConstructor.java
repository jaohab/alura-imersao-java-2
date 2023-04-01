package main.functions;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.imageio.ImageIO;

import main.res.Style;
    
    public class ImgConstructor extends Style {

        // Constrói e salva uma imagem nova 
        // Recebe um nome, o link da imagem original e um número (classificação)

        public void gerar(String nome, InputStream is, int rating) throws Exception {
    
            // Carregar a imagem
            BufferedImage imgOriginal = ImageIO.read(is);

            // Redimensionar a imagem
            var resize = new Resize();
            BufferedImage imgResized = resize.resizeImage(imgOriginal, 200);

            // Criar nova imagem com transparência e dimensões novas
            int largura = imgResized.getWidth();
            int altura = imgResized.getHeight() + 200;
            BufferedImage sticker = new BufferedImage(largura, altura, BufferedImage.TRANSLUCENT);
    
            // Copiar a imagem redimensionada para a nova imagem (sticker)
            sticker.getGraphics().drawImage(imgResized, 0, 0, null);

            // Converter BufferedImage para Graphics2D
            Graphics2D g2d = (Graphics2D) sticker.getGraphics();

            // Gerar texto de acordo com a classificação
            boolean valid = true;
            if (rating == 0) {valid = false;}

            var txt = new TxtConstructor();
            g2d = txt.txtGenerator(rating, g2d, valid);




            
    
            // 2.6 - Gerar um arquivo da imagem
            while (true) {
                try {
                    ImageIO.write(sticker, "png", new File("saida/" + nome + ".png"));
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
   