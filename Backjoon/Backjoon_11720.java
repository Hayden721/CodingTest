package Backjoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 숫자의 합
/*
 *  예제 입력 1
 *  1 (입력할 숫자의 개수)
 *  1 
 *  
 *  예제 입력 2
 *  5 : 입력할 숫자의 개수
 *  54321 (숫자 5개를 공백없이 입력)
 */

public class Backjoon_11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 입력받을 숫자의 개수
        String S = br.readLine(); // 공백없이 숫자 입력
        int sum = 0; // 숫자 총 합의 값
        
        // 숫자의 개수만큼 반복하면서 연산을 한다.
        for(int i = 0; i < N; i++) { 
            // 공백없이 입력한 숫자를 charAt() 함수로 자르고 정수형으로 변환한다.
            sum += S.charAt(i)- '0'; 
        }
    
        System.out.println(sum);
    }
    
}
