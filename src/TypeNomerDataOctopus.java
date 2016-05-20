
import java.io.*;

public class TypeNomerDataOctopus {
    public static void main(String[] args) throws Exception{


        String InitialNumbers; //числа, которые получаем на вход
        String[] SplittedInitialNumbers;
        int[] IntSplittedInitialNumbers = new int[3];
        int[] FirstNumber = new int[3];
        int[] SecondNumber = new int[3];
        int[] ThirdNumber = new int[3];
        int i,j;
        int mask1 = 0b1110000000000000; //маски для сдвига
        int mask2 = 0b0001110000000000;
        int mask3 = 0b0000001111111111;
        String Empty = "";

        FileReader fr = new FileReader("TerminalModel\\0x01.txt");
        BufferedReader br = new BufferedReader(fr);
        InitialNumbers = br.readLine();
        fr.close();
        System.out.println(InitialNumbers);
        //System.out.println("Enter initial numbers:");
        //Scanner sc = new Scanner(System.in); //вводим три числа с клавиатуры
        //InitialNumbers = sc.nextLine();
        SplittedInitialNumbers = InitialNumbers.split("-"); //разбиваем их на массив из трех строк
        //System.out.println(SplittedInitialNumbers[0]);

        for(i=0,j=0; i<SplittedInitialNumbers.length; i++) {


            if(!SplittedInitialNumbers[i].isEmpty()) {

                IntSplittedInitialNumbers[j] = Integer.parseInt(SplittedInitialNumbers[i]); //делаем массив целых чисел


                if (SplittedInitialNumbers[i].isEmpty()) {

                    IntSplittedInitialNumbers[j] = -1 * IntSplittedInitialNumbers[j];

                }
                else{
                    IntSplittedInitialNumbers[j] = IntSplittedInitialNumbers[j];
                }

                System.out.println(IntSplittedInitialNumbers[j]); //выводим эллементы массива

                System.out.println(Integer.toString(IntSplittedInitialNumbers[j], 2)); //они же в двуичной системе
                j++;
            }



        }

        FirstNumber[0] = IntSplittedInitialNumbers[0]&mask1;
        FirstNumber[0]>>=13;
        System.out.println("Type of first number:" + FirstNumber[0]);

        FirstNumber[1] = IntSplittedInitialNumbers[0]&mask2;
        FirstNumber[1]>>=10;
        System.out.println("Number of first number:" + FirstNumber[1]);

        FirstNumber[2] = IntSplittedInitialNumbers[0]&mask3;
        System.out.println("Data of first number::" + FirstNumber[2]);


        SecondNumber[0] = IntSplittedInitialNumbers[1]&mask1;
        SecondNumber[0]>>=13;
        System.out.println("Type of second number:" + SecondNumber[0]);

        SecondNumber[1] = IntSplittedInitialNumbers[1]&mask2;
        SecondNumber[1]>>=10;
        System.out.println("Number of second number:" + SecondNumber[1]);

        SecondNumber[2] = IntSplittedInitialNumbers[1]&mask3;
        System.out.println("Data of second number::" + SecondNumber[2]);

        ThirdNumber[0] = IntSplittedInitialNumbers[2]&mask1;
        ThirdNumber[0]>>=13;
        System.out.println("Type of third number:" + ThirdNumber[0]);

        ThirdNumber[1] = IntSplittedInitialNumbers[2]&mask2;
        ThirdNumber[1]>>=10;
        System.out.println("Number of third number:" + ThirdNumber[1]);

        ThirdNumber[2] = IntSplittedInitialNumbers[2]&mask3;
        System.out.println("Data of third number::" + ThirdNumber[2]);





    }


}
