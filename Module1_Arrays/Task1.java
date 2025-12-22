class Main {
    public static void main(String[] args) {
        
        
        // static D & I
        int[] num = {1,2,3};
        for(int i=0;i<num.length;i++){
            System.out.println(num[i]);
        }
        
        String[] names = {"Rohith","Vinay","prasanth"};
        for(int i=0;i<names.length;i++){
            System.out.println(names[i]);
        }
        
        // new
         int[] num1 = new int[] {4,5,6};
        for(int i=0;i<num1.length;i++){
            System.out.println(num1[i]);
        }
        
        String[] names1 = new String[] {"siri","navya","sridevi"};
        for(int i=0;i<names1.length;i++){
            System.out.println(names1[i]);
        }
        
        int[] da = new int[10];
        da[0]=100;
        da[da.length-1]=900;
        for(int i=0;i<da.length;i++){
            System.out.println(da[i]);
        }
        
 }
}
