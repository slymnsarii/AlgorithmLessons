package BigO;
//Time Complexity
public class O1 { // O(n) ==> O(1) (Constant Complexity) eleman sayisi ne kadar artarsa artsin sure sabittir
    public static void main(String[] args) {
        //Task : verilen array'in son elemanini ekrana yazdirin
        int [] arr={1,10,23,43,77,1234};
        System.out.println(arr[arr.length - 1]); //tek islem(u-yani verilen array'in son elemanini tek islemde yazdirdik

        //farkli ornek : verilen sayinin cift olup olmadigini kontrol edin
        int x=24;
        if (x%2==0) System.out.println("cift");

        /*
        int y=3; //1 islem
        int z=5; //1 islem
        for (){ //1000 iterasyon varsa 1000 islem -->1002 ama 1 islem gibi kucuk islemleri goz ardi eder
                asil istenilene bakariz-->1000

            */




    }

    
}
