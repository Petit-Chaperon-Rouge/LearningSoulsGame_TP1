package lsg.characters;

/**
 * Created by alecoeuc on 22/09/17.
 */
public class Hero {

    private String name;
    private int life;
    private int maxLife;
    private int stamina;
    private int maxStamina;


    // Getters & Setters


    /**
     *
     * @return (String) Le nom du héro
     */
    public String getName(){
        return this.name;
    }

    /**
     * Changer ou donner le nom du héro
     * @param name Le nom du héro
     */
    protected void setName(String name){
        this.name = name;
    }



    /**
     *
     * @return (int) La vie restante du héro
     */
    public int getLife(){
        return this.life;
    }

    /**
     * Modifie la valuer de la vie restante du héro
     * @param life La vie restante du héro
     */
    protected void setLife(int life){
        this.life = life;
    }



    /**
     *
     * @return (int) La valeur maximale de vie du héro
     */
    public int getMaxLife(){
        return this.maxLife;
    }

    /**
     * Modifie la valeur maximale de vie du héro
     * @param maxLife La valeur maximale de vie du héro
     */
    protected void setMaxLife(int maxLife){
        this.maxLife = maxLife;
    }



    /**
     *
     * @return (int) La force restante du héro
     */
    public int getStamina(){
        return this.stamina;
    }

    /**
     * Modifie la force restante du héro
     * @param stamina La force restante du héro
     */
    protected void setStamina(int stamina){
        this.stamina = stamina;
    }



    /**
     *
     * @return (int) La valeur de force maximale du héro
     */
    public int getMaxStamina(){
        return this.maxStamina;
    }

    /**
     * Modifie la valeur de force maximale du héro
     * @param maxStamina La valeur de force maximale du héro
     */
    protected void setMaxStamina(int maxStamina){
        this.maxStamina = maxStamina;
    }


    // Constructeurs


    /**
     * Crée un héro par défault nommé Gregooninator
     */
    public Hero(){
        this.name = "Gregooninator";
        this.life = 100;
        this.stamina = 50;
    }

    /**
     * Crée un héro avec le nom choisi
     * @param name Le nom a donné au héro
     */
    public Hero(String name){
        this.name = name;
        this.life = 100;
        this.stamina = 50;
    }


    // Méthodes


    /**
     * Retourne les statistiques du héro sur la console
     */
    public void printStats(){
        System.out.println(this.toString());
    }

    /**
     * Surcharge de toString
     * @return Les statistiques du héro
     */
    public String toString(){
        String alive = (this.isAlive()) ? "ALIVE" : "DEAD" ;
        return ("[ Hero ]\t" + name + "\tLIFE: " + life + "\tSTAMINA: " + stamina + "\t(" + alive + ")");
    }

    public boolean isAlive(){ // Peut être mis en friendly
        boolean alive = (this.getLife()==0) ? false : true ;
        return alive;
    }



}
