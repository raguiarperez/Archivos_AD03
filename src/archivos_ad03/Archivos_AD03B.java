/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos_ad03;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author dam2
 */
public class Archivos_AD03B {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException  {
        BufferedInputStream imagebis = new BufferedInputStream (new FileInputStream ("/home/oracle/Desktop/egipto.jpg"));
        BufferedOutputStream imagebos = new BufferedOutputStream(new FileOutputStream ("/home/oracle/Desktop/egipto3.jpg"));
        
        int valor=imagebis.read();
        while (valor!=-1){
            imagebos.write(valor);
        valor=imagebis.read();
        }
        imagebis.close();
        imagebos.close();
    }
}
