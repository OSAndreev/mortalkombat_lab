package fixed_laba5.enemys;

import fixed_laba5.player.Player;

import javax.swing.ImageIcon;


public class Baraka extends Player {
    
    
    public Baraka(int level, int health, int  damage, int attack){
        super (level, health, damage, attack);
        picture = new ImageIcon(this.getClass().getResource("/Baraka.gif"));
    }
    
    @Override
    public String getName(){
        return "Baraka";
    }
    
   
    
}
