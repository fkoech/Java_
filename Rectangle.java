 class surface_area{
	int lenght;
	int width;
	int result;
	public void area(){
	   result = lenght*width;
	}
}
public class Rectangle{
	public static void main(String args[]){
		surface_area area1 = new surface_area();
		area1.lenght = 4;
		area1.width = 5;
	        System.out.println(area1.result);
	}
}

