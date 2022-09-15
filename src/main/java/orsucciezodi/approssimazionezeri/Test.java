
package orsucciezodi.approssimazionezeri;

import java.util.*;

/**
 * @author Orsucci & Zodi 4IC
 * classe contenente il main
 */
public class Test 
{
    /**
     * main
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        //variabili intere
        int sceltaMenu, estremoInferiore, estremoSuperiore;
        //variabili boolean
        boolean intervalloValido;
        //valore double per la precisione sui metodi
        double PRECISIONE;
        //costante int per il controllo sui sotto intervalli
        final int INCREMENTOCONTROLLOINTERVALLO = 1;
        
        Scanner input = new Scanner (System.in);
        //ripropongo il menu fino a che l'utente non decide di uscire dal programma
        do 
        {  
            stampaMenu();
            do 
            {                
                System.out.print("\n Inserisci la scelta (int): ");
                sceltaMenu = input.nextInt();
            } while (sceltaMenu < 0 || sceltaMenu > 2);
            
            switch (sceltaMenu)
            { 
                case 1:   
                        do
                        {   
                            System.out.println("\n");
                            System.out.print("Inserisci la precisione (double, si consiglia 0,001. Usare la virgola.): ");
                            PRECISIONE = input.nextDouble();
                        }while(PRECISIONE <= 0);
                        do 
                        {                        
                            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                            System.out.println("Verrà chiesto un intervallo finchè non ne verrà inserito uno valido.");
                            System.out.println("Un intervallo è valido quando i suoi estremi o gli estremi degli intervalli in esso contenuto sono discordi.");
                            System.out.println("Inoltre l'estremo inferiore deve essere inferiore a quello superiore.");
                            //chiedo gli estremi dell'intervallo fino a che quello inferiore non è inferiore a quello superiore
                            do 
                            {   
                                System.out.println("\n"); 
                                System.out.print("Inserisci l'estremo inferiore dell'intervallo in cui cercare lo 0 (int, radianti): ");
                                estremoInferiore = input.nextInt();
                                System.out.println("\n");
                                System.out.print("Inserisci l'estremo superiore dell'intervallo in cui cercare lo 0 (int, radianti): ");
                                estremoSuperiore = input.nextInt();
                                input.nextLine();
                            }while(estremoInferiore >= estremoSuperiore); 
                            System.out.println("\n");
                            /*invoco il metodo che controlla gli intervalli e che, a sua volta, tutte le volte che trova un 
                            intervallo valido, applica almeno (a scelta dell'utente) il metodo del punto unito per trovare gli zeri della funzione.
                            il metodo della bisezione viene applicato solo se l'utente lo vuole
                            */
                            intervalloValido = controlloIntervallo(estremoInferiore, estremoSuperiore, sceltaMenu, PRECISIONE, input, INCREMENTOCONTROLLOINTERVALLO);
                            if(intervalloValido == false)
                            {   
                                System.out.println("Intervallo non valido, non soddisfa le ipotesi del teorema degli zeri.");
                            }
                            try
                            {   
                                Thread.sleep(1000);
                            }catch(Exception e){System.out.println("C'è stato un errore sullo sleep");}
                        } while (intervalloValido == false); //richiedo fino a che l'intervallo non è valido
                        System.out.println("\n"); 
                break;
                case 2: 
                        do
                        {   
                            System.out.println("\n");
                            System.out.print("Inserisci la precisione (double, si consiglia 0,001. Usare la virgola): ");
                            PRECISIONE = input.nextDouble();
                        }while(PRECISIONE <= 0);
                        do 
                        {                        
                            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                            System.out.println("Verrà chiesto un intervallo finchè non ne verrà inserito uno valido.");
                            System.out.println("Un intervallo è valido quando i suoi estremi o gli estremi degli intervalli in esso contenuto sono discordi.");
                            System.out.println("Inoltre l'estremo inferiore deve essere inferiore a quello superiore.");
                            //chiedo gli estremi dell'intervallo fino a che quello inferiore non è inferiore a quello superiore
                            do 
                            {  
                                System.out.println("\n");
                                System.out.print("Inserisci l'estremo inferiore dell'intervallo in cui cercare lo 0 (int, radianti): ");
                                estremoInferiore = input.nextInt();
                                System.out.println("\n");
                                System.out.print("Inserisci l'estremo superiore dell'intervallo in cui cercare lo 0 (int, radianti): ");
                                estremoSuperiore = input.nextInt();
                                input.nextLine();
                            }while( estremoInferiore >= estremoSuperiore);
                            System.out.println("\n");
                            /*invoco il metodo che controlla gli intervalli e che, a sua volta, tutte le volte che trova un 
                            intervallo valido, applica almeno (a scelta dell'utente) il metodo del punto unito per trovare gli zeri della funzione.
                            il metodo della bisezione viene applicato solo se l'utente lo vuole
                            */
                            intervalloValido = controlloIntervallo(estremoInferiore, estremoSuperiore, sceltaMenu, PRECISIONE, input, INCREMENTOCONTROLLOINTERVALLO);
                            if(intervalloValido == false)
                            {   
                                System.out.println("Intervallo non valido, non soddisfa le ipotesi del teorema degli zeri.");
                            }
                            try
                            {   
                                Thread.sleep(1000);
                            }catch(Exception e){System.out.println("C'è stato un errore sullo sleep.");}
                        } while (intervalloValido == false); //richiedo fino a che l'intervallo non è valido
                        break;
            }
        } while (sceltaMenu != 0);
    }
    /**
     * stampa il menu
     */  
    public static void stampaMenu()
    {   
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println(" __  __                             ");                       
        System.out.println("|  \\/  |                           ");
        System.out.println("| \\  / |   ___   _ __    _   _     ");
        System.out.println("| |\\/| |  / _ \\ | '_ \\  | | | |  ");
        System.out.println("| |  | | |  __/ | | | | | |_| |     ");
        System.out.println("|_|  |_|  \\___| |_| |_|  \\__,_|   ");  
        System.out.println("*******************************  ");
        System.out.println("*                             *  ");
        System.out.println("* 1) sin(x)-x-1               *  ");
        System.out.println("*                             *  ");
        System.out.println("* 2) 1/4x^2 -2x+1             *  ");
        System.out.println("*                             *  ");
        System.out.println("* 0) esci                     *  ");
        System.out.println("*******************************  ");
    }
    /**
    * controlla che l'intevallo inserito abbia degli intervalli compresi validi. Se sì vengono applicati i metodi di calcolo degli zeri
    * @param estremoInferiore valore minore dell'intervallo dato
    * @param estremoSuperiore valore maggiore dell'intervallo dato
    * @param sceltaMenu numero della funzione scelta
    * @param PRECISIONE precisione immessa considerata per i metodi di calcolo degli zeri
    * @param input oggetto per input da tastiera
    * @param INCREMENTOCONTROLLO costante con valore di incremento per il controllo degli intervalli interni a quello fornito
    * @return intervalloValido, boolean (true se l'intevallo è valido e falso se non lo è)
    */
    public static boolean controlloIntervallo(int estremoInferiore, int estremoSuperiore, int sceltaMenu, double PRECISIONE, Scanner input, final int INCREMENTOCONTROLLOINTERVALLO)
    {   
      boolean intervalloValido = false;
      
      String seBisezione;
      
      int valoreIntermedioIntervallo = estremoInferiore + INCREMENTOCONTROLLOINTERVALLO ;
  
      //il controllo è diverso a seconda della scelta del menu e quindi, della funzione
      switch (sceltaMenu)
      { 
          case 1: 
                do 
                {   //controllo se gli estremi dell'intervallo sono discordi   
                    if((Math.sin(estremoInferiore) - estremoInferiore - 1) < 0 && (Math.sin(valoreIntermedioIntervallo) - valoreIntermedioIntervallo - 1) > 0)
                    { 
                        intervalloValido = true;
                        System.out.println("[" + estremoInferiore + "," + valoreIntermedioIntervallo + "]" + 
                                " Intervallo compreso valido, soddisfa le ipotesi per applicare i metodi di approssimazione degli zeri.");
                        //invoco il metodo del punto unito
                        puntoUnito(sceltaMenu, estremoInferiore, valoreIntermedioIntervallo, PRECISIONE, input); 
                        do 
                        {                    
                            System.out.println("\n");
                            System.out.print("Vuoi applicare anche il metodo di bisezione sull'intervallo sopra riportato per confrontare i due risultati (si o no)? ");
                            seBisezione = input.nextLine();
                        } while (seBisezione.equalsIgnoreCase("si") == false && seBisezione.equalsIgnoreCase("no") == false);
                        //applico la bisezione se l'utente lo vuole
                        if(seBisezione.equalsIgnoreCase("si") == true)
                            bisezione(sceltaMenu, estremoInferiore, valoreIntermedioIntervallo, PRECISIONE);
                    }
                    //controllo se gli estremi dell'intervallo sono discordi 
                    if((Math.sin(estremoInferiore) - estremoInferiore - 1) > 0 && (Math.sin(valoreIntermedioIntervallo) - valoreIntermedioIntervallo - 1) < 0)
                    { 
                        intervalloValido = true;
                        System.out.println("[" + estremoInferiore + "," + valoreIntermedioIntervallo + "]" + 
                                " Intervallo compreso valido, soddisfa le ipotesi per applicare i metodi di approssimazione degli zeri.");
                        //invoco il metodo del punto unito
                        puntoUnito(sceltaMenu, estremoInferiore, valoreIntermedioIntervallo, PRECISIONE, input);
                        do 
                        {                    
                            System.out.println("\n");
                            System.out.print("Vuoi applicare anche il metodo di bisezione sull'intervallo sopra riportato per confrontare i due risultati (si o no)? ");
                            seBisezione = input.nextLine();
                        } while (seBisezione.equalsIgnoreCase("si") == false && seBisezione.equalsIgnoreCase("no") == false);
                        //applico la bisezione se l'utente lo vuole
                        if(seBisezione.equalsIgnoreCase("si") == true)
                            bisezione(sceltaMenu, estremoInferiore, valoreIntermedioIntervallo, PRECISIONE);
                    }
                    //scansiono l'intervallo di step in step (tipo -10 e -9. -9 e -8. -8 e -7. ecc...)
                    estremoInferiore = estremoInferiore + INCREMENTOCONTROLLOINTERVALLO;
                    valoreIntermedioIntervallo = valoreIntermedioIntervallo + INCREMENTOCONTROLLOINTERVALLO;
                } while (valoreIntermedioIntervallo <= estremoSuperiore); 
          break;
           
          case 2: 
                do 
                {   
                    //controllo se gli estremi dell'intervallo sono discordi   
                    if((0.25 * Math.pow(estremoInferiore, 2) -2*estremoInferiore +1) < 0 && (0.25 * Math.pow(valoreIntermedioIntervallo, 2) -2*valoreIntermedioIntervallo +1) > 0 )
                    { 
                        intervalloValido = true;
                        System.out.println("[" + estremoInferiore + "," + valoreIntermedioIntervallo + "]" + 
                                " Intervallo compreso valido, soddisfa le ipotesi per applicare i metodi di approssimazione degli zeri.");
                        //invoco il metodo del punto unito
                        puntoUnito(sceltaMenu, estremoInferiore, valoreIntermedioIntervallo, PRECISIONE, input); //come estremo superiore gli passo il valore più grande dell'intervallo che sto esaminando
                        do 
                        {                    
                            System.out.println("\n");
                            System.out.print("Sulla funzione presa in esame non sempre il metodo del punto unito da dei risultati corretti. Vuoi applicare anche la bisezione sull'intervallo sopra riportato (si o no)? ");
                            seBisezione = input.nextLine();
                        } while (seBisezione.equalsIgnoreCase("si") == false && seBisezione.equalsIgnoreCase("no") == false);
                        //applico la bisezione se l'utente lo vuole
                        if(seBisezione.equalsIgnoreCase("si") == true)
                            bisezione(sceltaMenu, estremoInferiore, valoreIntermedioIntervallo, PRECISIONE);
                         if(seBisezione.equalsIgnoreCase("si") == false)
                            System.out.println("\n");
                    }
                    //controllo se gli estremi dell'intervallo sono discordi   
                    if((0.25 * Math.pow(estremoInferiore, 2) -2*estremoInferiore +1) > 0 && (0.25 * Math.pow(valoreIntermedioIntervallo, 2) -2*valoreIntermedioIntervallo +1) < 0 )
                    { 
                        intervalloValido = true;
                         System.out.println("[" + estremoInferiore + "," + valoreIntermedioIntervallo + "]" + 
                                " Intervallo compreso valido, soddisfa le ipotesi per applicare i metodi di approssimazione degli zeri.");
                        //invoco il metodo del punto unito
                        puntoUnito(sceltaMenu, estremoInferiore, valoreIntermedioIntervallo, PRECISIONE, input);
                        do 
                        {                    
                            System.out.println("\n");
                            System.out.print("Sulla funzione presa in esame non sempre il metodo del punto unito da dei risultati corretti. Vuoi applicare anche la bisezione sull'intervallo sopra riportato (si o no)? ");
                            seBisezione = input.nextLine();
                        } while (seBisezione.equalsIgnoreCase("si") == false && seBisezione.equalsIgnoreCase("no") == false);
                        //applico la bisezione se l'utente lo vuole
                        if(seBisezione.equalsIgnoreCase("si") == true)
                            bisezione(sceltaMenu, estremoInferiore, valoreIntermedioIntervallo, PRECISIONE);
                        if(seBisezione.equalsIgnoreCase("si") == false)
                            System.out.println("\n");
                        
                    }
                     //scansiono l'intervallo di step in step (tipo -10 e -9. -9 e -8. -8 e -7. ecc...)
                    estremoInferiore = estremoInferiore + INCREMENTOCONTROLLOINTERVALLO;
                    valoreIntermedioIntervallo = valoreIntermedioIntervallo + INCREMENTOCONTROLLOINTERVALLO;
                } while (valoreIntermedioIntervallo <= estremoSuperiore); 
          break;
      }
      return intervalloValido;
    }
    
    /**
     * metodo di calcolo degli zeri della funzione mediante l'applicazione del metodo del punto unito
     * @param sceltaMenu valore di scelta delle funzioni dal menu
     * @param estremoInferiore valore più piccolo dell'intervallo fornito
     * @param estremoSuperiore valore più grande dell'intervallo fornito (dato in ingresso nel controllo dell'intervallo come valore intermedio dell'intervallo)
     * @param PRECISIONE precisione usata per la condizione di uscita fornita dall'utente
     * @param input oggetto usato per l'input da tastiera
     */
    public static void puntoUnito(int sceltaMenu, int estremoInferiore, int estremoSuperiore, double PRECISIONE, Scanner input)
    {
        double xPrecedente, xAttuale = 0;
        double puntoMedio = (estremoInferiore + estremoSuperiore)/2; //punto "casuale" all'interno dell'intevarllo da cui comincio ad applicare il metodo
        
        System.out.println("\n");
        System.out.println("METODO DEL PUNTO UNITO");
        System.out.println("\n");
        
        //calcolo usando la forma x=g(x). ES: (x1 = g(x0). x2 = g(x1)).
        switch (sceltaMenu) //switch per differenziare le due funzioni
        {
            
            case 1:
                xAttuale = Math.sin(puntoMedio) -1;  
                do 
                {
                    xPrecedente = xAttuale;
                    xAttuale = Math.sin(xPrecedente) -1;
                } while((xPrecedente - xAttuale) >= PRECISIONE); 
            break;
            
            case 2:
            
                xAttuale = 0.125 * Math.pow(puntoMedio, 2) + 0.5;
                do
                {
                    xPrecedente = xAttuale;
                    xAttuale = 0.125 * Math.pow(puntoMedio, 2) + 0.5;
                } while((xPrecedente - xAttuale) >= PRECISIONE);  
            break;
        }
        System.out.println("Risultato punto unito: " + xAttuale);
        try
        {   
            Thread.sleep(5000);
        }catch(Exception e){System.out.println("C'è stato un errore sullo sleep");}
    }
    /**
     * metodo usato per calcolare gli zeri della funzione mediante il metodo della bisezione
     * @param sceltaMenu valore di scelta delle funzioni dal menu    
     * @param estremoInferiore valore più piccolo dell'intervallo fornito
     * @param estremoSuperiore valore più grande dell'intervallo fornito (dato in ingresso nel controllo dell'intervallo come valore intermedio dell'intervallo)
     * @param PRECISIONE oggetto usato per l'input da tastiera 
     */
    public static void bisezione(int sceltaMenu, double estremoInferiore, double estremoSuperiore, double PRECISIONE)
    {   
        double puntoMedio = (estremoInferiore + estremoSuperiore)/2;
        int estremoNegativo;
        
        System.out.println("\n");
        System.out.println("METODO DI BISEZIONE");
        System.out.println("\n");
        
        //guardo quale estremo preso è negativo e quale positivo
        if((0.25 * Math.pow(estremoInferiore, 2) -2*estremoInferiore +1) < 0)
            estremoNegativo = 0;
        else
            estremoNegativo = 1;
        
        //differenzio il metodo in base alle funzioni
        
        /* 
        calcolo la funzione nel punto medio di volta in volta e se la funzione nel punto medio
        è negativa la metto al posto dell'estremo che, se calcolato nella funzione, è negativo.
        Se no lo metto nell'estremo positivo.
        */
        switch(sceltaMenu)
        {   
            case 1:
                do
                {
                    if((Math.sin(puntoMedio) - puntoMedio -1) < 0 && estremoNegativo == 0 )
                    {   
                        estremoInferiore = puntoMedio;
                    }
                    if((Math.sin(puntoMedio) - puntoMedio -1) < 0 && estremoNegativo == 1 )
                    {   
                        estremoSuperiore = puntoMedio;
                    }
                    if((Math.sin(puntoMedio) - puntoMedio -1) > 0 && estremoNegativo == 0 )
                    {   
                        estremoSuperiore = puntoMedio;
                    }
                    if((Math.sin(puntoMedio) - puntoMedio -1) > 0 && estremoNegativo == 1 )
                    {   
                        estremoInferiore = puntoMedio;
                    }
                    puntoMedio = (estremoInferiore + estremoSuperiore)/2;
                } while ((estremoInferiore - estremoSuperiore) > PRECISIONE || (estremoSuperiore - estremoInferiore) > PRECISIONE);
                break;
            case 2:
                do 
                {                    
                    if((0.25 * Math.pow(puntoMedio, 2) -2*puntoMedio +1) < 0 && estremoNegativo == 0)
                    {   
                        estremoInferiore = puntoMedio;
                    }
                    if((0.25 * Math.pow(puntoMedio, 2) -2*puntoMedio +1) < 0 && estremoNegativo == 1)
                    {   
                        estremoSuperiore = puntoMedio;
                    }
                    if((0.25 * Math.pow(puntoMedio, 2) -2*puntoMedio +1) > 0 && estremoNegativo == 0)
                    {   
                        estremoSuperiore = puntoMedio;
                    }
                    if((0.25 * Math.pow(puntoMedio, 2) -2*puntoMedio +1) > 0 && estremoNegativo == 1)
                    {   
                        estremoInferiore = puntoMedio;
                    }
                    puntoMedio = (estremoInferiore + estremoSuperiore)/2;
                } while ((estremoInferiore - estremoSuperiore) > PRECISIONE || (estremoSuperiore - estremoInferiore) > PRECISIONE);
                break;
        }
        System.out.println("Risultato bisezione: " + puntoMedio);
        System.out.println("\n");
        try
        {   
            Thread.sleep(5000);
        }catch(Exception e){System.out.println("C'è stato un errore sullo sleep.");}
    }
}

