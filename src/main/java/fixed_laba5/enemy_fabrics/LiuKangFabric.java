package fixed_laba5.enemy_fabrics;

import fixed_laba5.enemys.LiuKang;
import fixed_laba5.player.Player;


public class LiuKangFabric implements EnemyFabricInterface {

    @Override
    public Player create(int i) {
        Player enemy;
        enemy = new LiuKang(1, 70, 20, 1);
        return enemy;
    }
}
