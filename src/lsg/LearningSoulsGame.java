package lsg;

import lsg.characters.Hero;
import lsg.characters.Monster;

/**
 * Created by alecoeuc on 22/09/17.
 */
public class LearningSoulsGame {
    public static void main(String[] args) {

        Hero hero = new Hero();
        Monster monster1 = new Monster("Studentatort");
        Monster monster2 = new Monster();
        Monster monster3 = new Monster();


        hero.printStats();
        monster1.printStats();
        monster2.printStats();
        monster3.printStats();

    }
}
