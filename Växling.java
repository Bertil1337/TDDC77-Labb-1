import java.util.Scanner;
public class Växling{
  public static void main(String[] args){
    boolean prog = true; // Då används detta för att man ska kunna testa flera gåner
    do { // returnerar ett booliskt value så om det funkar så kör den programmet annars så blir det ett kopmilerings fel
      //dekalarer sedan våra variabler som ska användas i programmet.
      Scanner input = new Scanner(System.in);
      float pris = 0;
      float betalar = 0;
      float maxBetal = 0;
      try //anävnds pgr "do"
      {     //Inmatning
        System.out.print("Ange ditt pris: ");
        pris = input.nextFloat();
        System.out.print("Du vad du ska betala: ");
        betalar = input.nextFloat();
        System.out.print("Vilken är den största sedeln du vill ha? ");
        maxBetal = input.nextFloat();
      }
      catch (Exception e){ //Så att man inte matar in typ en bokstac
        System.out.println("Ange endast siffror");
      }
    //Här så finner vi våra arrayer en för sedlarna och en för kostnaden där det finns 8 i varje array
      float skillnad = betalar - pris; //Totala växeln
      double[] pengar = {500, 100, 50, 20, 10, 5, 1, 0.5}; //Används för att jämföra priser
      String[] sedlar = {"femhundralappar", "hundralappar", "femtiolappar", "tjuglappar", "tiorkronor", "femkronor", "enkronor", "femtioöringar"};
      int[] dinVäxel = new int[8]; //8 för att det är 8 i varje array
      boolean forsatkolla = true; //Används i while-loopen
      int maxi = 0; //500 hundringens plats
      boolean maxiandrad = false;
      for (int i = 0; i<8; i++){
      if (maxBetal == pengar[i]){ //ser vilken sedel som var den stärsta

      maxiandrad = true;

      maxi = i;



        }
           }
           if (!maxiandrad){ //Kollar så att valören existerar så att man inte skriver in vad som helst
          System.out.println("Den valören Existerar inte");
          continue;
           }
           if (betalar >= pris && pris > 0 && betalar > 0){ //checkar dina siffror

             System.out.println("Du får tillbaka:   ");
             for (int i = maxi; i < 8; i++){ //Här startat den på 500 hundra lappen

               while(forsatkolla){

                 if (skillnad >= pengar[i]){

                   skillnad -= pengar[i];
                    dinVäxel[i] += 1;
                 }
                  if (skillnad < pengar[i]){
                    forsatkolla = false;
                  }
               }
               System.out.println("  " + dinVäxel[i] + " " + sedlar[i]); //Här skriver den ut resultatet
               forsatkolla = true;
             }
             prog = false; //Programmet skall  typ  avslutas,  om allt gick rätt
           }
           else{ //

             if (betalar < pris){
               System.out.println("Du är pank");
                   continue;

             }
             if (pris < 0  || betalar < 0 ){
               System.out.println("Du har skrivit in ett negativt tal");
               continue;
             }
           }
         }while     (prog); //Testa i programmet utfiall det finns några fel
       }
     }
