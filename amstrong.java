public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, onum=0, rem=0, res= 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Ënter the number");
		num=sc.nextInt();
        onum = num;
		while(onum!=0)
		{
			rem=onum%10;
			res=res+rem*rem*rem;
			onum=onum/10;
			
		}
        if(res == num)
        {
            System.out.println(num + " is an Armstrong number.");
        }
        else 
        {
            System.out.println(num+ " is not an Armstrong number.");
           
        }
        
	}
}