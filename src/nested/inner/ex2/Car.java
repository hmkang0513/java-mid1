package nested.inner.ex2;


public class Car {
    private String model;
    private int chargeLevel;
    private Engine engine;

    public Car(String model, int chargeLevel) {
        this.model = model;
        this.chargeLevel = chargeLevel;
        this.engine = new Engine(); // this X
    }
    // engine에서만 사용하는 메서드
    public String getModel() {
        return model;
    }

    // engine에서만 사용하는 메서드
    public int getChargeLevel() {
        return chargeLevel;
    }
    
    public void start(){
        engine.start();
        System.out.println(model + " 시작 완료");
    }
    // engine을 내부에 넣음
    public class Engine {
        // car에 대한 정보가 이 안에 없어도 됨. 바깥에 있기 때문에
//        private Car car;
//
//        public Engine(Car car) {
//            this.car = car;
//        }

        public void start(){
//            System.out.println("충전 레벨 확인: " + car.getChargeLevel());
            System.out.println("충전 레벨 확인: " + chargeLevel);
//            System.out.println(car.getModel() + "의 엔진을 구동합니다.");
            System.out.println(model + "의 엔진을 구동합니다.");
        }
    }
}
