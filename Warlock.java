public class Warlock extends Character {
    Warlock(String name) {
        super(name);
    }
/**
     *   Warlock's skill method class
     *   Skills casts damage and mana decreases upon cast
     */
    public void ShadowRazeNear (Character enemyCharacter) {
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName
                + " with ShadowRazeNear (Damage - 50, Mana Cost - 25)");
        int damagePoints = 50;
        damageTarget(enemyCharacter, damagePoints);
        int manaPoints = 25;
        manaTarget(enemyCharacter, manaPoints);

    }

    public void ShadowRazeMedium (Character enemyCharacter) {
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName
                + " with ShadowRazeMedium (Damage - 50, Mana Cost - 25)");
        int damagePoints = 50;
        damageTarget(enemyCharacter, damagePoints);
        int manaPoints = 25;
        manaTarget(enemyCharacter, manaPoints);
    }

    public void ShadowRazeFar (Character enemyCharacter) {
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName
                + " with ShadowRazeFar (Damage - 50, Mana Cost - 25)");
        int damagePoints = 50;
        damageTarget(enemyCharacter, damagePoints);
        int manaPoints = 25;
        manaTarget(enemyCharacter, manaPoints);
    }

    public void RequimOfSouls (Character enemyCharacter) {
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName
                + " with RequimOfSouls (Damage - 75, Mana Cost - 30)");
        int damagePoints = 75;
        damageTarget(enemyCharacter, damagePoints);
        int manaPoints = 30;
        manaTarget(enemyCharacter, manaPoints);
    }
}