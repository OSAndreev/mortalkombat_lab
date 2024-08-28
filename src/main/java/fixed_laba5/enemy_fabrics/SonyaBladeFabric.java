package fixed_laba5.enemy_fabrics;

import fixed_laba5.enemys.SonyaBlade;
import fixed_laba5.player.Player;


public class SonyaBladeFabric implements EnemyFabricInterface {

    @Override
    public Player create(int i) {
        Player enemy;
        enemy = new SonyaBlade(1, 80, 16, 1);
        return enemy;
    }

}
