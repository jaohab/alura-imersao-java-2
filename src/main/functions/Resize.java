package main.functions;

import java.awt.Image;
import java.awt.image.BufferedImage;

public class Resize {

    /**
     * Redimensiona a imagem {@code BufferedImage} recebendo como paramentro de largura {@code int} em pixels e calculando proporcinalmente a altura.
     * @param img {@code BufferedImage} 
     * @param targetWidth {@code int}
     * @return {@code BufferedImage} 
     * 
     */
    public BufferedImage resizeImage(BufferedImage img, int targetWidth) {

        // REGRA DE 3 - Encontrar a altura (Height) proporcional a largura (Width)
        int originalWidth = img.getWidth();
        int originalHeight = img.getHeight();
        int targetHeight = (originalHeight * targetWidth) / originalWidth;

        // Redimensionar a imagem original
        Image imgResize = img.getScaledInstance(targetWidth, targetHeight, Image.SCALE_SMOOTH);

        // Criar nova imagem com as novas dimensões
        BufferedImage outputImg = new BufferedImage(targetWidth, targetHeight, BufferedImage.TRANSLUCENT);

        // Copiar a imagem redimensionada para a nova imagem
        outputImg.getGraphics().drawImage(imgResize, 0, 0, null);

        return outputImg;
    }

}
