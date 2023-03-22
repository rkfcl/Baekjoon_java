import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] array = new int[N];
		int total=0;
		for (int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(st.nextToken());

		}
		int V = Integer.parseInt(br.readLine());
		for (int i = 0; i < array.length; i++) {
			if(array[i]==V)
			{
				total++;
			}
		}
		System.out.println(total);

	}

}
