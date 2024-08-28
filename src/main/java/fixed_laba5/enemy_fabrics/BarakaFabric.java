package fixed_laba5.enemy_fabrics;

import fixed_laba5.enemys.Baraka;
import fixed_laba5.player.Player;


public class BarakaFabric implements EnemyFabricInterface {

    @Override
    public Player create(int i) {
        Player enemy;
        enemy = new Baraka(1, 100, 12, 1);
        return enemy;
    }
}
