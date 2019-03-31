package es.ifp.gestordescargas;

import java.util.Random;
import javax.swing.SwingWorker;

/**
 *
 * @author Santiago Faci
 */
public class TareaDescarga extends SwingWorker<Void, Integer> {
    
    private boolean finalizada;
    private boolean cancelada;
    private String url;
    
    public TareaDescarga(String url) {
        finalizada = false;
        cancelada = false;
        this.url = url;
    }
    
    public void cancelar() {
        cancelada = true;
    }
    
    public void finalizar() {
        finalizada = true;
    }
    
    @Override
    protected Void doInBackground() throws Exception {
        int progreso = 0;
        
        
        while (progreso < 100) {
            progreso += 5;
            setProgress(progreso);
            
            try {
                Thread.sleep(new Random().nextInt(400));
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
            
            if (cancelada || finalizada) {
                break;
            }
        }
        
        return null;
    }
}
