

public class MyTemp {
	public static void main(String[] args) {
		String a = "abcdracecarffeye";
		char[] arr = a.toCharArray();
		int length = arr.length;
		int longest = 0;
		for(int i=0;i<length;i++) {
			for(int j=i+1; j < length;j++){
				if(arr[i] == arr[j]){
					int itemp = i;
					int jtemp = j;
					while(itemp<=jtemp){
						if(itemp == jtemp){
							if(j-i+1> longest) {
								longest = j-i+1;
							}
							break;
						} else
						if(arr[itemp++] != arr[jtemp--])
							break;
					}
					break;
				}
					
			}
		}
		
		System.out.println("longest " + longest);
	}

}

//This is in O(n^3) time 
