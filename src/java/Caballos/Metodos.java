
package Caballos;

public class Metodos {
    private String nom,error;
    private int    caballo,caballoG,caballo2;
    private double apuesta, monto;
    

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setCaballo(int caballo) {
        this.caballo = caballo;
    }

    public void setCaballoG(int caballoG) {
        this.caballoG = caballoG;
    }

    public void setApuesta(double apuesta) {
        this.apuesta = apuesta;
    }
    
    public void setMonto(double monto) {
        this.monto = monto;
    }

    public void setCaballo2(int caballo2) {
        this.caballo2 = caballo2;
    }

    public String getError() {
        return error;
    }

    public double getApuesta() {
        return apuesta;
    }
    
    public double getMonto() {
        return monto;
    }

    public int getCaballoG() {
        return caballoG;
    }
    
    public boolean validar(){
        if (caballoG == 0) {
            caballoG = (int) (Math.random() * 4) + 1;
            return true;    
        }
        if(apuesta<=0)
        {
            error = "El valor a apostar debe ser mayor a cero";
            return false;  
        }
        if (apuesta > monto ) {
            error = "El valor a apostar es mayor que el saldo actual";
            return false;
        }
        return true;
    }
    
    public boolean validar2(){
        if (monto == 0 ) {
            error = nom+"Te quedaste sin saldo. Quedas eliminado";
            return false;
        }
        return true;
    }
    
    public void Jugar(){
        
        if ( caballo == caballoG ) {
            monto+= apuesta;
        }
        else if (caballo2 == caballoG) {
            monto-= apuesta;
        }
        else{
            monto-= apuesta;
        }
    }
    
    
    
}
