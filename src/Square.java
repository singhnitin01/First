import java.io.IOException;
import java.util.Scanner;

public class Square {
	static int squares(int a, int b) {
		int count=0;
		long start= Math.round(Math.sqrt((double)a));
		if(start*start<a)
			start =start +  1;
		long i=start;
		while(i *i <=b) {
			i++;
			count+=1;
		}
		return count;
    }
	
	public static void main(String[] args) throws IOException {
		
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String[] ab = scanner.nextLine().split(" ");

            int a = Integer.parseInt(ab[0]);

            int b = Integer.parseInt(ab[1]);

            int result = squares(a, b);
            
            System.out.println(result);

        }


        scanner.close();
    }
}
