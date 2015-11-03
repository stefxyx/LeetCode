//Given an integer, convert it to a roman numeral.
//Input is guaranteed to be within the range from 1 to 3999.
package Leetcode;

/**
 *
 * @author yingxinxie
 */
public class IntegertoRoman {

  public String intToRoman(int num) {
    StringBuilder s = new StringBuilder();
    int digit = 1000;
    int cur = 0;
    while (digit > 0) {
      cur = num / digit;
      switch (digit) {
        case 1000:
          switch (cur) {
            case 0:
              break;
            case 1:
              s.append('M');
              break;
            case 2:
              s.append("MM");
              break;
            case 3:
              s.append("MMM");
          }
          break;
        case 100:
          switch (cur) {
            case 0:
              break;
            case 1:
              s.append('C');
              break;
            case 2:
              s.append("CC");
              break;
            case 3:
              s.append("CCC");
              break;
            case 4:
              s.append("CD");
              break;
            case 5:
              s.append('D');
              break;
            case 6:
              s.append("DC");
              break;
            case 7:
              s.append("DCC");
              break;
            case 8:
              s.append("DCCC");
              break;
            case 9:
              s.append("CM");
              break;
          }
          break;
        case 10:
          switch (cur) {
            case 0:
              break;
            case 1:
              s.append('X');
              break;
            case 2:
              s.append("XX");
              break;
            case 3:
              s.append("XXX");
              break;
            case 4:
              s.append("XL");
              break;
            case 5:
              s.append('L');
              break;
            case 6:
              s.append("LX");
              break;
            case 7:
              s.append("LXX");
              break;
            case 8:
              s.append("LXXX");
              break;
            case 9:
              s.append("XC");
              break;
          }
          break;
        case 1:
          switch (cur) {
            case 0:
              break;
            case 1:
              s.append('I');
              break;
            case 2:
              s.append("II");
              break;
            case 3:
              s.append("III");
              break;
            case 4:
              s.append("IV");
              break;
            case 5:
              s.append('V');
              break;
            case 6:
              s.append("VI");
              break;
            case 7:
              s.append("VII");
              break;
            case 8:
              s.append("VIII");
              break;
            case 9:
              s.append("IX");
              break;
          }
          break;
      }
      num = num % digit;
      digit = digit / 10;
    }
    return s.toString();
  }
}
