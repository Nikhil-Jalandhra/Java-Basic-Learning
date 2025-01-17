import java.util.Scanner;

public class recursionHanoi {

    public static void towerofHanoi(int disk, String src, String help, String desti){
        if (disk == 1) {
        System.out.println("Transfer disk " + disk + " from " + src + " to " + desti);
        return ;
        }
        towerofHanoi(disk-1, src, desti, help);
        System.out.println("Transfer disk " + disk + " from " + src + " to " + desti);
        towerofHanoi(disk-1, help, src, desti);
    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

            // Using recursion method, this function solve tower of hanoi problem
            // if n number of disks are there.
            
            System.out.println("Enter nummber of disk you have");
            int Disk = sc.nextInt();
            towerofHanoi(Disk, "source", "helper", "destination");
        }
    }
}
