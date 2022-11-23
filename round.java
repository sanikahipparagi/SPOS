import java.util.Scanner;

public class round {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int wtime[], btime[], rtime[], num, quantum, total;

        wtime = new int[10];
        btime = new int[10];
        rtime = new int[10];

        System.out.print("Enter number od process: ");
        num = s.nextInt();
        System.out.print("Enter Burst time: ");
        for (int i = 0; i < num; i++) {
            System.out.print("\n P[ " + (i + 1) + "]: ");
            btime[i] = s.nextInt();
            rtime[i] = btime[i];
            wtime[i] = 0;
        }

        System.out.print("\n\n Enter quantum: ");
        quantum = s.nextInt();
        int rp = num;
        int i = 0;
        int time = 0;
        System.out.print("0");
        wtime[0] = 0;
        while (rp != 0) {
            if (rtime[i] > quantum) {
                rtime[i] = rtime[i] - quantum;
                System.out.print("| P[" + (i + 1) + "] |");
                time += quantum;
                System.out.print(time);
            } else if (rtime[i] <= quantum && rtime[i] > 0) {
                time += rtime[i];
                rtime[i] = rtime[i] - rtime[i];
                System.out.print("| P[" + (i + 1) + "] |");
                rp--;
                System.out.print(time);
            }
            i++;
            if (i == num) {
                i = 0;
            }
        }

    }

}
