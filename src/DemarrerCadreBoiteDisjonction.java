

/**
 *  Démarre l'application de simulation de boites de disjonction intelligente
 * dans un environnement GUI à l’aide de Swing.
 *  
 *  Dans le cadre du cours inf111 A2016
 *  
 * @author Pierre Bélisle (copyright A2016).
 */
public class DemarrerCadreBoiteDisjonction {

  /**
    * On démarre l'application dans un processus séparé du main 
    * pour éviter des conflits de gestion d'événements avec
    * le OS
    * 
    */
    public static void main(String args[]) {
    	   	    	    	
     	
    	// Le OS démarre le programme dès qu'il le peut.
    	Thread t = new Thread(new CadreBoiteDisjonction ());    	
    	t.start();	 
    }
}
