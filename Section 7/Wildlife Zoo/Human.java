public class Human extends Mammal {
    private String occupation;

    public Human(){

    }
    public Human(String name, int age, String occupation){
        super("Human", age, true);
        this.setSpecies("Human");
       

    }
}
