public class Mammal {
    private String species;
    private int age;
    private boolean isDomestic;

    public Mammal(){

    }
    public Mammal(String species, int age, boolean isDomestic){
        this.species = species;
        this.age = age;
        this.isDomestic = isDomestic;
    }

    public void setSpecies(String species){
        this.species = species;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setDomestic(boolean isDomestic){
        this.isDomestic = isDomestic;
    }
    public String getSpecies(){
        return species;
    }
    public int getAge(){
        return age;
    }
    public boolean getIsDomestic(){
        return isDomestic;
    }


    public void displayInfo(){
        System.out.println("Species: " + species);
        System.out.println("Age: " + age);
        System.out.println("Domestic: " + (isDomestic ? "Yes" : "No"));
    }

    public void makeSound(){
        System.out.println("The " + species + " is making a sound");
    }
}
