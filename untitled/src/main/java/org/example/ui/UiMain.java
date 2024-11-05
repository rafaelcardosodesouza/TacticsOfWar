package org.example.ui;

import java.util.Scanner;

public class UiMain {
    private Scanner sc = new Scanner(System.in);

    public static void inicio(){
        boolean controlador = true;

        while (controlador) {
            System.out.println(TextoUI.msgBoasVindas + TextoUI.menuPrincipal);
        }
    }

}
