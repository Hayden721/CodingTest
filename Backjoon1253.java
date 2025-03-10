
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Backjoon1253 {
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 입력 위해 선언
        int N = Integer.parseInt(br.readLine());
        int result = 0;
        long[] a = new long[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i<N; i++) {
            a[i] = Long.parseLong(st.nextToken());
            // System.out.println("a[i] : "+ a[i]);
        }

        // 배열 정렬
        Arrays.sort(a);

        for(int k=0; k<N; k++) {
            long find = a[k]; // i + j의 합이어야 한다는 것을 체크
            // 투 포인터 사용 변수
            int i = 0;
            int j = N-1;

            while(i < j) {
                if(a[i] + a[j] == find) {
                    if(i != k && j != k) { 
                        result++;
                        break;
                    }else if (i == k) {
                        i++;
                    }else if(j == k) {
                        j--;
                    }

                }else if(a[i] + a[j] < find) {
                    i++;
                }else {
                    j--;
                }
            }

        }

        System.out.println(result);
        br.close();

    }
}
