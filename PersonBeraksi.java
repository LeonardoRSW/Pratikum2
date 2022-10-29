public class PersonBeraksi{
    public static void main(String[] args){
    Person anton = new Person();

    anton.setnama("Anton");
    anton.setumur(19);
    anton.setjk("Laki-Laki");

    System.out.println("Nama :" + anton.getnama());
    System.out.println("Umur :" + anton.getumur());
    System.out.println("Jenis Kelamin :" + anton.getjk());

    System.out.println("----------------------------------------------");

    Person riko = new Person();

    riko.setnama("Riko");
    riko.setumur(20);
    riko.setjk("Laki-Laki");

    System.out.println("Nama :" + riko.getnama());
    System.out.println("Umur :" + riko.getumur());
    System.out.println("Jenis Kelamin :" + riko.getjk());
}
}