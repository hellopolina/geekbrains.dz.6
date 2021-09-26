public class Cat extends Animal {

    public Cat(int maxRunDistance){
        super(maxRunDistance, Integer.MIN_VALUE);
    };

    @Override
    public void swim(int requiredDistance)
    {
        System.out.println("Кошка не умеет плавать");
    }

}
