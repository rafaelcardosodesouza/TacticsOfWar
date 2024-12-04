package org.example.ui;

import org.example.service.ControllerMenu;

import java.util.Scanner;

public class UiMain {
    private static Scanner sc = new Scanner(System.in);

    public static void inicio() {
        boolean controlador = true;
        ControllerMenu controllerMenu = new ControllerMenu();

        while (controlador) {
            System.out.println(TextoUI.msgBoasVindas + TextoUI.menuPrincipal);
            int op = sc.nextInt();
            switch (op) {
                case 1:
                    controllerMenu.simuladorBatalha();
                    break;
                case 2:
                    controllerMenu.somaGastos();
                    break;
                case 3:
                    controllerMenu.simuladorBatalha();
                    break;
                case 0:
                    controlador = controllerMenu.saida();
                    break;
                default:
                    System.out.println(TextoUI.ANSI_RED + "Opção invalida!" + TextoUI.ANSI_RESET);
            }
        }
    }

}
