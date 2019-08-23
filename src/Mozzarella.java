public class Mozzarella extends ToppingDecorator {
    @Override
    public String getDescription() {
        return super.getDescription() + ", Mozzarella";
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.80;
    }

    public Mozzarella(Pizza newPizza) {
        super(newPizza);

        System.out.println("Adding Dough");
        System.out.println("Adding Mozzarella");


    }
}
