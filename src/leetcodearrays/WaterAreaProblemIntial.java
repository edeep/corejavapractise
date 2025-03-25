package leetcodearrays;

public class WaterAreaProblemIntial {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Integer numberGroup[] = {8,2,3,4,5,6,7,8,9};
		Integer numberGroup[] = {8,2,3,4,100,100,7,8,9};
		//Integer total = 17;
		int maxArea = 0;
		String result = "NA -- NA";
		for(int i=0; i<numberGroup.length;i++) {
			int side1 = numberGroup[i];
			for(int j=i+1; j<numberGroup.length;j++) {
				int side2 = numberGroup[j];
				int height = Math.min(side1, side2);
				int breath = j-i;
				if(height*breath > maxArea) {
					maxArea = height*breath;
					//System.out.println("Area is" + maxArea 
							//+ "for " + numberGroup[i] +"--" + numberGroup[j]);
					result = numberGroup[i] +"at index" + i 
							+"--" + numberGroup[j] +"at index" + j ;
				}
				
			}
			
			
		}
		System.out.println("----------------------"+ result);
	}
}
