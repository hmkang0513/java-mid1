package lang.object;


// 명시적으로 상속받은 경우에는 Object를 상속받지 않음
public class Child extends Parent{
    public void childMethod(){
        System.out.println("Child.childMethod");
    }
}
