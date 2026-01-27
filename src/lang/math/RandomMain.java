package lang.math;

import java.util.Random;

public class RandomMain {
    public static void main(String[] args) {
//        Random random = new Random();
        Random random = new Random(1);  // seed 가 같으면 random의 결과가 같음
        int randomInt = random.nextInt();

        double randomDouble = random.nextDouble();
        System.out.println("randomDouble = " + randomDouble);

        boolean randomBoolean = random.nextBoolean();
        System.out.println("randomBoolean = " + randomBoolean);


        // 범위 조회
        int randomRange1 = random.nextInt(10);//0~9까지 출력
        System.out.println("1~10" + randomRange1);
        int randomRange2 = random.nextInt(10)+1; // 1 ~10W
        System.out.println("1~10" + randomRange2);

    }

}
