public class Character {
    public String characterName = "Gandalf";
    public int level = 0;
    public int healthPoints = 200;
    public int manaPoints = 200;
    public int recover = 50;

    Character(String name) {
        characterName = name;
    }

    public void damageTarget(Character enemyCharacter, int damagePoints) {
        System.out.println("Status: ");
        enemyCharacter.healthPoints -= damagePoints;
        System.out.println(enemyCharacter.characterName + " HP left = " + enemyCharacter.healthPoints);
        //Will update the status of the character

        if (enemyCharacter.healthPoints <= 0) {
            System.out.println(enemyCharacter.characterName + " is now defeated! ");
        }
        //Prompt Character is defeated if HP falls below 0

    }

    public void healTarget(Character enemyCharacter, int healPoints) {

        enemyCharacter.healthPoints += healPoints;
        System.out.println(enemyCharacter.characterName + " HP Left = " + enemyCharacter.healthPoints);

    }

    public void manaTarget(Character enemyCharacter, int manaPoints) {

        enemyCharacter.manaPoints -= manaPoints;
        System.out.println(characterName + " Mana left = " + enemyCharacter.manaPoints);

    }

    public void manaTarget2(Character enemyCharacter, int manaPoints) {

        enemyCharacter.manaPoints -= manaPoints;
        System.out.println(characterName + " Mana left = " + enemyCharacter.manaPoints);

    }

    public void levelTarget(Character enemyCharacter, int level) {

        enemyCharacter.level += 16;
        System.out.println(characterName + " gained 10 levels! ");
        System.out.println(characterName + " leveled up to = lvl " + enemyCharacter.level);
        enemyCharacter.level = level;
        //This is the reward of who wins the fight

    }


}