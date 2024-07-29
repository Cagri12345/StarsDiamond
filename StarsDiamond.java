package Basic;
public class StarsDiamond {  //Yıldızlarla elmas şekli yapma
    public static void main(String[] args) {

        //Elmasın üst kısmı
        for(int i = 1 ; i <= 4 ; i++) {   //Satır sayısı
            for(int k = 1 ; k <= (4-i) ; k++) {  //Boşluk sayısı
                System.out.print(" ");
            }
            for(int j = 1 ; j <= (2*i)-1 ; j++) {   //Yıldız Sayısı
                System.out.print("*");
            }
            System.out.println();
        }

        //Elmasın alt kısmı
        for(int i = 1 ; i <= 3 ; i++) {   //Satır sayısı
            for(int k = 1 ; k <= i ; k++) {   //Boşluk Sayısı
                System.out.print(" ");
            }
            for(int j = 1 ; j <= (2*(4-i))-1 ; j++) {   //Yıldız sayısı
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
