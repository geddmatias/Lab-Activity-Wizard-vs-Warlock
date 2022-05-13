public class Wizard extends Character {
    Wizard(String name) {
        super(name);
    }
    //Wizard's skill set
    public void Tornado (Character enemyCharacter) {

        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName
                + " with Tornado (Damage - 30, Mana Cost - 15)");
        int damagePoints = 30;
        damageTarget(enemyCharacter, damagePoints);
        int manaPoints = 15;
        manaTarget(enemyCharacter, manaPoints);

    }

    public void Sunstrike (Character enemyCharacter) {
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName
                + " with Sunstrike (Damage - 45, Mana Cost - 20)");
        int damagePoints = 50;
        damageTarget(enemyCharacter, damagePoints);
        int manaPoints = 15;
        manaTarget(enemyCharacter, manaPoints);

    }

    public void DeafiningBlast (Character enemyCharacter) {
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName
                + " with DeafiningBlast (Damage - 35, Mana Cost - 15)");
        int damagePoints = 35;
        damageTarget(enemyCharacter, damagePoints);
        int manaPoints = 15;
        manaTarget(enemyCharacter, manaPoints);

    }

    public void Satanic (Character characterName) {
        System.out.println(super.characterName + " Uses Satanic (Heal - 50 hp)");
        int healPoints = 50;
        healTarget(characterName, healPoints);
        //Self-healing skill of Invoker
    }

    public void EMP (Character characterName) {
        System.out.println(super.characterName + " Use Emp (Damage - 20, Mana Cost - 10)");
        int damagePoints = 20;
        damageTarget(characterName, damagePoints);
        int manaPoints = 10;
        manaTarget(characterName, manaPoints);
    }

    public void Meteor (Character enemyCharacter) {
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName
                + " with Meteor (Damage - 40, Mana Cost - 20)");
        int damagePoints = 40;
        damageTarget(enemyCharacter, damagePoints);
        int manaPoints = 20;
        manaTarget2(enemyCharacter, manaPoints);

    }

    public void ColdSnap (Character enemyCharacter) {
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName
                + " with ColdSnap (Damage - 25, Mana Cost - 15)");
        int damagePoints = 25;
        damageTarget(enemyCharacter, damagePoints);
        int manaPoints = 15;
        manaTarget(enemyCharacter, manaPoints);
        levelTarget(enemyCharacter, level);
    }

}