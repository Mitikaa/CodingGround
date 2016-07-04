class DivideConquer{
    public int findMaxInArray(int[] arr){
        if (arr.length==0) return -1;
        int left=0;
        int right= arr.length-1;
        int maxValue = findMax(arr, left, right);
        return maxValue;
    }
    
    public int findMax(int[] arr, int left, int right){
        if(left==right) return arr[left];
        int mid = (left+right)/2;
        return Math.max(findMax(arr, left, mid), findMax(arr, mid+1, right));
    }
    
    public static void main(String args[]){
        int arr[] = {1,2,3,2};
        DivideConquer dc = new DivideConquer();
        System.out.println(dc.findMaxInArray(arr));
    }
}