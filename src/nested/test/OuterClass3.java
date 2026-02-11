package nested.test;

public class OuterClass3 {
    public void myMethod(){
        // 지역 클래스 LocalClass 구현 후 hello 메서드
        class LocalClass{
            public void hello(){
                System.out.println("LocalClass.hello");
            }
        }
        LocalClass local = new LocalClass();
        local.hello();
    }
}
