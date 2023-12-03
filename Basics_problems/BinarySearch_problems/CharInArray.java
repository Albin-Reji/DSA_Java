package BinarySearch_problems;

public class CharInArray {

	public static void main(String[] args) {
		
		char letters[] = {'c','f','j'};
		System.out.println(nextGreatestLetter(letters, 'a'));
	}
	public static char nextGreatestLetter(char[] letters, char target) {
        int low=0;
        int high=letters.length-1;
        if(target>letters[letters.length-1]) {
        	return letters[0];
        }
        else {
        	while(low<=high){
                int mid=(int)(low+high)/2;
                if (target<letters[mid]){
                    high=mid-1;
                }
                else if(target>letters[mid]){
                    low=mid+1;
                }
                else{
                    return letters[mid+1];
                }
            }
        }
        return letters[low];
    }

}
