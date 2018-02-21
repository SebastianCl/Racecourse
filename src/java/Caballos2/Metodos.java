
package Caballos2;

public class Metodos {
    private String n1,n2;
    private int c1,c2,cG;
    private double a1,a2,m1,m2;
    private String error;

    public void setN1(String n1) {
        this.n1 = n1;
    }

    public void setN2(String n2) {
        this.n2 = n2;
    }

    
    public void setC1(int c1) {
        this.c1 = c1;
    }

    public void setC2(int c2) {
        this.c2 = c2;
    }

    public void setcG(int cG) {
        this.cG = cG;
    }

    public void setM1(double m1) {
        this.m1 = m1;
    }

    public void setM2(double m2) {
        this.m2 = m2;
    }
    
    public void setA1(double a1) {
        this.a1 = a1;
    }

    public void setA2(double a2) {
        this.a2 = a2;
    }

    public int getcG() {
        return cG;
    }

    public double getM1() {
        return m1;
    }

    public double getM2() {
        return m2;
    }
    
    public double getA1() {
        return a1;
    }

    public double getA2() {
        return a2;
    }

    public String getError() {
        return error;
    }
    
    public boolean validar(){
        if (cG == 0) {
            cG = (int) (Math.random() * 4) + 1;           
            return true;    
        }
        if (a1 > m1 ) {
            error = "El valor a apostar del jugador 1 es mayor que el saldo actual";
            return false;
        }
        if(a1<=0)
        {
          error = "El valor a apostar del jugador 1 debe ser mayor a cero";
            return false;  
        }
        if(a2<=0)
        {
          error = "El valor a apostar del jugador 2 debe ser mayor a cero";
            return false;  
        }
        if (a2 > m2 ) {
            error = "El valor a apostar del jugador 2 es mayor que el saldo actual";
            return false;
        }
        return true;
    }
    
    public void jugar(){
        
        if (c2 == cG && c1 == cG) {
            m2+= a2;
            m1+= a1;
        }
        else if ( c1 == cG ) {
            m1+= a1;
            m2-= a2;
        }
        else if (c2 == cG) {
            m1+= a1;
            m2-= a2;
        }
        else{
            m1-= a1;
            m2-= a2;
        }
    }
    
    public boolean validar2(){
        if (m1 == 0 && m2 == 0 ) {
            error = n2+ " y "+n1+" Se quedaron sin saldo. Quedaron eliminados.";
            return false;
        }
        if (m1 == 0 ) {
            error = n1+" Te quedaste sin saldo. El jugador 1 queda eliminado";
            return false;
        }
        if (m2 == 0 ) {
            error = n2+" Te quedaste sin saldo. El jugador 2 queda eliminado.";
            return false;
        }       
        return true;
    }
}
