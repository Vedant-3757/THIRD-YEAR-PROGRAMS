// public class arr {
//     public static void main(String[]args){
//         int a[] = {1,2,3,4,5,6};
//         for(int i = a.length-1 ; i >= 0 ; i--){
//             System.out.print(a[i]+" ");

//         }
//     }
    
// }
public class arr{
    public static void main(String[]args){
        String[][] a={
            {"ONE","TWO"},
            {"THREE","FOUR"},
            {"FIVE","SIX"}
        };
        for(int i = 0 ; i < a.length ; i++){
            for(int j = 0 ; j < 2 ; j++){
                System.out.print(a[i][j] + " ");

            }
            System.out.println();
        }
    }
}
