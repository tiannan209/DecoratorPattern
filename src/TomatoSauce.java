public class TomatoSauce extends ToppingDecorator {
    @Override
    public String getDescription() {
        return super.getDescription() + ", Tomato Sauce";
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.50;
    }

    public TomatoSauce(Pizza newPizza) {
        super(newPizza);

        //System.out.println("Adding Dough");
        System.out.println("Adding Tomato Sauce");


    }
}