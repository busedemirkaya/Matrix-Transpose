import java.util.Arrays;
public class Main { /* Matrisin transpozunu (devriğini) almak, matrisin aynı numaralı
satırları ile sütunlarının yer değiştirmesi demektir. Bu işlem sonucu elde edilen matris,
başlangıçtaki matrisin transpozudur (devriğidir). Bu aşamada kxn’lik bir matrisin transpozu
(devriği) nxk’lik bir matris olur. Örneğin bir A matrisimiz olsun. Bu A matrisinin transpozu
(devriği), A^T (A üzeri T) ile gösterilir.*/
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},

        };
        for(int i = 0 ; i < arr[0].length;i++){
            for(int j =0  ; j < arr.length;j++){
                System.out.print(arr[j][i] + " ");

            }
            System.out.println();
        }


    }
}