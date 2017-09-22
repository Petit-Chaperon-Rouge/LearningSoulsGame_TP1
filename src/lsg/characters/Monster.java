package lsg.characters;

/**
 * Created by alecoeuc on 22/09/17.
 */
public class Monster {

    private String name;
    private int life;
    private int maxLife;
    private int stamina;
    private int maxStamina;

    static int INSTANCES_COUNT = 0;


    // Getters & Setters


    /**
     *
     * @return (String) Le nom du monstre
     */
    public String getName(){
        return this.name;
    }

    /**
     * Changer ou donner le nom du monstre
     * @param name Le nom du monstre
     */
    protected void setName(String name){
        this.name = name;
    }



    /**
     *
     * @return (int) La vie restante du monstre
     */
    public int getLife(){
        return this.life;
    }

    /**
     * Modifie la valuer de la vie restante du monstre
     * @param life La vie restante du monstre
     */
    protected void setLife(int life){
        this.life = life;
    }



    /**
     *
     * @return (int) La valeur maximale de vie du monstre
     */
    public int getMaxLife(){
        return this.maxLife;
    }

    /**
     * Modifie la valeur maximale de vie du monstre
     * @param maxLife La valeur maximale de vie du monstre
     */
    protected void setMaxLife(int maxLife){
        this.maxLife = maxLife;
    }



    /**
     *
     * @return (int) La force restante du monstre
     */
    public int getStamina(){
        return this.stamina;
    }

    /**
     * Modifie la force restante du monstre
     * @param stamina La force restante du monstre
     */
    protected void setStamina(int stamina){
        this.stamina = stamina;
    }



    /**
     *
     * @return (int) La valeur de force maximale du monstre
     */
    public int getMaxStamina(){
        return this.maxStamina;
    }

    /**
     * Modifie la valeur de force maximale du monstre
     * @param maxStamina La valeur de force maximale du monstre
     */
    protected void setMaxStamina(int maxStamina){
        this.maxStamina = maxStamina;
    }


    // Constructeurs


    /**
     * Crée un monstre par défault nommé Monstre_N où N est le nombre de monstre déjà créé
     */
    public Monster(){
        INSTANCES_COUNT++;
        this.name = "Monster_" + INSTANCES_COUNT;
        this.life = 10;
        this.stamina = 10;
    }

    /**
     * Crée un monstre avec le nom choisi
     * @param name Le nom a donné au monstre
     */
    public Monster(String name){
        INSTANCES_COUNT++;
        this.name = name;
        this.life = 10;
        this.stamina = 10;
    }


    // Méthodes


    /**
     * Retourne les statistiques du monstre sur la console
     */
    public void printStats(){
        System.out.println(this.toString());
    }

    /**
     * Surcharge de toString
     * @return Les statistiques du monstre
     */
    public String toString(){
        String alive = (this.isAlive()) ? "ALIVE" : "DEAD" ;
        return ("[ Monster ]\t" + name + "\tLIFE: " + life + "\tSTAMINA: " + stamina + "\t(" + alive + ")");
    }

    public boolean isAlive(){
        boolean alive = (this.getLife()==0) ? false : true ;
        return alive;
    }


}
