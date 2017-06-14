package Prolan;

public class donorpengganti <T> {
    private T type;
    private T gol; 
    
    public void juduldonorpengganti() {
       System.out.println("============================================================================");
       System.out.println("                       		 Data donorpengganti                                 ");
       System.out.println("============================================================================");
    }
    public T getnama(){
        return type;
    }
    public void setnama(T nama){
        this.type = nama;
    }
    
    public void setalamat(T alamat){
        this.type = alamat;
    }
     public T getalamat(){
        return type;
    }
     
     public T getumur(){
        return type;
    }
    public void setumur(T umur){
        this.type = umur;
    }
    
    public T getkelamin(){
        return type;
    }
    public void setkelamin(T kelamin){
        this.type = kelamin;
    }
    
    public T status(){
        gol = (T) "Golongan Darah O";
        return gol;
    }
}