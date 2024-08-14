public abstract class CaffeineBeverage {
    final void prepareRecipe(){
        boilWater();
        brew();
        pourlnCup();
        addCondiments();
    }

    abstract void brew();
    abstract void addCondiments();

    void boilWater(){
        System.out.println("Boiling water");
    }

    void pourlnCup(){
        System.out.println("Pouring into cup");
    }
}
