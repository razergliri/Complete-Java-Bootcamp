public class Main{

    public static void main(String[] args) {
        //*****************************IMMUTABLE OBJECT *************************/
        Integer applesWrapper = 5;
        Integer applesWrapper2 = applesWrapper;
        applesWrapper2 = 10;

        System.out.println(applesWrapper);
        System.out.println(applesWrapper2);

        //*****************************MUTABLE OBJECT *************************/

        City city = new City("Paris", 21610000);
        City secondCity = new City(city);

        city.setPopulation(2261000);
        secondCity.setPopulation(22634000);
        city.setPopulation(2163400);
        secondCity.setPopulation(2443400);
    }
}