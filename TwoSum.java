package Test1;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
		int sum = 0;
		int a =0,b=0;
		int flag =0;
		for (int i = 0 ;i < nums.length;i++)
		{
			for (int j = 1;j < nums.length ; j++)
			{
				if(i != j)
				{
					sum = nums[i] + nums[j];
					if(sum == target && flag < 1)
					{	
						a=i;
						b=j;
						flag++;
					}	   
				}
			}	
		}
		int[] arr = {a,b};
		System.out.println("["+arr[0]+","+arr[1]+"]");
		return arr;		
}
	public static void main(String[] args){
		int[] a = {0,2,4,4,7,9};
		int target = 8;
		TwoSum ts = new TwoSum();
		ts.twoSum(a, target);
	}
}