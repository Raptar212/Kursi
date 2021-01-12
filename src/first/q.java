package first;

import java.util.Scanner;

public class q {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            System.out.println("Enter array length: ");
            int N = in.nextInt();

            int[] n = new int[N];

            int identicalNumbersCounter = 0;
            int identicalNumbersStart   = 0;
            int identicalNumbersEnd     = 0;
            int identicalNumber         = 0;

            int newIdenticalNumbersStart = 0;

            System.out.println("Enter array numbers: ");

            for (int i = 0; i < N; i++) {
                System.out.print("n["+i+"]: ");
                n[i] = in.nextInt();
                if (i != 0 && n[i] != n[i-1]) {
                    if (i != 1 && (((i - newIdenticalNumbersStart + 1) == identicalNumbersCounter && (identicalNumber < n[i-1])) || (i - newIdenticalNumbersStart + 1) > identicalNumbersCounter)) {
                        identicalNumbersStart    = newIdenticalNumbersStart;
                        identicalNumbersEnd      = i - 1;
                        identicalNumbersCounter  = identicalNumbersEnd - identicalNumbersStart + 1;
                        identicalNumber          = n[i-1];
                        newIdenticalNumbersStart = i;
                    } else {
                        newIdenticalNumbersStart = i;
                    }
                } else if (i != 1 && (i == N - 1) && (((i - newIdenticalNumbersStart + 1) == identicalNumbersCounter && (identicalNumber < n[i])) || (i - newIdenticalNumbersStart + 1) > identicalNumbersCounter)) {
                    identicalNumbersStart   = newIdenticalNumbersStart;
                    identicalNumbersEnd     = i;
                    identicalNumbersCounter = identicalNumbersEnd - identicalNumbersStart + 1;
                    identicalNumber         = n[i];
                }
            }

            System.out.print("\n\n| ");
            for (int i = 0; i < N; i++) { //
                System.out.print(n[i] + " | ");
            }

            if (identicalNumbersCounter == 0 || identicalNumbersEnd == 0)
                System.out.print("\n\nNo identical numbers found." + identicalNumbersEnd); //                                          = 0
            else {
                System.out.print("\n\nStart:  " + identicalNumbersStart + "\nEnd:    " + identicalNumbersEnd + "\nLength: " + identicalNumbersCounter + "\nNumber: " + identicalNumber + "\n\n| ");
                for (int i = identicalNumbersStart; i <= identicalNumbersEnd; i++) {
                    System.out.print("n["+ i +"]: " + n[i] + " | ");
                }
            }

            in.close();
        }
    }


