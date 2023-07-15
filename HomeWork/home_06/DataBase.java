package HomeWork.home_06;

import java.util.Arrays;
import java.util.HashSet;

public class DataBase {
    public static HashSet<Laptop> createDataBase() {

        Laptop l1 = new Laptop();
        l1.company = "MSI";
        l1.model = "MSI GF76 Katana 11UC-879XRU";
        l1.OS = "Windows";
        l1.color = "Black";
        l1.volumeRAM = 16;
        l1.volumeHDD = 512;
        l1.cpu.company = "Intel";
        l1.cpu.model = "Core i5-11400H";
        l1.cpu.numberOfCores = 6;
        l1.cpu.frequency = 2.7;
        l1.gpu.name = "GeForce RTX 3050";
        l1.gpu.memory = 4;

        Laptop l2 = new Laptop();
        l2.company = "ASUS";
        l2.model = "VivoBook PRO 15 M6500QC-HN058";
        l2.OS = "Windows";
        l2.color = "Blue";
        l2.volumeRAM = 16;
        l2.volumeHDD = 512;
        l2.cpu.company = "AMD";
        l2.cpu.model = "Ryzen 5 5600H";
        l2.cpu.numberOfCores = 6;
        l2.cpu.frequency = 3.3;
        l2.gpu.name = "GeForce RTX 3050";
        l2.gpu.memory = 4;

        Laptop l3 = new Laptop();
        l3.company = "ASUS";
        l3.model = "ROG Strix G15 G513RW-HQ177";
        l3.OS = "Linux";
        l3.color = "Yellow ";
        l3.volumeRAM = 32;
        l3.volumeHDD = 1000;
        l3.cpu.company = "AMD";
        l3.cpu.model = "Ryzen 9 6900HX";
        l3.cpu.numberOfCores = 8;
        l3.cpu.frequency = 3.3;
        l3.gpu.name = "GeForce RTX 3070 Ti";
        l3.gpu.memory = 8;

        Laptop l4 = new Laptop();
        l4.company = "Maibenben";
        l4.model = "X556";
        l4.OS = "Windows";
        l4.color = "Black";
        l4.volumeRAM = 16;
        l4.volumeHDD = 512;
        l4.cpu.company = "AMD";
        l4.cpu.model = "Ryzen 5 5600H";
        l4.cpu.numberOfCores = 6;
        l4.cpu.frequency = 3.3;
        l4.gpu.name = "GeForce RTX 3050";
        l4.gpu.memory = 4;

        Laptop l5 = new Laptop();
        l5.company = "MSI";
        l5.model = "Katana B12VFK-463XRU";
        l5.OS = "Linux";
        l5.color = "Black";
        l5.volumeRAM = 16;
        l5.volumeHDD = 512;
        l5.cpu.company = "Intel";
        l5.cpu.model = "Core i5-12450H";
        l5.cpu.numberOfCores = 8;
        l5.cpu.frequency = 2;
        l5.gpu.name = "GeForce RTX 4060";
        l5.gpu.memory = 8;

        Laptop l6 = new Laptop();
        l6.company = "Maibenben";
        l6.model = "X558";
        l6.OS = "Windows";
        l6.color = "Yellow ";
        l6.volumeRAM = 16;
        l6.volumeHDD = 512;
        l6.cpu.company = "AMD";
        l6.cpu.model = "Ryzen 7 5800H";
        l6.cpu.numberOfCores = 8;
        l6.cpu.frequency = 3.2;
        l6.gpu.name = "GeForce RTX 3060";
        l6.gpu.memory = 6;

        Laptop l7 = new Laptop();
        l7.company = "MSI";
        l7.model = "Vector GP77 13VG-060XRU";
        l7.OS = "Windows";
        l7.color = "Black";
        l7.volumeRAM = 16;
        l7.volumeHDD = 1000;
        l7.cpu.company = "Intel";
        l7.cpu.model = "Core i7-13700H";
        l7.cpu.numberOfCores = 14;
        l7.cpu.frequency = 2.4;
        l7.gpu.name = "GeForce RTX 4070";
        l7.gpu.memory = 8;

        Laptop l8 = new Laptop();
        l8.company = "ASUS";
        l8.model = "TUF Dash F15 FX517ZE-HN107";
        l8.OS = "Linux";
        l8.color = "White ";
        l8.volumeRAM = 16;
        l8.volumeHDD = 512;
        l8.cpu.company = "Intel";
        l8.cpu.model = "Core i7-12650H";
        l8.cpu.numberOfCores = 10;
        l8.cpu.frequency = 2.3;
        l8.gpu.name = "GeForce RTX 3050 Ti";
        l8.gpu.memory = 4;

        Laptop l9 = new Laptop();
        l9.company = "ARDOR GAMING";
        l9.model = "NEO G15-I5ND201";
        l9.OS = "Windows";
        l9.color = "Black";
        l9.volumeRAM = 16;
        l9.volumeHDD = 512;
        l9.cpu.company = "Intel";
        l9.cpu.model = "Core Core i5-12500H";
        l9.cpu.numberOfCores = 12;
        l9.cpu.frequency = 2.5;
        l9.gpu.name = "GeForce RTX 3050";
        l9.gpu.memory = 4;

        Laptop l10 = new Laptop();
        l10.company = "ASUS";
        l10.model = "TUF Gaming F17 FX707ZV4-HX028";
        l10.OS = "Windows";
        l10.color = "Red ";
        l10.volumeRAM = 16;
        l10.volumeHDD = 512;
        l10.cpu.company = "Intel";
        l10.cpu.model = " Core i7-12700H";
        l10.cpu.numberOfCores = 14;
        l10.cpu.frequency = 2.3;
        l10.gpu.name = "GeForce RTX 4060";
        l10.gpu.memory = 8;

        Laptop l11 = new Laptop();
        l11.company = "MSI";
        l11.model = "Crosshair 17 C12VG-287XRU";
        l11.OS = "Windows";
        l11.color = "White ";
        l11.volumeRAM = 16;
        l11.volumeHDD = 1000;
        l11.cpu.company = "Intel";
        l11.cpu.model = "Core i7-12650H";
        l11.cpu.numberOfCores = 10;
        l11.cpu.frequency = 2.3;
        l11.gpu.name = "GeForce RTX 4070";
        l11.gpu.memory = 8;

        Laptop l12 = new Laptop();
        l12.company = "Acer";
        l12.model = "Nitro 5 AN515-58-557Q";
        l12.OS = "Windows";
        l12.color = "Yellow ";
        l12.volumeRAM = 16;
        l12.volumeHDD = 512;
        l12.cpu.company = "Intel";
        l12.cpu.model = "Core i5-12500H";
        l12.cpu.numberOfCores = 12;
        l12.cpu.frequency = 2.5;
        l12.gpu.name = "GeForce RTX 3050";
        l12.gpu.memory = 4;

        Laptop l13 = new Laptop();
        l13.company = "MSI";
        l13.model = "Bravo 15 C7VF-039XRU";
        l13.OS = "Linux";
        l13.color = "Black";
        l13.volumeRAM = 16;
        l13.volumeHDD = 512;
        l13.cpu.company = "AMD";
        l13.cpu.model = "Ryzen 5 7535HS";
        l13.cpu.numberOfCores = 6;
        l13.cpu.frequency = 3.3;
        l13.gpu.name = "GeForce RTX 4060";
        l13.gpu.memory = 8;

        return new HashSet<>(Arrays.asList(l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13));

    }

}