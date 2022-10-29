public class Person {
    private String Nama,JK;
    private int Umur;


    public void setnama(String Nama){
        this.Nama = Nama;
    }

        public void setjk(String jk){
        this.JK = jk;
    }

        public void setumur(int umur){
        this.Umur = umur;
    }

    public String getnama(){
        return this.Nama;
    }

    public String getjk(){
        return this.JK;
    }

        public int getumur(){
        return this.Umur;
    }
}