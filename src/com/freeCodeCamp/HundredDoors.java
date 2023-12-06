package com.freeCodeCamp;

public class HundredDoors {

    public static void main(String[] args) {

        int[] doors = new int[100];

        for(int i : doors) {
            // 0 is closed ; 1 is open
            doors[i]=0;
        }

        System.out.print("Pass " + 0 + " : " + "\t");
        print_doors(doors);

        do_passes(doors);
    }

    static void do_passes(int[] doors) {

        // 100 passes
        for(int i=1; i <= doors.length ; i++) {
            // For every ith pass
            for(int j=i-1; j < doors.length ; j+=i) {
                if (doors[j] == 1) {
                    doors[j] = 0;
                } else {
                    doors[j] = 1;
                }
            }
            System.out.print("Pass " + i + " : " + "\t");
            print_doors(doors);
        }
    }

    static void print_doors(int[] doors) {
        for (int door : doors) {
            System.out.print(door + " ");
        }
        System.out.println();
    }
}
