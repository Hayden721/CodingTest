package Backjoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;



public class Backjoon_12891 {
    static int myArr[];
    static int checkArr[];
    static int checkSecret;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int S = Integer.parseInt(st.nextToken()); // DNA 문자열의 길이
        int P = Integer.parseInt(st.nextToken()); // DNA 부분 문자열의 길이
        int result = 0; // 정답값
        checkArr = new int[4]; // 비밀번호 체크 배열
        myArr = new int[4];
        char A[] = new char[S]; // 전체 DNA 문자열
        checkSecret = 0;

        A = bf.readLine().toCharArray();
        st = new StringTokenizer(bf.readLine());
        
        for(int i=0; i<4; i++) {
            checkArr[i] = Integer.parseInt(st.nextToken());
            if(checkArr[i] == 0 ) {
                checkSecret++;
            }
        }
        for(int i=0; i< P; i++) { 
            Add(A[i]);
        }

        if(checkSecret == 4) result++;
        
        //슬라이딩 윈도우
        for(int i=P; i<S; i++) {
            int j = i-P;
            Add(A[i]);
            Remove(A[j]);
            if(checkSecret == 4) result++;
        }

        System.out.println(result);
        bf.close();
    }

    private static void Remove(char c) {
        switch (c) {
        case 'A':
            
            if(myArr[0] == checkArr[0]) checkSecret--;
            myArr[0]--;
            break;
        case 'C':
            myArr[1]--;
            if(myArr[1] == checkArr[1]) checkSecret--;
            break;
        case 'G':
            myArr[2]--;
            if(myArr[2] == checkArr[2]) checkSecret--;
            break;
        case 'T':
            myArr[3]--;
            if(myArr[3] == checkArr[3]) checkSecret--;
            break;
        }
    }

    private static void Add(char c) {
        switch (c) {
        case 'A':
            myArr[0]++;
            if(myArr[0] == checkArr[0]) checkSecret++;
            break;
        case 'C':
            myArr[1]++;
            if(myArr[1] == checkArr[1]) checkSecret++;
            break;
        case 'G':
            myArr[2]++;
            if(myArr[2] == checkArr[2]) checkSecret++;
            break;
        case 'T':
            myArr[3]++;
            if(myArr[3] == checkArr[3]) checkSecret++;
            break;
        }
    }
}
