package algorithm.example.backjune;

import java.util.Scanner;

public class StringCompression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next() + " ";
        int cnt = 1;
        String answer = "";

        for(int i = 0; i < str.length()-1; i++){
            if(str.charAt(i) == str.charAt(i+1)){
                cnt++;
            } else {
                answer += str.charAt(i);
                if(cnt > 1){
                    answer += String.valueOf(cnt);
                    cnt = 1;
                }
            }
        }
        System.out.println(answer);
    }
}
