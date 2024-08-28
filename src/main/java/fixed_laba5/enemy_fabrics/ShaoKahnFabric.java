package fixed_laba5.enemy_fabrics;

import fixed_laba5.enemys.ShaoKahn;
import fixed_laba5.player.Player;


public class ShaoKahnFabric implements EnemyFabricInterface{
    
    @Override
    public Player create(int i) {
        Player enemy;
        if(i==0){
            enemy = new ShaoKahn(3, 100, 30, 1);
        }
        else{
           enemy = new ShaoKahn(3, 145, 44, 1); 
        }
        return enemy;
    }
}
