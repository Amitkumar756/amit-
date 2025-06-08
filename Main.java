
public class Main {
    public static void Maze(int matrix[][], int row, int temp[][]){
        
        if(row==matrix.length){
            print(temp);
            return;
            
        }
        
        for(int j=0;j<matrix.length;j++){
            if(matrix[row][j]==1){
                temp [row][j]= 1;
                
            }else{
                temp [row][j]= 0;
                 
            }
            
        }
        Maze(matrix , row+1, temp);
    }
    public static void print(int temp[][]){
        for(int i=0;i<temp.length;i++){
        for(int j=0;j<temp[i].length;j++){
            System.out.print(temp[i][j]+ " ");
            
        }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        
        int matrix[][]={ { 1, 0, 0, 0 },{ 1, 1, 0, 1 },{ 0, 1, 0, 0 },{ 1, 1, 1, 1 } };
        int n = matrix.length;
        int temp [][]= new int[n][n];
        Maze(matrix,0,temp);
        
    }
    
}