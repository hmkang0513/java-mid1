package nested.test;

import org.w3c.dom.ls.LSOutput;

public class OuterClass2 {
    // InnerClass 구현, hello() 메서드를 만들기
    class InnerClass {  // static 빼고
        public void hello(){
            System.out.println("InnerClass.hello");
        }
    }
}
