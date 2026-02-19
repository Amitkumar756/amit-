
public class recur {
    public static void pattern(int array[][], int i, int j){
        int n = array.length; int m = array[0].length;
        
        if(i>=n||j>=m){
            return ;
        }
        
         pattern(array,i,j+1);
        System.out.println();
        pattern(array,i+1,0);
        
    }
    
    public static void main(String args[]) {
        int array[][]={{0,0,1,1,0},{1,0,1,1,1},{1,1,1,1,0},{1,0,1,1,0}};
        
        System.out.print(pattern(array,0,0));
    }
}