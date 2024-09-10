package hw3;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        ArrayList result;
        String answer = null;
        Loop:
        while (true) {
            while (true) {
                System.out.print("num1 : ");
                num1 = sc.nextInt();
                System.out.print("num2 : ");
                num2 = sc.nextInt();
                if (num1 >= 0 && num2 >= 0) { // 양의 정수를 입력받아야 하기 때문에 0미만이 입력될	경우 다시 입력되게 조건문 작성
                    System.out.println("알맞게 입력 되었습니다");
                    break;
                } else {
                    System.out.println("다시 입력하세요");
                }
            }
            System.out.print("사칙연산 기호를 입력하세요 : ");
            sc.nextLine();
            String operator = sc.nextLine();
            calculator.calculate(operator, num1, num2);
            System.out.println("결과 : "+ calculator.getResList());
            calculator.removeResult();
            System.out.print("더 입력하시겠습니까? : ");
            answer = sc.nextLine();
            if(answer.equals("exit")){ //반복문이 무한루프가 되면 안되므로 exit을 입력했을때 종료되게 작성
                System.out.println("종료되었습니다");
                break Loop;
            }else{
                System.out.println("계산이 진행됩니다.");
            }
        }
    }
}
