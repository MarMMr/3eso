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
public class PreguntasMedio {
    private int num1;
    private int num2;
    private int num3;
    private int num4;
    private int num5;
    private int num6;
    private int num7;
    private int num8;

    public PreguntasMedio() {
        Random r1 = new Random();
        this.num1 = generaRaiz(50, r1.nextInt(220) + 1);
        this.num2 = generaRaiz(30, r1.nextInt(220) + 1);
        this.num3 = generaRaiz(40, r1.nextInt(220) + 1);
        this.num4 = generaRaiz(20   , r1.nextInt(220) + 1);
        this.num5 = generaRaiz(45, r1.nextInt(220) + 1);
        this.num6 = generaRaiz(40, r1.nextInt(220) + 1);
        this.num7 = generaRaiz(35, r1.nextInt(220) + 1);
        this.num8 = generaRaiz(20, r1.nextInt(220) + 1);
    }
    
    public static int generaRaiz(int min, int max) {
            Random rand = new Random();
            int numRand;
            int raizExacta = 0;

            do {
                    numRand = rand.nextInt(max - min + 1) + min;
                    if (esRaizExacta(numRand)) {
                                    raizExacta = numRand;
                    }
            } while (raizExacta == 0);

            return raizExacta;
    }

    public static boolean esRaizExacta(int n) {
            int sqrt = (int) Math.sqrt(n);
            return sqrt * sqrt == n;
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
        return num3;
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
    
}
