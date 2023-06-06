/*
package com.javarush.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

*/
/*
Транзакционность
*//*


public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String firstFileName = null;
        String secondFileName = null;

        try {
            firstFileName = reader.readLine();
            secondFileName = reader.readLine();
            reader.close();

            BufferedReader fReader1 = new BufferedReader(new FileReader(firstFileName));
            String line;
            while ((line = reader.readLine()) != null) {
                allLines.add(line);
            }
            fReader1.close();

            BufferedReader fReader2 = new BufferedReader(new FileReader(secondFileName));
            while ((line = reader.readLine()) != null) {
                forRemoveLines.add(line);
            }
            fReader2.close();

            new Solution().joinData();

        } catch (Exception ignore) {
        }
    }

    public void joinData() throws IOException {

        if (allLines.containsAll(forRemoveLines)) {
            allLines.removeAll(forRemoveLines);
        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }

    }
}
*/

package com.javarush.task.task17.task1721;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = null;
        String fileName2 = null;
        try {
            fileName1 = reader.readLine();
            fileName2 = reader.readLine();
            reader.close();
            BufferedReader fReader1 = new BufferedReader(new FileReader(fileName1));
            String input;
            while ((input = fReader1.readLine()) != null)
                allLines.add(input);
            fReader1.close();
            BufferedReader fReader2 = new BufferedReader(new FileReader(fileName2));
            while ((input = fReader2.readLine()) != null)
                forRemoveLines.add(input);
            fReader2.close();
            new Solution().joinData();
        } catch (Exception ignore) {
        }

    }

    public void joinData() throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines))
            allLines.removeAll(forRemoveLines);
        else {
            allLines.clear();
            throw new CorruptedDataException();
        }

    }
}

