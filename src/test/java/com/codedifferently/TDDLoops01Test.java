package com.codedifferently;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TDDLoops01Test {
    @Test
    public void oneToTenTest() {
        //: Given
        TDDLoops01 numbers = new TDDLoops01();
        String expected = "oneToTen()\n*** Output ***\n1\n2\n3\n4\n5\n6\n7\n8\n9\n10";

        //: When
        String actual = numbers.oneToTen();

        //: Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void oddNumbersTest() {
        //: Given
        TDDLoops01 numbers = new TDDLoops01();
        String expected = "oddNumbers()\n*** Output ***\n1\n3\n5\n7\n9\n11\n13\n15\n17\n19";
        //: When

        String actual = numbers.oddNumbers();
        //: Then

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void squaresTest() {
        //: Given
        TDDLoops01 numbers = new TDDLoops01();
        String expected = "squares()\n*** Output ***\n1\n4\n9\n16\n25\n36\n49\n64\n81\n100\n121\n144\n169\n196\n225\n" +
                "256\n289\n324\n361\n400\n441\n484\n529\n576\n625";
        //: When
        String actual = numbers.squares();

        //: Then
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void evenTest() {
        //: Given
        TDDLoops01 numbers = new TDDLoops01();
        String expected = "even()\n*** Output ***\n2\n4\n6\n8";
        //: When
        String actual = numbers.even(8);
        //: Then
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void powersTest() {
        //: Given
        TDDLoops01 numbers = new TDDLoops01();
        String expected = "squares()\n*** Output ***\n1\n4\n9\n16\n25\n36\n49\n64\n81\n100\n121\n144\n169\n196\n225\n" +
                "256\n289\n324\n361\n400\n441\n484\n529\n576\n625\n" + (int) Math.pow(26, 2) + "\n" + (int) Math.pow(27, 2) + "\n" +
                (int) Math.pow(28, 2) + "\n" + (int) Math.pow(29, 2) + "\n" + (int) Math.pow(30, 2) + "\n" + (int) Math.pow(31, 2) + "\n" +
                (int) Math.pow(32, 2) + "\n" + (int) Math.pow(33, 2) + "\n" + (int) Math.pow(34, 2) + "\n" + (int) Math.pow(35, 2) + "\n" + (int) Math.pow(36, 2) + "\n" +
                (int) Math.pow(37, 2) + "\n" + (int) Math.pow(38, 2) + "\n" + (int) Math.pow(39, 2) + "\n" + (int) Math.pow(40, 2) + "\n" + (int) Math.pow(41, 2) + "\n" + (int) Math.pow(42, 2) + "\n"
                + (int) Math.pow(43, 2) + "\n" + (int) Math.pow(44, 2) + "\n" + (int) Math.pow(45, 2) + "\n" + (int) Math.pow(46, 2) + "\n" + (int) Math.pow(47, 2)
                + "\n" + (int) Math.pow(48, 2) + "\n" + (int) Math.pow(49, 2) + "\n" + (int) Math.pow(50, 2) + "\n" + (int) Math.pow(51, 2) + "\n" + (int) Math.pow(52, 2) + "\n" + (int) Math.pow(53, 2)
                + "\n" + (int) Math.pow(54, 2) + "\n" + (int) Math.pow(55, 2) + "\n" + (int) Math.pow(56, 2) + "\n" + (int) Math.pow(57, 2) + "\n" + (int) Math.pow(58, 2) + "\n" + (int) Math.pow(59, 2)
                + "\n" + (int) Math.pow(60, 2) + "\n" + (int) Math.pow(61, 2) + "\n" + (int) Math.pow(62, 2) + "\n" + (int) Math.pow(63, 2) + "\n" + (int) Math.pow(64, 2) + "\n" + (int) Math.pow(65, 2) + "\n" + (int) Math.pow(66, 2)
                + "\n" + (int) Math.pow(67, 2) + "\n" + (int) Math.pow(68, 2) + "\n" + (int) Math.pow(69, 2) + "\n" + (int) Math.pow(70, 2) + "\n" + (int) Math.pow(71, 2)
                + "\n" + (int) Math.pow(72, 2) + "\n" + (int) Math.pow(73, 2) + "\n" + (int) Math.pow(74, 2) + "\n" + (int) Math.pow(75, 2) + "\n" +
                (int) Math.pow(76, 2) + "\n" + (int) Math.pow(77, 2) + "\n" + (int) Math.pow(78, 2) + "\n" + (int) Math.pow(79, 2) + "\n" + (int) Math.pow(80, 2)
                + "\n" + (int) Math.pow(81, 2) + "\n" + (int) Math.pow(82, 2) + "\n" + (int) Math.pow(83, 2) + "\n" + (int) Math.pow(84, 2) + "\n" + (int) Math.pow(85, 2)
                + "\n" + (int) Math.pow(86, 2) + "\n" + (int) Math.pow(87, 2) + "\n" + (int) Math.pow(88, 2) + "\n" + (int) Math.pow(89, 2)+ "\n" + (int) Math.pow(90, 2) + "\n" + (int) Math.pow(91, 2)+ "\n" + (int) Math.pow(92, 2) + "\n" + (int) Math.pow(93, 2)
                + "\n" + (int) Math.pow(94, 2) + "\n" + (int) Math.pow(95, 2) + "\n" + (int) Math.pow(96, 2) + "\n" + (int) Math.pow(97, 2) + "\n" + (int) Math.pow(98, 2)
                + "\n" + (int) Math.pow(99, 2) + "\n" + (int) Math.pow(100, 2);

        //: When
        String actual = numbers.powers(2);

        //: Then
        Assertions.assertEquals(expected, actual);
    }
}
