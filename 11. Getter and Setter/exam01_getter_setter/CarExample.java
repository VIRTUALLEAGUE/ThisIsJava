package sec14.exam01_getter_setter;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.setSpeed(-600);
        myCar.setStop(false);

        System.out.println(myCar.getSpeed());
        System.out.println(myCar.isStop());

        myCar.setSpeed(10);
        myCar.setStop(true);

        System.out.println(myCar.getSpeed());
        System.out.println(myCar.isStop());
    }
}
