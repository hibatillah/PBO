package Praktikum_PBO_3;

public class TestBola {
    public static void main(String[] args) {
        Bola b1 = new Bola();
        Bola b2 = new Bola();

        System.out.println("KEADAAN AWAL");
        b1.infoBola();
        System.out.println();
        b2.setJari(10);
        b2.setJenis("Basket");
        b2.infoBola();
        System.out.println();

        System.out.println("KEADAAN SETELAH PERUBAHAN");
        b1.setJari(20);
        b1.infoBola();
        System.out.println();
        b2.setJari(2);
        b2.setJenis("kelereng");
        b2.infoBola();
	
    }
    
}
