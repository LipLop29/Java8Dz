package kg.geektech.game.players;

import kg.geektech.game.general.RPG_GAME;

public class Thor extends Hero {

    public Thor(int health, int damage) {
        super(health, damage, SuperAbility.STUN);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        RPG_GAME.statusStun = RPG_GAME.random.nextBoolean();

    }
    //
//        this.setHealth(this.getHealth());
//        boss.setHealth(boss.getHealth());
//    int berserkDamage = this.getDamage();
//        this.setDamage(berserkDamage + saveDamageAndRevert);
//
//        this.setDamage(berserkDamage);
}
