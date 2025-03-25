package leetcodearrays;

public class SumOfTwoNumbersIntial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer numberGroup[] = {1,2,3,4,5,6,7,8,9};
		Integer total = 17;
		
		for(int i=0; i<numberGroup.length;i++) {
			int toFind = total-numberGroup[i];
			for(int j=i+1; j<numberGroup.length;j++) {
			if(toFind==numberGroup[j]) {
				System.out.println(numberGroup[i] + "__" + numberGroup[j]);

			}
			}
			//System.out.println("----------------------");
			
		}

	}

}
