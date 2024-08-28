package fixed_laba5.enemys;

import fixed_laba5.player.Player;

import javax.swing.ImageIcon;


public class LiuKang extends Player {
    
    
    public LiuKang(int level, int health, int  damage, int attack){
        super (level, health, damage, attack);
         picture = new ImageIcon(this.getClass().getResource("/LiuKang.gif"));
    }
    
    @Override
    public String getName(){
        return "Liu Kang";
    }
}
