import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

import static java.math.RoundingMode.HALF_UP;

public class Main
{
    public static void main(String[] args)
    {
        BigInteger californiaPop = new BigInteger("38041430");
        BigInteger texasPop = new BigInteger("26059203");
        BigInteger wiscPop = new BigInteger("5726398");

        BigDecimal firstPart = new BigDecimal(californiaPop).divide(new BigDecimal(wiscPop),2, HALF_UP);
        BigDecimal secondPart = new BigDecimal(texasPop).divide(firstPart,2, HALF_UP);
        BigDecimal price = secondPart.multiply(new BigDecimal(3.23)).setScale(2, HALF_UP);

        System.out.println("First part: " + firstPart);
        System.out.println("Second part: " + secondPart + " || $" + price);



    }


/*
Create a class that includes a main method that calculates how many letters everyone in Wisconsin would have to write
if they wrote everyone in California a letter and how many copies of those letters would have to be made for everyone in
Texas to have a copy.  Print the number of copies that would have to be made for Texas and how much it would cost at
$3.23 each to copy them.
 */




}
