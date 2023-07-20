import java.util.*;
import java.lang.Thread;
class Pr0passwordgen{
	static void mbp(String s1) throws Exception{
		Scanner sc1=new Scanner(System.in);
		Thread tr=new Thread();
		int wrnatm=4;
		String newpsw;
		while(wrnatm>0){
			System.out.println("Enter the password: ");
			newpsw=sc1.next();
			if(s1.equals(newpsw)){
				System.out.println("Password matched");
				break;
			}else{
				wrnatm--;
				System.out.println("You have left "+wrnatm+" attempts");
				
				if(wrnatm==0){
					System.out.println("You have reached maximum attempts");
					for(int j=30;j>0;j--){
						System.out.println(j+" seconds");
						tr.sleep(1000);
					}
					mbp(s1);
				}
			}
		}
	}
	public static void main(String ar[]) throws Exception{
		Scanner sc=new Scanner(System.in);
		String oldpsw;
		System.out.println("Enter new password: ");
		oldpsw=sc.next();
		System.out.println("Password set successfully..");
		mbp(oldpsw);
        }

}