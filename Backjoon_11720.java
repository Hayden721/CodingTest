import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Backjoon_11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 입력받을 숫자의 개수
        String S = br.readLine(); // 공백없이 숫자 입력
        int sum = 0; // 숫자 총 합의 값
        
        for(int i = 0; i < N; i++) {
            sum += S.charAt(i)- '0';
        }
    
        System.out.println(sum);



    
    }
    
}
