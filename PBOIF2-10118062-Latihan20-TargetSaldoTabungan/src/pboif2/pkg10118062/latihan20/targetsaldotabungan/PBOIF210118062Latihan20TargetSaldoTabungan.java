/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10118062.latihan20.targetsaldotabungan;

/**
 *
 * @author ASUS
 */
public class PBOIF210118062Latihan20TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a,saldo,bunga;
        saldo=3500000;
        bunga=(int)(saldo*0.08);
        saldo = saldo+bunga;
        a=1;
        do{
            System.out.println("Saldo di bulan ke-" + a + "Rp." +saldo);
        a++;
        bunga=(int)(saldo*0.08);
        saldo+=bunga;
        }while(a<=8);
        }
    
}
