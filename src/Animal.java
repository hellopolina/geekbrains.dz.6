public class Animal {

    private int maxRunDistance;
    private int maxSwimDistance;

    public Animal(int maxRunDistance, int maxSwimDistance){
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
    }

    public void run(int requiredDistance)
    {
        if (requiredDistance > maxRunDistance){
            System.out.println("Слишком большая дистанция для бега" + requiredDistance);
            System.out.println("Максимально возможная дистанция: " + maxRunDistance);
        }
        else{
            System.out.println("Животное пробежало дистанцию: " + requiredDistance);
        }
    }

    public void swim(int requiredDistance) {
        if (requiredDistance > maxSwimDistance) {
            System.out.println("Слишком большая дистанция для плавания " + requiredDistance);
            System.out.println("Максимально возможная дистанция: " + maxRunDistance);
        } else {
            System.out.println("Животное проплыло: " + requiredDistance);
        }
    }
}
