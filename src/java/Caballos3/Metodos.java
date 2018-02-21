
package Caballos3;

public class Metodos {
     private String nom1,nom2,nom3,error,msj;
     private int    num1,num2,num3,numG;
     private double a1,a2,a3;
     private double m1,m2,m3;
     
      public String[] nom;
      public int[]    num;
      public double[] apuestas;
      public double []montos;
      
      public String[] n2;
      public double[] apuestas2;
      public double []montos2;
      int cont = 0;
      
    public void setNom1(String nom1) {
        this.nom1 = nom1;
    }

    public void setNom2(String nom2) {
        this.nom2 = nom2;
    }

    public void setNom3(String nom3) {
        this.nom3 = nom3;
    }
    
    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void setNum3(int num3) {
        this.num3 = num3;
    }
    
     public void setNumG(int numG) {
        this.numG = numG;
    }

    public void setA1(double a1) {
        this.a1 = a1;
    }
    public void setA2(double a2) {
        this.a2 = a2;
    }
    public void setA3(double a3) {
        this.a3 = a3;
    }
     public void setM1(double m1) {
        this.m1 = m1;
    }
    public void setM2(double m2) {
        this.m2 = m2;
    }
    public void setM3(double m3) {
        this.m3 = m3;
    }
    
     public String getError() {
        return error;
    }

    public double getA1() {
        return a1;
    }

    public double getA2() {
        return a2;
    }

    public double getA3() {
        return a3;
    }
    public double getM1() {
        return m1;
    }

    public double getM2() {
        return m2;
    }

    public double getM3() {
        return m3;
    }
    
    public String getMsj() {
        return msj;
    }

    public int getNumG() {
        return numG;
    }
    
    public boolean validar(){
         if (m1 < a1) {
            error = "La apuesta del jugador "+ nom1 +"  no es valida";
            return false;
        }
        
        if (m2 < a2) {
            error = "La apuesta del jugador 2 "+ nom2 +" no es valida";
            return false;
        }
        
        if (m3 < a3) {
            error = "La apuesta del jugador 3 "+ nom3 +" no es valida";
            return false;
        }
        
        if (numG == 0) {
            numG = (int) (Math.random() * 4) + 1;
            return true;    
        }
        return true;
    }
    
    private void llenarVectores(){
        nom = new String[3];
        num = new int[3];
        apuestas = new double[3];
        montos = new double[3];
        
        //llenamos el vector nom con los nombres
        nom[0] = nom1;
        nom[1] = nom2;
        nom[2] = nom3;

        
        // llenamos el vector num con los numeros con q apuestan
        num[0] = num1;
        num[1] = num2;
        num[2] = num3;
        
        //llenamos el vector apuestas con las apuestas
        apuestas[0] = a1;
        apuestas[1] = a2;
        apuestas[2] = a3;
        
        //llenamos el vector montos con los montos
        montos[0] = m1;
        montos[1] = m2;
        montos[2] = m3;
    }
    
    private void jugadoresConSaldo(){
        for (int i = 0; i < montos.length; i++) {
            if (montos[i] > 0) {
                cont++;
            }
        }
        
        n2 = new String[cont];
        montos2 = new double[cont];
        apuestas2 = new double[cont];
        
        int j=0;
        for (int i = 0; i < montos.length; i++) {
            if (montos[i] > 0) {
                montos2[j] = montos[i];
                apuestas2[j] = apuestas[i];
                n2[j] = nom[i];
                j++;
            }           
        }
    }
    
    public void jugar(){
        llenarVectores();
        
        for (int i = 0; i < num.length; i++) {
            int aux = num[i];
            
                if (aux == numG) {
                    montos[i] = montos[i]+apuestas[i];
                }
                else{
                    montos[i] = montos[i]-apuestas[i];              
                }
        }
        
        m1 = montos[0];
        m2 = montos[1];
        m3 = montos[2];
        
        a1 = apuestas[0];
        a2 = apuestas[1];
        a3 = apuestas[2];
        
        jugadoresConSaldo();
    }
     
}
