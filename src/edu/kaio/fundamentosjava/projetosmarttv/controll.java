package projetosmarttv;

public class controll{
    public static void main(String[] args) {
        
        SmartTv smartTv = new SmartTv();

        if(smartTv.power == false){
            System.out.println("A televisão está desligada.");
        }else{
            System.out.println("A televisão está ligada.");
        }

        System.out.printf("O canal é o número %d%n",smartTv.charnnel);
       
        System.out.printf("O som da televisão está no %d%n",smartTv.sound);

        smartTv.ligar();
        System.out.println(smartTv.power);

        while (smartTv.sound < 50) {
            smartTv.aumentarVolume();
            System.out.println("+1");
        }
        System.out.printf("Volume atual é : %d%n",smartTv.sound);

        smartTv.mudarCanalParaMais();      
        smartTv.mudarCanalParaMais();
        smartTv.mudarCanalParaMenos();

        smartTv.mudarCanalParaMais();
        System.out.printf("Seu canal é o : %d%n",smartTv.charnnel);
        smartTv.mudarCanalParaMenos();
        System.out.printf("Seu canal é o : %d%n",smartTv.charnnel);
        smartTv.newCharnnel(17);
        System.out.printf("Seu canal é o : %d%n",smartTv.charnnel);
    }
}