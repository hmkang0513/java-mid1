package lang.object.poly;

public class ObjectPolyExample1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();

        Object o = dog; // object가 dog를 담을 수 있음

        action(dog);
        action(car);
    }

    private static void action(Object obj){
//        obj.sound();
//        obj.move();
        //  컴파일 오류 . object에는 sound()가 없음, move()가 없음.

        // 객체에 맞는 다운캐스팅이 필요함
        if(obj instanceof Dog dog){
            dog.sound();
        } else if (obj instanceof Car car){
            car.move();
        }
    }
}
