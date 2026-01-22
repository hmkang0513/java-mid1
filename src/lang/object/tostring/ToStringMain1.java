package lang.object.tostring;

public class ToStringMain1 {
    public static void main(String[] args) {
        Object object = new Object();
        String string = object.toString();

        // toString() 반환값 출력
        System.out.println(string);

//        public String toString() {
//            return getClass().getName() + "@" + Integer.toHexString(hashCode());  객체의 참조값(해시코드) 16진수
//        }

        // object 직접 출력
        System.out.println(object);
        // println(Object x) {obj.toString();}  toString을 출력하는 것임
        //  ctrl + p
    }
}
