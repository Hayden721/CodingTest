import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Backjoon11659 {
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

        for(int q=0; q < quizNo; q++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            System.out.println(S[j] - S[i-1]);
        }


    }
}
