
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// 배열 합치기
/*
 * 정렬되어있는 두 배열 A와 B가 주어진다. 두 배열을 합친 다음 정렬해서 출력하는 프로그램을 작성하시오.

  입력
  첫째 줄에 배열 A의 크기 N, 배열 B의 크기 M이 주어진다. (1 ≤ N, M ≤ 1,000,000)
  둘째 줄에는 배열 A의 내용이, 셋째 줄에는 배열 B의 내용이 주어진다. 배열에 들어있는 수는 절댓값이 109보다 작거나 같은 정수이다.
  
  예제 입력 
  2 2 // A 배열의 크기 / B 배열의 크기
  3 5 // A 배열의 값 
  2 9 // B 배열의 값
  예제 출력 
  2 3 5 9
 */

public class Backjoon_11728 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    // 첫번째줄 두번쨰줄 입력 받기
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    int arr1[] = new int[n]; // 첫번째 배열
    int arr2[] = new int[m]; // 두번째 배열 
    int merge[] = new int[n+m]; // 합칠 배열

    // arr1 배열의 값 넣기
    st = new StringTokenizer(br.readLine());
    for(int i = 0; i < n; i++) {
      arr1[i] = Integer.parseInt(st.nextToken());
    }
    // arr2 배열의 값 넣기
    st = new StringTokenizer(br.readLine());
    for(int i = 0; i< m; i++) {
      arr2[i] = Integer.parseInt(st.nextToken());
    }
    // 포인터 정의 
    int p1=0; int p2=0; int k=0;
    // 배열 합치기
    while(p1 < n && p2 < m) {
      // arr2 배열이 큰 경우 merge 배열에 arr[p1]값을 넣고 p1을 증가
      if(arr1[p1] < arr2[p2]) {
        merge[k] = arr1[p1];
        p1++;
      } else {
        // arr1 배열이 더 큰 경우 merge 배열에 arr2[p2]를 넣고 p2를 증가
        merge[k] = arr2[p2];
        p2++;
      }
      // 전체 루프가 한 번 돌면 k값 증가
      k++;
    }
    // p1가 arr1의 길이가 작으면 arr1의 나머지 요소는 merge에 할당하고 p1과 p2 증가
    while(p1 < arr1.length) {
      merge[k] = arr1[p1];
      p1++;
      k++;
    }
    // p2가 arr2의 길이 보다 작으면 arr2의 나머지 요소는 merge에 할당하고 p2와 k 증가
    while(p2 < arr2.length) {
      merge[k] = arr2[p2];
      p2++;
      k++;
    }
    // 결과값 출력
    for(int i=0; i<merge.length; i++) {
      bw.write(merge[i] + " ");
    } 

    bw.flush();
    bw.close();

  }
}
