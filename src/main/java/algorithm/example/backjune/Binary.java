package algorithm.example.backjune;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Binary {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine()); //테스트 케이스 입력을 위한 T 선언

        for(int i = 0; i < T; i++){ // T의 갯수가 2 이상이면 그만큼 for문을 돌면서 n의 이진수에 대한 처리를 해야함.

            int n = Integer.parseInt(br.readLine()); //양의 정수 n을 입력받음.
            int index = 0; //n의 이진수의 자리값을 저장, 출력하기 위해 for문 안에 위치한 이유는 위와 동일하게 2개 이상의 테스트 케이스의 n의 이진수 자리를 구하기 위해

            while(n>0){ // 입력 받은 n 그 자체를 활용해서 계속 나눌 예정이기 때문에 n이 0 이상일 때만 안의 if 문을 타기 위해서

                if(n%2 == 1){ // 이진수, 이진수 자리를 저장, 출력하기 위한 if 문, 만약 n이 13이면 13/2 = 6 ··· 1 | 6/2 = 3 | 3/2 = 1 ··· 1 | 1/2 ···1 => 1011 (1011을 뒤집어서 생각해야함. n을 처음 나누는게 가장 하단에서가 아니라 가장 높은 수에서 부터 나눠서 내려오기 때문에)
                    System.out.print(index + " "); // ln 하면 줄이 바뀌지기 떄문에 공백하나만 추가해서 같은 줄에 출력
                }
                n = n / 2; // if문에서의 n에 대한 연산은 n을 저장하지 않기 때문에 여기서 n에 대한 연산을 진행, 몫만 구하면 나머지의 대한 연산은 자릿수 저장, 출력으로 끝남.
                index++; // 자릿수 증가.
            }
            System.out.println(); // 줄 바꿈. 다음 케이스를 위해서
        }
    }
}