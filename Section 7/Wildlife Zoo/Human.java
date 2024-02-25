public class Human extends Mammal {
    private String occupation;
    private String name;
    private int money;
    private String degree;
    public Human(){

    }
    public Human(String name, int age, String occupation){
        super("Human", age, true);
        this.setSpecies("Human");
       

    }
}
