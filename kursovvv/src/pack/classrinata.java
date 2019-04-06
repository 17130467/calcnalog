package pack;


public class classrinata {
	double area;
	int height;
	int length;
	public static void main(String[] args) {
		int x = 0;
		classrinata[] ta=new classrinata[4];
		while (x<4) {
			ta[x]=new classrinata();
			ta[x].height=(x+1)*2;
			ta[x].length = x+4;
			ta[x].setArea();
			System.out.print("треугольник "+x+", зона");
			System.out.println(" = " + ta[x].area);
			x=x+1;
		}
		int y = x;
		x=27;
		classrinata t5=ta[2];
		ta[2].area = 343;
		System.out.print("y= " + y);
		System.out.println(", зона t5 =" + t5.area);
	}
void setArea() {
	area = (height*length)/2;
}
}
