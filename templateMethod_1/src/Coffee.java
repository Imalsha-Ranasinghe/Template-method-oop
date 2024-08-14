public class Coffee extends CaffeineBeverage {

    @Override
    void brew() {
        System.out.println ("Dripping Coffee thru filters");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding sugar and milk");
    }
}