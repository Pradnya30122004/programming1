package www.qsp.array;

public class Mergeandmedian {
	    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
	        int [] nums = new int[nums1.length + nums2.length];
	        double median=0;
	        int p1=0;
	        int p2=0;
	        int p3=0;
	        while(p1<nums1.length && p2<nums2.length){
	            if(nums1[p1]<nums2[p2]){
	                nums[p3]=nums1[p1];
	                p1++;
	                p3++;
	            }else{
	            nums[p3]=nums2[p2];
	            p2++;
	            p3++;
	            }
	        }
	        while(p1<nums1.length){
	            nums[p3]=nums1[p1];
	            p1++;
	            p3++;
	        }
	        while(p2<nums2.length){
	            nums[p3]=nums2[p2];
	            p3++;
	            p2++;
	        }
	        if(nums.length % 2==1){
	            median = nums[nums.length/2];
	        }else{
	            median = (nums[nums.length/2]+nums[(nums.length/2)-1])/2.0;
	        }

	        return median;

	    }
	    
	    public static void main(String[] args) {
			int[] arr1 = {1,2};
			int[] arr2 = {3,4};
			System.out.println(findMedianSortedArrays(arr1,arr2));	
			}
	}

