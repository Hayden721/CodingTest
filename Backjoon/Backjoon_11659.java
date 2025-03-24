package Backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 구간 합 구하기 4
/*
 *  문제 : 수 N개가 주어졌을 때, i번째 수부터 j번째 수까지 합을 구하는 프로그램을 작성하시오.
 *  입력 : 첫째 줄에 수의 개수 N과 합을 구해야 하는 횟수 M이 주어진다. 둘째 줄에는 N개의 수가 주어진다. 
 *          수는 1,000보다 작거나 같은 자연수이다. 셋째 줄부터 M개의 줄에는 합을 구해야 하는 구간 i와 j가 주어진다.
 *  출력 : 총 M개의 줄에 입력으로 주어진 i번째 수부터 j번째 수까지 합을 출력한다.
 *  제한 : 1 ≤ N ≤ 100,000
            1 ≤ M ≤ 100,000
            1 ≤ i ≤ j ≤ N
 *  예제 입력 : 5 3 / 5 4 3 2 1 / 1 3 / 2 4 / 5 5
 * 
 *  합 배열
 *  0 1 2 3 4 5
 * 
 *  0 5 4 3 2 1
 *  0 5 9 12 14 15
 */
public class Backjoon_11659 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int dataNo = Integer.parseInt(st.nextToken()); // 입력받을 데이터 개수
        int quizNo = Integer.parseInt(st.nextToken()); // 질문 개수
        long[] S = new long[dataNo + 1]; // 합 배열 선언
        st = new StringTokenizer(br.readLine()); // 배열에 넣을 데이터 입력

        for(int i=1; i<=dataNo; i++) { // 합 배열
            S[i] = S[i-1] + Integer.parseInt(st.nextToken());
        }

        for(int q=0; q < quizNo; q++) { // 질의 개수만큼 반복 
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            System.out.println(S[j] - S[i-1]); 
        }


    }
}

