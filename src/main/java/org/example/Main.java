package org.example;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Przestawienie macierzowe d=5 key=3-4-1-5-2");
        System.out.println("Wybor Opcji:");
        System.out.println("1. Kodowanie");
        System.out.println("2. Dekodowanie");
        String mode = scanner.nextLine(); //pobieranie opcji
        int modeNr = Integer.parseInt(mode);
        String result = "";
        String inputText = "";
        boolean exit=false;

        do {
            switch (modeNr) {
                case 1: { //KODOWANIE
                    System.out.println("Podaj tekst do zakodowania: ");
                    inputText = scanner.nextLine(); //wpisywanie tekstu do zakodowania

                    result = "Zakodowany tekst: " + Code(inputText);
                    exit=true;
                    break;
                }
                case 2: { //DEKODOWANIE
                    System.out.println("Podaj tekst do odkodowania: ");
                    inputText = scanner.nextLine(); //wpisywanie tekstu do odkodowania
                    result = "Zdekodowany tekst: " + Decode(inputText);
                    exit=true;
                    break;
                }
                default: {
                    System.out.println("Wybierz poprawna opcje:");
                    System.out.println("1. Kodowanie");
                    System.out.println("2. Dekodowanie");
                    mode = scanner.nextLine(); //pobieranie opcji
                    modeNr = Integer.parseInt(mode);
                }
            }
        }while(!exit);


        System.out.println(result);

    }


    // d = 5 , key = 3-4-1-5-2
    public static String Code(String text){
        String codedText = "";
        StringBuilder textCoder = new StringBuilder();
        for (int i = 0; i < text.length(); i += 5) {   //pobieraj po 5 znaków z tekstu

            int letter1 = i + 2;                            //pierwszy znak nowej piątki to trzeci znak pierwotnej
            if (letter1 < text.length())
                textCoder.append(text.charAt(letter1));     //wstawianie trzeciego znaku na kolejnej pozycji

            int letter2 = i + 3;                            //drugi znak nowej piątki to czwarty znak pierwotnej
            if (letter2 < text.length())
                textCoder.append(text.charAt(letter2));     //wstawianie czawrtego znaku na kolejnej pozycji


            int letter3 = i;                                //trzeci znak nowej piątki to pierwszy znak pierwotnej
                                                            //nie ma potrzeby sprawdzać dlugości skoro wczytano znak (i<text.lenght)
            textCoder.append(text.charAt(letter3));         //wstawianie piątego znaku na kolejnej pozycji

            int letter4 = i + 4;                            //czwarty znak nowej piątki to piąty znak pierwotnej
            if (letter4 < text.length())
                textCoder.append(text.charAt(letter4));

            int letter5 = i + 1;                            //piąty znak nowej piątki to drugi znak pierwotnej
            if (letter5 < text.length())
                textCoder.append(text.charAt(letter5));
        }
        codedText=textCoder.toString();
        return codedText;
    }


    // d = 5 , key = 3-4-1-5-2
    public static String Decode(String text){
        String codedText = "";
        StringBuilder textCoder = new StringBuilder();
        for (int i = 0; i < text.length(); i += 5) {   //pobieraj po 5 znakow z tekstu

            int letter1 = i + 2;                            //pierwszy znak nowej piątki to trzeci znak pierwotnej
            if (letter1 < text.length())
                textCoder.append(text.charAt(letter1));     //wstawianie znaku na kolejnej pozycji

            int letter2 = i + 4;                            //drugi znak nowej piątki to piąty znak pierwotnej
            if (letter2 < text.length())
                textCoder.append(text.charAt(letter2));     //wstawianie znaku na kolejnej pozycji


            int letter3 = i;                                //trzeci znak nowej piątki to pierwszy znak pierwotnej
                                                             //nie ma potrzeby sprawdzać dlugości skoro wczytano znak (i<text.lenght)
            textCoder.append(text.charAt(letter3));         //wstawianie znaku na kolejnej pozycji

            int letter4 = i + 1;                            //czwarty znak nowej piątki to drugi znak pierwotnej
            if (letter4 < text.length())
                textCoder.append(text.charAt(letter4));

            int letter5 = i + 3;                            //piąty znak nowej piątki to czwarty znak pierwotnej
            if (letter5 < text.length())
                textCoder.append(text.charAt(letter5));
        }
        codedText=textCoder.toString();
        return codedText;

    }

}