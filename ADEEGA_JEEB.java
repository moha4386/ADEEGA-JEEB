import java.util.Scanner;

public class ADEEGA_JEEB {
    static Scanner input = new Scanner(System.in);

    // PIN-ka iyo haraaga bilowga ah
    static int furahaSirta = 9999;
    static double haraaga = 1000;

    // Liiska adeegyada
    static String[] adeegyada = {
            "Hubi Haraaga",
            "Lacag Dir",
            "Kaarka hadalka",
            "Kaarka Internetka",
            "Warbixin Kooban",
            "Banks",
            "Maareynta"
    };

    public static void main(String[] args) {

        // Cinwaanka barnaamijka
        System.out.println(" A D E E G A   J E E B ");

        // Isticmaaluhu wuxuu gelinayaa *810#
        System.out.print("GARAAC ADEEG JEEB: ");
        String jeb = input.next();

        // Hubinta code-ka adeegga
        if (!jeb.equals("*810#")) {
            System.out.println("Adeeg khaldan ayaad garaacday!");
            return;
        }

        // Gelinta PIN-ka
        System.out.print("Geli Furaha Sirta: ");
        int pin = input.nextInt();

        // Hubinta saxnaanta PIN-ka
        if (pin != furahaSirta) {
            System.out.println("Furaha sirta waa khalad!");
            return;
        }

//        methodka lagu magacabo jeeb ayan maunka ka wacay
        jeeb();
    }

    // Menu-ga ugu weyn
    public static void jeeb() {

        int choice;

        do {
            System.out.println("\n===== ADEEGYADA =====");

            // Soo bandhig adeegyada
            for (int i = 0; i < adeegyada.length; i++) {
                System.out.println((i + 1) + ". " + adeegyada[i]);
            }

            System.out.println("0. Ka Bax");
            System.out.print("Dooro adeeg: ");
            choice = input.nextInt();

            // Doorashada adeegga
            switch (choice) {

                case 1:
                    hubiHaraaga();
                    break;

                case 2:
                    dirLacag();
                    break;

                case 3:
                    kaarkaHadalka();
                    break;

                case 4:
                    kaarkaInternetka();
                    break;

                case 5:
                    warbixinKooban();
                    break;

                case 6:
                    banks();
                    break;

                case 7:
                    maareynta();
                    break;

                case 0:
                    System.out.println("Mahadsanid!");
                    break;

                default:
                    System.out.println("Doorasho khaldan.");
            }

        } while (choice != 0);
    }

    // Muuji haraaga
    public static void hubiHaraaga() {
        System.out.println("Haraagaagu waa $" + haraaga);
    }

    // Lacag dirid
    public static void dirLacag() {

        System.out.print("Geli number-ka: ");
        String number = input.next();

        System.out.print("Geli lacagta: ");
        double lacag = input.nextDouble();

        // Hubi haraaga
        if (lacag <= haraaga) {
            haraaga -= lacag;
            System.out.println("$" + lacag + " ayaa loo diray " + number);
        } else {
            System.out.println("Haraaga kuguma filna.");
        }
    }

    // Kaarka hadalka lagu shubanayo
    public static void kaarkaHadalka() {

        System.out.print("Geli lacagta: ");
        double lacag = input.nextDouble();

        if (lacag <= haraaga) {
            haraaga -= lacag;
            System.out.println("Waxaad ku shubatay $" + lacag);
        } else {
            System.out.println("Haraaga kuguma filna.");
        }
    }

    // Iibsiga internet-ka
    public static void kaarkaInternetka() {

        System.out.println("1. $1");
        System.out.println("2. $2");
        System.out.println("3. $5");

        int choice = input.nextInt();

        // Ka jarida lacagta ku xiran
        if (choice == 1 && haraaga >= 1) {
            haraaga -= 1;
        } else if (choice == 2 && haraaga >= 2) {
            haraaga -= 2;
        } else if (choice == 3 && haraaga >= 5) {
            haraaga -= 5;
        } else {
            System.out.println("Doorasho khaldan ama haraagaa yar.");
            return;
        }

        System.out.println("Ku guuleysatay iibsiga internetka.");
    }

