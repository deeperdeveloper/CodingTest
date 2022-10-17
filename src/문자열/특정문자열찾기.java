package 문자열;

import java.util.Scanner;

class Main {


    /**
     * <같은 문자 찾기> 문제
     */


    // 로직 작성
    public int solution(String str, char c) {

        // c가 몇 번 나왔는지의 횟수를 저장하는 변수
        int answer = 0;

        // 입력받은 문자와 검색하고자 하는 문자를 모두 대문자로 만듦.
        str = str.toUpperCase();
        c = Character.toUpperCase(c);

        // str 문자열의 각 문자 중 c와 겹치는 문자가 몇 개인지 확인하는 코드
        // 향상된 for문 활용
        for (char element : str.toCharArray()) {
            if (element == c) {
                answer++;
            }
        }

        return answer;


    }


    // 필요한 객체들 생성 후, 로직이 담긴 함수 실행
    public static void main(String[] args) {

        Main main = new Main();

        // 문자열을 입력받을 스캐너 객체 생성
        Scanner sc = new Scanner(System.in);

        // 입력한 문자열을 저장할 변수 설정
        String str = sc.next();
        // 찾고자 하는 알파벳을 저장할 변수 설정
        char c = sc.next().charAt(0);  //입력한 문자열 중, 맨 앞의 알파벳만 고려

        //로직이 담긴 메서드 실행결과 출력
        System.out.println(main.solution(str, c));

    }

}

/**
 * 좀 더 깊게 고민해봐야 할 사항
 * 1. 향상된 for문 vs index 활용 for문    (성능 차이) -> array, arraylist,linkedlist
 * 2. sc.next()와 sc.nextLine()의 차이
 */




