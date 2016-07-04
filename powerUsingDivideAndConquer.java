class powerUsingDivideAndConquer{

    public int power(int a, int b){
        if(b==0) return 1;
        if(b==1) return a;
        int z = power(a, b/2);
        if(b%2==0) return z*z;
        else return z*z*a;
    }
    
    public static void main(String args[]){
        powerUsingDivideAndConquer p = new powerUsingDivideAndConquer();
        System.out.println(p.power(2, 9));
    }
}