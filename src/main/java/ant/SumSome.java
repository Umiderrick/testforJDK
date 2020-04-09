package ant;

public class SumSome {

	public static void sum(int[] nums,int target){
		
		int sum =nums[0];
		int left =0;
		int right =0;
		int[] idx =new int[2];
		while(left<nums.length||right<nums.length){
			if(sum==target){
				idx[0] =left;
				idx[1] =right;
				break;
			}
			else if(sum<target){
				right++;
				if(right==nums.length){
					return ;
				}
				sum+=nums[right];
			}else{
				sum-=nums[left++];
			}
		}
		
		while(left<=right){
			System.out.println(nums[left++]);
		}
	}
	
	public static void main(String args[]){
		int[] a ={-1,0,1,2,3,4,7,8,9};
		int target =5;
		sum(a,target);
	}
}
