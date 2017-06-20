package stringSplit;

public class FindNumberFromaDomain {

	public static void main(String[] args) {
		String str = new String("www.fo.com/usa/123/4567");
		System.out.println("Desired value:");
		
		String[] temp;
		String slash = "/";
		
		temp = str.split(slash);
		
		for(int i = 0; i < temp.length; i++){
			if(i == 2){
			System.out.println(temp[i]);
			}
		}
		
	}

}
