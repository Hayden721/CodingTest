package Backjoon;

import java.util.Scanner;

// 수의 정렬
/*
 * 문제 : N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
 * 입력 : 첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000)이 주어진다. 둘째 줄부터 N개의 줄에는 수가 주어진다. 이 수는 절댓값이 1,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.
 * 출력 : 5 / 5 / 2 / 3 / 4 / 1 => 1 2 3 4 5
 */

public class Backjoon_2750 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i=0; i<N; i++) {
            A[i] = sc.nextInt();
        }
        
        for(int i=0; i < N-1; i++) { //
            for(int j=0; j < N-1-i; j++) { // 이미 정렬된 부분을 제외하기 위해 N-1-i로 범위 지정
                // 배열의 왼쪽보다 오른쪽이 크면 배열의 순서를 바꾼다.
                if(A[j] > A[j+1]) { 
                    int temp = A[j]; // temp에 A[j]값을 임시 저장
                    A[j] = A[j+1]; // A[j]에 A[j+1] 값을 할당 (swap)
                    A[j+1] = temp; // A[j+1]에 원래 A[j]값을 넣는다. (swap 완료)
                }
            }
        }
        for(int i=0; i<N; i++) {
            System.out.println(A[i]);
        }
    }
}
