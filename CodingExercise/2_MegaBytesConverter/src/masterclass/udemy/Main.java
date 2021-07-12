package masterclass.udemy;

public class Main {

    public static void main(String[] args) {
        public class MegaBytesConverter {

            public static void printMegaBytesAndKiloBytes(int kiloBytes) {
                int megaByte = Math.round(kiloBytes / 1024);
                int remainingKiloBytes = kiloBytes % 1024;
                System.out.println(kiloBytes < 0 ? "Invalid Value" : kiloBytes + " KB = " +
                        megaByte + " MB and " + remainingKiloBytes + " KB");
            }
        }
    }
}
