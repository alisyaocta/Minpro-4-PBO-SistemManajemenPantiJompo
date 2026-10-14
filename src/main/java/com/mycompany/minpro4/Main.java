
package com.mycompany.minpro4;


import controller.PantiService;
import view.PantiView;
import java.util.Scanner;

public final class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        PantiService service = new PantiService(scanner);
        
        PantiView view = new PantiView(service, scanner);
        
        view.tampilkanMenuUtama();
        
        scanner.close();
    }
}

