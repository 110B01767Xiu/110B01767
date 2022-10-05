class Cal_area {
	int radius;
	int length;
	int width;
	int height;
	void setA3(int r) {
		radius = r;
	}
	void setA2(int l, int w, int h) {
		length = l;
		width = w;
		height = h;
    }
	void setR(int r) {
		radius = r;
	}
	void setL(int l) {
		length = l; 
	}
	void setW(int w) {
		width = w; 
	}
	void setH(int h) {
		height = h; 
	}
	public void show() {
		System.out.println("半徑 = " + radius);
		System.out.println("球形體積 = " + String.format("%.1f", (4 * 3.14159 * Math.pow(radius, 3)) / 3));
		System.out.println(" ");
		System.out.println("長 = " + length + " ,寬 = " + width + " ,高 = " + height);
		System.out.println("立方體表面積 = " + 2 * (length * width + length * height + width * height));
	}
}
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cal_area Ca = new Cal_area();
		Ca.setR(10);
		Ca.setL(4);
		Ca.setW(5);
		Ca.setH(6);
		Ca.show();
	}
}
