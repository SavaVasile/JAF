package package1;

import package1.JAF;

public class Main {
    static JAF jaf1 = new JAF("sdsd",3,4,"ewe");
    static package2.JAF jaf2 = new package2.JAF();

    public static void main(String[] args) {
        jaf1.prenume = "asdsa";
        jaf1.age = 3;
        jaf1.id = 4;
        jaf2.id = 5;
    }
}

