package COR.M03;

import java.util.Scanner;

public class MenuPrincipal implements Menu {

    @Override
    public void showMenu(Player player) {
        Scanner scan = new Scanner(System.in);

        System.out.println("=============================================");
        System.out.println("         Welcome : " + player.getName() );

        while ( this.getOption() > 4 || this.getOption() < 1 ) {
            System.out.println("=============================================");
            System.out.println("==  1. PLAY                                ==");
            System.out.println("==  2. Player Settings                     ==");
            System.out.println("==  3. Show Scores                         ==");
            System.out.println("==  4. Close & Exit                        ==");
            System.out.println("=============================================");
            this.setOption( scan.nextInt() );

            switch (this.option) {
                case 1:
                    System.out.println("==  Opció 1 ==");
                    break;
                case 2:
                    System.out.println("==  Opció 2 ==");
                    break;
                case 3:
                    System.out.println("==  Opció 3 ==");
                    break;
                case 4:
                    System.out.println("==  Opció 4 ==");
                    break;
                default:
                    System.out.println("==  ?? Please choose one of the following: ==");
            }

        } // end while

    } // end showMenu(P p)
}
