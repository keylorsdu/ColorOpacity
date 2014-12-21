
public class Opacity {
	public static void main(String[] args) {
		
		for(int i = 100 ;i > -1; i --){
			// i as percent
			float dot = (float)255 / 100;
			int  alpha = Math.round(dot * i);
			String hex = Integer.toHexString(alpha);
			System.out.println(i + "% --" + hex);
			
			
		}
	}

}
