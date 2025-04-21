
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 소트인사이드
/*
 * 배열을 정렬하는 것은 쉽다. 수가 주어지면, 그 수의 각 자리수를 내림차순으로 정렬해보자.
 * 
 * 예제입력1
 * 2143
 * 예제 출력
 * 4321
 */

public class Backjoon_1427 {
  
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String input = br.readLine(); 
    System.out.println("input"+ input);
    int[] arr = new int[input.length()]; // input의 길이 만큼 배열크기 
    System.out.println("input"+ input.length());
    // 배열에 입력한 숫자 저장
    for (int i = 0; i < input.length(); i++) {
        arr[i] = input.charAt(i) - '0';
    }

    for(int i=0; i<arr.length - 1; i++) {
      int maxIndex = i;
      for(int j = i+1; j< arr.length; j++) {
        // 최대값 찾기
        if(arr[j] > arr[maxIndex]) {
          maxIndex = j;
        }
      }
      // 최대값과 스왑
      int temp = arr[i];
      arr[i] = arr[maxIndex];
      arr[maxIndex] = temp;
    }
    // 문자열 조작
    StringBuilder sb = new StringBuilder();
    for(int arrr: arr) {
      sb.append(arrr);
    }

    System.out.println(sb.toString());

  }    
}
