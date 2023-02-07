import java.util.Scanner;
class LCM{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] a=new int[5];
		int i,j,f,m=1;
		System.out.print("Enter Five Numbers:");
		for(i=0;i<5;i++){
			a[i]=sc.nextInt();
			m*=a[i];
		}
		for(i=a[0];i<=m;i++){
			f=0;
			for(j=0;j<5;j++){
				if(i%a[j]==0)
					f=1;
				else{
					f=0;
					break;
				}
			}
			if(f==1){
				System.out.print("LCM="+i);
				break;
			}
		}
	}
}