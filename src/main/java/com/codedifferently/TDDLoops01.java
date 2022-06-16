package com.codedifferently;

public class TDDLoops01 {
    public String oneToTen() {
        String output = "oneToTen()\n"
                + "*** Output ***";
        for (int x = 1; x <= 10; x++) {
            output += "\n" + x;
        }
        return output;
    }

    public String oddNumbers() {
        String output = "oddNumbers()\n"
                + "*** Output ***";
        for (int x = 1; x < 20; x += 2) {
            output += "\n" + x;
        }

        return output;
    }

    public String squares() {
        String output = "squares()\n"
                + "*** Output ***";
        for (int i = 1; i <= 25; i++) {
            output += "\n" + (i * i);
        }
        return output;
    }// output numbers from one to 25 squared in the same format as above


    public String even(int n) {
        String output = "even()\n"
                + "*** Output ***";
        for (int i = 2; i <= n; i+=2) {
            output+="\n" + (i);
        }
        return output;
    }// take in the val

    // go through number of 1-100 and output all numbers to the value of n
    public String powers(int n) {
        String output = "squares()\n"
                + "*** Output ***";
        for (int i = 1; i <=100 ; i++) {
            output+= "\n" +(int) Math.pow(i,n);
        }
        return output;
    }

    public static void main(String[] args) {
        TDDLoops01 loops =new TDDLoops01();
        String output = loops.powers(2);;
        System.out.println(output);
    }
}