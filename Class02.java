class Data {
   private String name;
   private Test score;

   class Test {
      private int english;
      private int math;
      public Test(int eng, int m) {
         english = eng;
         math = m;
      }
      public double avg() {
         return (english + math) / 2.0;
      }
   }
   public Data(String n, int eng, int m) {
      name = n;
      score = new Test(eng, m);
   }
   public void show() {
      System.out.print("name:" + name);
      System.out.print(" english=" + score.english);
      System.out.print(" math=" + score.math);
      System.out.println(" avg=" + score.avg());
   }
}
public class Main {
   public static void main(String args[]) {
      Data student1 = new Data("Annie", 85, 92);
      student1.show();
      Data student2 = new Data("Brian", 77, 56);
      student2.show();
   }
}
