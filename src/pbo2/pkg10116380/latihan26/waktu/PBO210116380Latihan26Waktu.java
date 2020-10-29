/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116380.latihan26.waktu;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * @author 
 * NAMA: Zain Achamd Rizqullah
 * KELAS: PBO2
 * NIM: 10116380
 * Deskripsi: Program Waktu Saat Ini
 */
public class PBO210116380Latihan26Waktu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat tanggal = new SimpleDateFormat("EEEE,d MMMM yyyy, "
                + "hh:mm:ss");

        String kalendar = tanggal.format(calendar.getTime());

        System.out.println("Hari Ini Adalah Hari : " + kalendar);
    }
    
}
