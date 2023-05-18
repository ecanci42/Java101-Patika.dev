package Mayin_Tarlasi;

import java.util.Random;
import java.util.Scanner;

public class MineSweeper
{
    Scanner input = new Scanner(System.in);
    Random rndm = new Random();

    String[][] matRis;
    String[][] map;
    int line;
    int colum;
    int mineCount;

    public void run()
    {
        System.out.println("Mayın Tarlası Oyununa Hoşgeldiniz!");
        System.out.print("Satır numarası girin: ");
        line = input.nextInt();
        System.out.print("Sütun numarası girin: ");
        colum = input.nextInt();

        mineCount = (line * colum) / 4;

        map = new String[line][colum];
        matRis = new String[line][colum];

        for (int i = 0; i < line; i++)
        {
            for (int j = 0; j < colum; j++)
            {
                map[i][j] = "-";
                matRis[i][j] = "-";
            }
        }

        while (mineCount > 0)
        {
            int lineMine = rndm.nextInt(line);
            int columMine = rndm.nextInt(colum);

            if (map[lineMine][columMine].equals("-"))
            {
                map[lineMine][columMine] = "*";
                mineCount--;
            }
        }
        printMatris();
        playCheck();
    }

    public void playCheck()
    {
        boolean finish = false;
        while (!finish)
        {
            System.out.print("Satır sayısı: ");
            int selectLine = input.nextInt();
            System.out.print("Sütün sayısı: ");
            int selectColum = input.nextInt();

            int mineCount = 0;

            if (selectLine < line && selectColum < colum)
            {
                if (map[selectLine][selectColum].equals("-") && matRis[selectLine][selectColum].equals("-"))
                {
                    for (int i = selectLine-1; i < selectLine + 2; i++)
                    {
                        for (int j = selectColum-1; j < selectColum + 2; j++)
                        {
                            if (i>=0 && j>=0 && i<line && j<colum && map[i][j].equals("*"))
                            {
                                mineCount++;
                                matRis[selectLine][selectColum] = Integer.toString(mineCount);
                            }else
                                matRis[selectLine][selectColum] = Integer.toString(mineCount);
                        }
                    }
                    printMatris();
                    if (!chekWin())
                    {
                        System.out.println("Tebrikler! Oyunu Kazandın.");
                        printMap();
                        finish = true;
                    }
                } else if (map[selectLine][selectColum].equals("*"))
                {
                    System.out.println("Kaybettin!");
                    printMap();
                    finish = true;
                }else if (!matRis[selectLine][selectColum].equals("-"))
                    System.out.println("Bu hücreyi daha önce girdiniz, lütfen farklı bir hücre girin.");
            }else
                System.out.println("Oyun sınırları dışında seçim yaptınız.");
        }
    }

    public void printMap()
    {
        for (String[] line:map)
        {
            for (String colum: line)
                System.out.print(colum + " ");
            System.out.println();
        }
        System.out.println("=================");
    }

    public void printMatris()
    {
        for (String[] line:matRis)
        {
            for (String colum: line)
                System.out.print(colum + " ");
            System.out.println();
        }
        System.out.println("=================");
    }

    boolean chekWin()
    {
        int emptyCell=0;
        int minedCell=0;

        for (int i = 0; i < matRis.length; i++)
        {
            for (int j = 0; j < matRis[i].length; j++)
            {
                if (matRis[i][j].equals("-"))
                    emptyCell++;
                if (map[i][j].equals("*"))
                    minedCell++;
            }
        }
        if (emptyCell == minedCell)
            return false;
        return true;
    }
}
