package projetosmarttv;

public class SmartTv {
    boolean power = false;
    int charnnel = 1;
    int sound =25;

    public void ligar(){
        power = true;
    }

    public void desligar(){
        power = false;
    }

    public void aumentarVolume(){
        sound++;
    }

    public void diminuirVolume(){
        sound--;
    }

    public void mudarCanalParaMais(){
        charnnel++;
    } 
    
    public void mudarCanalParaMenos(){
        charnnel--;
    }

    public void newCharnnel(int newCharnnel){
        charnnel = newCharnnel;
    }

}