    // Warbixin kooban
    public static void warbixinKooban() {

        int choice;

        do {
            System.out.println("\n=== WARBIXIN KOOBAN ===");
            System.out.println("1. Last Action");
            System.out.println("2. Wareejintii u dambeysay");
            System.out.println("3. Iibsashadii u dambeysay");
            System.out.println("4. Last 3 Actions");
            System.out.println("0. Noqo");

            choice = input.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Last Action: Lacag diris");
                    break;

                case 2:
                    System.out.println("Wareejin: $20");
                    break;

                case 3:
                    System.out.println("Iibsasho: Kaarka hadalka $5");
                    break;

                case 4:
                    System.out.println("1. Diris $20\n2. Kaarka $5\n3. Haraaga");
                    break;

                case 0:
                    return;

                default:
                    System.out.println("Doorasho khaldan.");
            }

        } while (true);
    }

    // Liiska bangiyada
    public static void banks() {

        String[] bangiyo = {
                "Salaam Bank",
                "Premier Bank",
                "IBS Bank",
                "Dahabshiil Bank"
        };

        // Soo bandhig bangiyada
        for (String b : bangiyo) {
            System.out.println(b);
        }
    }

    // Menu-ga maareynta
    public static void maareynta() {

        int choice;

        do {
            System.out.println("\n===== MAAREYNTA =====");
            System.out.println("1. Bedel PIN");
            System.out.println("2. Bedel Luqad");
            System.out.println("3. Mobile Lumay");
            System.out.println("4. Lacag Xirasho");
            System.out.println("5. Lacag Qaldantay");
            System.out.println("0. Noqo");

            choice = input.nextInt();

            switch (choice) {

                case 1:
                    bedelPin();
                    break;

                case 2:
                    bedelLuqad();
                    break;

                case 3:
                    mobileLumay();
                    break;

                case 4:
                    lacagXirasho();
                    break;

                case 5:
                    lacagQaldantay();
                    break;

                case 0:
                    return;

                default:
                    System.out.println("Doorasho khaldan.");
            }

        } while (true);
    }

    // PIN-ka beddel
    public static void bedelPin() {

        System.out.print("Geli PIN hore: ");
        int old = input.nextInt();

        if (old == furahaSirta) {
            System.out.print("Geli PIN cusub: ");
            furahaSirta = input.nextInt();
            System.out.println("PIN waa la beddelay.");
        } else {
            System.out.println("PIN hore waa khalad.");
        }
    }

    // Luqadda beddel
    public static void bedelLuqad() {

        System.out.println("1. Somali");
        System.out.println("2. English");

        int lang = input.nextInt();

        if (lang == 1) {
            System.out.println("Luqad: Somali");
        } else if (lang == 2) {
            System.out.println("Language: English");
        } else {
            System.out.println("Khalad.");
        }
    }

    // Mobile lumay
    public static void mobileLumay() {
        System.out.println("Mobile lumay waa la diiwaangeliyey.");
    }

    // Lacag xirasho
    public static void lacagXirasho() {

        System.out.print("Geli lacag: ");
        double lacag = input.nextDouble();

        if (lacag <= haraaga) {
            haraaga -= lacag;
            System.out.println("Lacag waa la xiray: $" + lacag);
        } else {
            System.out.println("Haraaga kuguma filna.");
        }
    }

    // Soo celinta lacag qaldantay
    public static void lacagQaldantay() {

        System.out.print("Geli number: ");
        input.next();

        System.out.print("Geli lacag: ");
        double lacag = input.nextDouble();

        haraaga += lacag;

        System.out.println("Lacag waa lagu soo celiyey: $" + lacag);
    }
}