package BigO;
//Sorting Algorithm'in %90'i Quadratic ile calisiyor
public class On2 { //O(n^2)-->Quadratic Complex(eleman sayisinin karesi ile artan, cift dongu,
                                                // multidimensional array ile işlem yapıyorsam)
    public static void main(String[] args) {
        int count=0; //1 islem
        int[] arr={2,1,5}; //1 islem
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.println(arr[i]+arr[j]);
                count++;
            }

        }
        System.out.println("count : "+count); // 9 islem yapti
    }
}
