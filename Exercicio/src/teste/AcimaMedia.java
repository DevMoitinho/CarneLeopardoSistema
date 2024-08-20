package teste;
import java.util.Scanner;

public class AcimaMedia {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] nums = (sc.nextLine()).split(" ");
		,
		
		int soma = 0;
		for(int i = 0;i < nums.length;i++) {
			soma += Integer.parseInt(nums[i]);
			
		}
		
		System.out.println(soma/nums.length);

	}

}

