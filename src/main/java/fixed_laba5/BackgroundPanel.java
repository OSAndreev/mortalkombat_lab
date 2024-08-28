package com.mycompany.laba5;
import javax.swing.*;
import java.awt.*;

public class BackgroundPanel extends JPanel {
    private Image backgroundImage;

    public BackgroundPanel(String imagePath) {
        // Загрузка изображения из пути
        ImageIcon icon = new ImageIcon(this.getClass().getResource(imagePath));
        backgroundImage = icon.getImage();
    }

    public void setBackgroundImage(String imagePath) {
        ImageIcon icon = new ImageIcon(this.getClass().getResource(imagePath));
        backgroundImage = icon.getImage();
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Рисуем изображение на фоне
        if (backgroundImage != null) {
            g.drawImage(backgroundImage, 0, 0, this.getWidth(), this.getHeight(), this);
        }
    }
}

