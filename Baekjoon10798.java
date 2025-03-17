import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// 백준 10798
public class Baekjoon10798 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[][] ch = new char[5][15];
        int max = 0; // 입력한 문자의 최대 길이

        for(int i=0; i<ch.length; i++) {
            String str = br.readLine();

            for(int j = 0; j < str.length(); j++) {
                ch[i][j] = str.charAt(j);
            }
        }

        for(int i=0; i<15; i++) {
            for(int j=0; j<5; j++) {
                if(ch[j][i] != '\u0000') {
                    System.out.print(ch[j][i]);
                }
            }
        }
    }
    
}
