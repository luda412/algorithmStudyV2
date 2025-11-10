package algorithm.example.backjune;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class MinMax {
    public static void main(String[] args) throws IOException {

        //정수의 갯수 N 초기화 및 할당(입력값), 값을 담을 배열 Array 초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        //st를 사용해서 공백을 기준으로 입력받기
        StringTokenizer st = new StringTokenizer(br.readLine());
        int Array[] = new int [N];

        //Array 할당(입력) i<N 까지 인 이유는 배열이 0부터 N-1까지라서 i<=N 이면 존재 하지 않는 배열의 인덱스에 접근 하려하기 때문이다.
        for(int i = 0; i < N; i++){
            Array[i] = Integer.parseInt(st.nextToken());
        }
        //java.util 제공 오름차순 정리 함수
        Arrays.sort(Array);
        //오름차순으로 어차피 정리되어있기 때문에 배열의 첫 인덱스가 최소, N-1 인덱스가 최대
        System.out.println(Array[0] +" "+Array[N-1]);

    }
}
