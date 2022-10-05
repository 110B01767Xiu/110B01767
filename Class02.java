class Data {
	private String name;
	private Test score;
	public Data(String str) {
		name = str;
		score = new Test();
	}
	private class Test{
		int english;
		int math;
	}
	public void setScore(int eng, int m) {
		score.english = eng;
		score.math = m;
	}
	public String getScore() {
		return "name:" + name + " english=" + score.english + " math=" + score.math + " avg=" + String.format("%.1f",(score.english + score.math) / 2);
	}
}
class Test {
	public static void main(String[] args) {
		Data Annie = new Data("Annie");
		Data Brian = new Data("Brian");
		Annie.setScore(85, 92);
		System.out.println(Annie.getScore());
		Brian.setScore(77, 56);
		System.out.println(Brian.getScore());
	}
}
