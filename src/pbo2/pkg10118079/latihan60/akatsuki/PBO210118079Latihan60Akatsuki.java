/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118079.latihan60.akatsuki;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class PBO210118079Latihan60Akatsuki {
 public String nama;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        kelompokakatsuki hasil = new itachi();
        Scanner user = new Scanner(System.in);
        System.out.println("Masukan nama yang ingin anda cari(itachi/pain/tobi/deidara/hidan/kakuzu/kisame/sasori/konan): ");
        hasil.setNama(user.next());
        hasil.tampil();
    }
    
}
