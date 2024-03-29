package _16_IO.thuchanh.max;

import TestSuongSuong.TestManh.Interrator;

import java.io.*;
import java.util.List;
import java.util.Scanner;

public class FindMaxValue {
    public static int findMax(List<Integer> numbers) {
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (max < numbers.get(i)) {
                max = numbers.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile("demo.txt");
        int maxValue = findMax(numbers);
        readAndWriteFile.writeFile("result.txt", maxValue);

    }
}
