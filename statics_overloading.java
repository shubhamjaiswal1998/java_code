class Innerstatics_overloading {
  static double f1(double n){

    return Math.sqrt(n);
  }
  static double f1(double a,double b){

    return Math.pow(a, b);
  }
  static int f1(int a,int b){

    return Math.max(a,b);
  }}
  class statics_overloading {
    public static void main(String[] args) {
        System.out.println(Innerstatics_overloading.f1(16));
        System.out.println(Innerstatics_overloading.f1(2.0,3.0));
        System.out.println(Innerstatics_overloading.f1(2,3));
    }
}
