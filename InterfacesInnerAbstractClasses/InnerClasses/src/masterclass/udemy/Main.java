package masterclass.udemy;

import jdk.vm.ci.meta.Local;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Button btnPrint = new Button("Print");

    public static void main(String[] args) {
//	Gearbox mcLaren = new Gearbox(6);
//	Gearbox.Gear first = mcLaren.new Gear(1, 12.3);
////	Gearbox.Gear second = new Gearbox.Gear(2, 15.4);
////	Gearbox.Gear third = new McLaren.Gear(3, 17.8);
//        System.out.println(first.driveSpeed(1000));
    //        mcLaren.addGear(1, 5.3);  because we created a for loop
    //        mcLaren.addGear(2, 10.6); in the constructor of Gearbox,
    //        mcLaren.addGear(3, 15.9); we do not need to manual add the gears

//        mcLaren.operateClutch(true);
//        mcLaren.changeGear(1);
//        mcLaren.operateClutch(false);
//        System.out.println(mcLaren.wheelSpeed(1000));
//        mcLaren.changeGear(2);
//        System.out.println(mcLaren.wheelSpeed(3000));
//        mcLaren.operateClutch(true);
//        mcLaren.changeGear(3);
//        mcLaren.operateClutch(false);
//        System.out.println(mcLaren.wheelSpeed(6000));

//        Local Class
//        class ClickListener implements Button.OnClickListener {
//            public ClickListener() {
//                System.out.println("I've been attached");
//            }
//
//            @Override
//            public void onClick(String title) {
//                System.out.println(title + " was clicked");
//            }
//        }
//
//        btnPrint.setOnClickListener(new ClickListener());
//        listen();
//    }

    private static void listen() {
        boolean quit = false;
        while(!quit) {
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    btnPrint.onClick();
            }
        }
    }
}
