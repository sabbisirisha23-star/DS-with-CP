class Test{
    public String Add(int a, int b){
    if(a%2==0){
        return"even";}
        return"odd";
         }
}
class Main {
    public static void main(String[] args) {
          Test obj = new Test();
        System.out.println("objTry programiz.pro");
         String a = obj.Add(10,21);
            System.out.println(a);
    }
}
