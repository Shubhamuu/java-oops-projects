public class nestedTry {
    public static void main(String[] args) {
        try{
            int a= args.length;
            int b = 15/a;
            System.out.println("a: "+a);
            try{
                if (a == 1){
                    a = a/(a-a);

            
                }
                if (a == 2)
                {
                 int c[]= {1,2};
                 c[15]= 99;
                }
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("array index out of bound "+ e);
            }
        }catch(ArithmeticException f){
            System.out.println("divide by 0"+ f);
        }
    }
    
}
