package stack;

import java.util.Arrays;

public class WarterTrapped {

	public static void main(String[] args) {
		int height[]= {0,1,0,2,1,0,1,3,2,1,2,1};
		System.out.println(trapBetter(height));

	}
	public static  int trapOptimal(int[] height) {
		 int l=0;
		 int r=height.length-1;
		 int leftMax=0;
		 int rightMax=0;
		 int waterTrapped=0;
		 while(l<=r) {
			 if(height[l]<=height[r]) {
				 if(height[l]>=leftMax) {
					 leftMax=height[l];
				 }
				 else {
					 waterTrapped+=leftMax-height[l];
				 }
				 l++;
			 }
			 else {
				 if(height[r]>=rightMax) {
					 rightMax=height[r];
				 }
				 else{
					 waterTrapped+=rightMax-height[r];
				 }
			 }
		 }
		 return waterTrapped;
	}
	
	 public static  int trapped(int[] height) {
	      int waterTrapped=0;
	      
	      for(int i=0;i<height.length;i++) {
	    	  int j=i;
	    	  int leftMax=0;
		      int RightMax=0;
	    	  while(j>=0) {
	    		  leftMax=Math.max(leftMax, height[j]);
	    		  j--;
	    	  }
	    	  j=i;
	    	  while(j<height.length) {
	    		  RightMax=Math.max(RightMax, height[j]);
	    		  j++;
	    	  }
	    	  waterTrapped+=Math.min(leftMax, RightMax)-height[i];
	      }
	      return waterTrapped;
	      
	 }
	 public static  int trapBetter(int[] height) {
		  int prefixArr[]=new int[height.length];
		  int prefix=height[0];
		  prefixArr[0]=prefix;
	      for(int i=1;i<height.length;i++) {
	    	  prefixArr[i]=Math.max(prefixArr[i-1], height[i]);
	    	  
	      }
	      int suffixArr[]=new int[height.length];
	      suffixArr[height.length-1]=height[height.length-1];
	      for(int i=height.length-2;i>=0;i--) {
	    	  suffixArr[i]=Math.max(suffixArr[i+1], height[i]);
	      }
	      int WaterTraped=0;
	      for(int i=0;i<height.length;i++) {
	    	  WaterTraped+=Math.min(prefixArr[i], suffixArr[i])-height[i];
	      }
	      return WaterTraped;
	      
	 }

}
