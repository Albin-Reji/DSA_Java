package stack;

import java.util.Arrays;
import java.util.Stack;

public class MaximalRectangle {

	public static void main(String[] args) {
		char[][] charMatrix = {
			    {'1', '0', '1', '0', '0'},
			    {'1', '0', '1', '1', '1'},
			    {'1', '1', '1', '1', '1'},
			    {'1', '0', '0', '1', '0'}
			};
		System.out.println(maximalRectangle(charMatrix));
	}
	public static int maximalRectangle(char[][] matrix) {
		char ansMatrix[]=new char[matrix[0].length];
        for(int i=0;i<matrix.length;i++) {
        	ansMatrix=sumArr(matrix[i]);
        }
        int maxLen=Integer.MIN_VALUE;
        int prev[]=prevSmall(ansMatrix);
        int next[]=nxtSmall(ansMatrix);
        for(int i=0;i<matrix.length;i++) {
        	maxLen=Math.max(maxLen,(next[i]-prev[i])*ansMatrix[i] );
        }
        return maxLen;
    }
	static char[] sumArr(char matrix[]) {
		
		for(int i=0;i<matrix.length;i++) {
			if(matrix[i]=='1') {
				matrix[i]=(char) ((char)matrix[i]+'1'-'0');
				
			}
			else {
				matrix[i]=(char) ('0');
			}
		}
		return matrix;
	}

	static int[] prevSmall(char arr[]) {
		int ansList[]=new int[arr.length];
		Stack<Integer> st=new Stack<Integer>();
		for(int i=0;i<arr.length;i++) {
			while(!st.isEmpty()&&arr[st.peek()]>=arr[i]-'0') {
				st.pop();
			}
			if(st.isEmpty()) {
				ansList[i]=0;
			}
			else {
				ansList[i]=st.peek()+1;
			}
			st.push(i);
		}
		return ansList;
	}
	
	static int[] nxtSmall(char arr[]) {
		int ansList[]=new int[arr.length];
		Stack<Integer> st=new Stack<Integer>();
		for(int i=arr.length-1;i>=0;i--) {
			while(!st.isEmpty()&&arr[st.peek()]>=arr[i]-'0') {
				st.pop();
			}
			if(st.isEmpty()) {
				ansList[i]=arr.length-1;
			}
			else {
				ansList[i]=st.peek()-1;
			}
			st.push(i);
		}
		return ansList;
	}

}
