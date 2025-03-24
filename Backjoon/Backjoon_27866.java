package Backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문자와 문자열
/*
 *  문제 : 단어 S와 정수 i가 주어졌을 때, S의 i번쨰 글자를 출력하는 프로그램
 *  입력 : 첫째 줄에 영어 소문자와 대문자로만 이루어진 단어 S가 주어진다. 단어의 길이는 최대 1000이다.
 *          둘째 줄에 정수 i가 주어진다 (1 <= i <= |S|)
 *  예제 입력 : Sprout
 *            3
 */
public class Backjoon_27866 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 문자 입력
        String S = br.readLine(); // 찾고 싶은 i번째 입력
        int i = Integer.parseInt(br.readLine()) - 1; // 0부터 시작이기 때문에 입력한 i값에서 -1을 한다.

        br.close();
        System.out.println(S.charAt(i));
    }
}
