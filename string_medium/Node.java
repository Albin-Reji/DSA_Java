package string_medium;
	
class Node{
	
	Node links[]=new Node[26];
	boolean flag=false;
	public Node() {
		// TODO Auto-generated constructor stub
	
	}
	boolean containsKey(char ch) {
		return (links[ch-'a']!=null);
	}
	Node get(char ch) {
		return links[ch-'a'];
		
	}
	void put(char ch, Node node) {
		links[ch-'a']=node;
	}
	public class Solution {
		public static int cntDistictSubstring(String s) {
			Node root=new Node();
			int n=s.length();
			int cnt=0;
			for(int i=0;i<n;i++) {
				Node node=root;
				for(int j=0;j<n;j++) {
					if(!node.containsKey(s.charAt(j))) {
						node.put(s.charAt(j), new Node());
						cnt++;
					
					}
				}
			}
			return cnt+1;
		}
	}
}
