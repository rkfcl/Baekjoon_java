package Baaekjoon_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class baekjoon_3052 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i=0;i<10;i++) {
			set.add(Integer.parseInt(br.readLine())%42);
		}
		br.close();
		System.out.println(set.size());
	}
}
