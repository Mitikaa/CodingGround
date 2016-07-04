class fibo{

    int[] arr = new int[50];;
    
    public int fibonacci(int n){
        if(arr[n]<1){
               if(n==1||n==2){
                arr[n]=1;
                System.out.println(arr[n]);
                return 1;
            }
            else {
                arr[n] = fibonacci(n-1)+fibonacci(n-2);
                System.out.println(arr[n]);
                return arr[n];
            } 
        }
        else {
            return arr[n];
        }
    }
    
    public static void main(String args[]){
        fibo f = new fibo();
        f.fibonacci(5);
    }
}