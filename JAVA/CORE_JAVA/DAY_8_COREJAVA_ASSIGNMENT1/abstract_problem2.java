package DAY_8_COREJAVA_ASSIGNMENT1;
abstract class Instrument{
    abstract void play();
}
class Piano extends Instrument{
    void play(){
        System.out.println("Piano is playing tan tan tan tan");
    }
}
class Flute extends Instrument{
    void play(){
        System.out.println("Flute is playing toot toot toot toot");
    }
}
class Guitar extends Instrument{
    void play(){
        System.out.println("Guitar is playing tin tin tin tin");
    }
}
public class abstract_problem2 {
    public static void main(String[] args) {
        Instrument instrument[]=new Instrument[10];

        for(int i=0;i< instrument.length;i++)
        {
            if(i%3==0)
            {
                instrument[i]=new Piano();

            }
            else if (i%3==1)
            {
              instrument[i]=new Flute();
            }
            else if (i%3==2)
            {
                instrument[i]=new Guitar();

            }
        }
        for(int i=0;i< instrument.length;i++){
            if(instrument[i] instanceof Piano ){
                System.out.println(i + " is a instance of Piano");
                instrument[i].play();

            }

        }
                for(int j=0;j< instrument.length;j++){
                    if(instrument[j] instanceof Flute){
                        System.out.println(j + " is a instance of flute");
                        instrument[j].play();

            }
        }
        for(int k=0;k< instrument.length;k++){

            if(instrument[k] instanceof Guitar){
                System.out.println(k + " is a instance of Guitar");
                instrument[k].play();

              }
          }
    }
}
