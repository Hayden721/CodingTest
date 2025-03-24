package Backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// X보다 작은 수
/*
 *  정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성
 *  예제 입력 1
 *  10 5 (수열에 입력받을 정수 A, 비교할 숫자 X)
 *  1 10 4 9 2 3 8 5 7 6 (A의 숫자만크 정수를 입력)
 *  비교할 숫자 X보다 작은 수를 수열에서 찾는다.
 */

public class Backjoon_10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine(), " ");

        for(int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < X) {
                bw.write(arr[i] + " ");        
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
