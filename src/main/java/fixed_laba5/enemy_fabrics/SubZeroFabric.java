package fixed_laba5.enemy_fabrics;

import fixed_laba5.enemys.SubZero;
import fixed_laba5.player.Player;


public class SubZeroFabric implements EnemyFabricInterface {

    @Override
    public Player create(int i) {
        Player enemy;
        enemy = new SubZero(1, 60, 16, 1);
        return enemy;
    }

}
