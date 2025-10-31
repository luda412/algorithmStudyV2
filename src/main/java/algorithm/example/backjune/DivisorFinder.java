package algorithm.example.backjune;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class DivisorFinder {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 주어질 자연수, 해당 자연수의 약수를 계산
        int K = Integer.parseInt(st.nextToken()); // 주어질 자연수, N의 약수들 중에서 K번째의 약수를 출력(약수의 갯수가 아닌 K 번째 약수를 출력) 만약 N의 약수의 갯수가 K보다 작을 경우 0을 출력. result를 0으로 초기화 해놓고, if 문에서 K번째 약수가 없을 시 return 하면 되니까 굳이 필요 없을 듯

        int count = 0; // 약수의 순서를 저장할 변수 (if 문의 % 계산에서 N%i 에 걸리면 count를 증가할 예정)
        int result = 0; // K 번째 약수를 저장할 변수

        for(int i = 1; i <= N; i++){
            if(N%i==0){
                count++;
            }
            if(count==K){
                result = i;
                break;
            }
        }
        System.out.println(result);

    }
}
