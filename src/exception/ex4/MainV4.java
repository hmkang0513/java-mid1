package exception.ex4;


import exception.ex4.exception.SendExceptionV4;

import java.util.Scanner;

public class MainV4 {
    public static void main(String[] args) {
        NetworkServiceV4 networkService = new NetworkServiceV4();

        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.print("전송할 문자: ");
            String input = scan.nextLine();
            if(input.equals("exit")){
                break;
            }
            try{
                //공통으로 처리
                networkService.sendMessage(input);
            } catch(Exception e){
                exceptionHandler(e);
            }
        }
        System.out.println("프로그램을 정상 종료합니다.");
    }

    // 공통 예외 처리
    private static void exceptionHandler(Exception e) {
        System.out.println("사용자 메서지: 죄송합니다. 알 수 없는 문제가 발생했습니다." );
        System.out.println("== 개발자용 디버깅 메시지 == ");
        e.printStackTrace(System.out);  // 스택 트레이스 출력
        // e.printStackTrace();     // e.printStackTrace(System.err) 빨간색으로 보임 이쪽을 주로 사용한다고 함

        // 필요하면 예외 별로 별도의 추가 처리 가능
        if(e instanceof SendExceptionV4 sendEx4) {
            System.out.println("[전송 오류] 전송 데이터: " + sendEx4.getSendData());
        }

    }
}
