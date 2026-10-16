public class Array{
    public static void main(String[] args){
        //int arr[] = {1, 2, 3};
        //System.out.println(arr[0]);

        int arr[][] = new int[3][4];

        //System.out.println(data);

        for(int i=0; i<3; i++){
            for(int j=0; j<4; j++){
                arr[i][j] = (int)(Math.random()*10);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}