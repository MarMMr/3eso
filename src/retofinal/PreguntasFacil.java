/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package retofinal;

import java.util.Random;

/**
 *
 * @author dam126
 */
public class PreguntasFacil {
    private Random n1 = new Random();
    private Random n2 = new Random();
    private Random n3 = new Random();
    private int num1 = n1.nextInt(101)+1;
    private int num2 = n1.nextInt(101)+1;
    private int num3 = n1.nextInt(101)+1;
    private int num4;
    private int num5;
    private int num6 = n3.nextInt(101)+1;
    private int num7 = n3.nextInt(101)+1;
    private int num8;
    private int num9;
    private boolean verificar = false;

    public PreguntasFacil() {
        do{
            num4 = n1.nextInt(300)+1;
            num5 = n2.nextInt(100)+1;
            if (num4 % num5 == 0) {
                verificar = true;
            }
        }while(!verificar);
        
        do{
            verificar = false;
            num8 = n1.nextInt(200)+1;
            num9 = n2.nextInt(100)+1;
            if (num8 % num9 == 0) {
                verificar = true;
            }
        }while(!verificar);
    }

    public Random getN1() {
        return n1;
    }

    public void setN1(Random n1) {
        this.n1 = n1;
    }

    public Random getN2() {
        return n2;
    }

    public void setN2(Random n2) {
        this.n2 = n2;
    }
    
        public Random getN3() {
        return n3;
    }

    public void setN3(Random n3) {
        this.n3 = n3;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum3() {
        return num2;
    }

    public void setNum3(int num3) {
        this.num3 = num3;
    }

    public int getNum4() {
        return num4;
    }

    public void setNum4(int num4) {
        this.num4 = num4;
    }

    public int getNum5() {
        return num5;
    }

    public void setNum5(int num5) {
        this.num5 = num5;
    }

    public int getNum6() {
        return num6;
    }

    public void setNum6(int num6) {
        this.num6 = num6;
    }

    public int getNum7() {
        return num7;
    }

    public void setNum7(int num7) {
        this.num7 = num7;
    }

    public int getNum8() {
        return num8;
    }

    public void setNum8(int num8) {
        this.num8 = num8;
    }

    public int getNum9() {
        return num9;
    }

    public void setNum9(int num9) {
        this.num9 = num9;
    }

    

    public boolean isVerificar() {
        return verificar;
    }

    public void setVerificar(boolean verificar) {
        this.verificar = verificar;
    }


    

    
}
