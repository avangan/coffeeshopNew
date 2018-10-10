import java.util.*;
import java.lang.Math;

public class JavaApplication {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int custOrder, orderMIn, orderMax, age, minAge, maxAge, zip, zipCoffeeShop, attempts, minAttempts, maxAttempts, avgCustAge, ageTotal, countLoop, maxZip, attemptCount, attemptMax;
        
        attemptMax = 2;
        orderMax = 12;
        orderMIn = 1;
        ageTotal = 0;
        countLoop = 0;
        avgCustAge = 0;
        zipCoffeeShop = 54984;
        maxZip = 99999;
        int shopZipAccumulator, otherZipAccumulator;
        
        shopZipAccumulator = 0;
        otherZipAccumulator = 0;
        maxAge = 110;
        minAge = 10;
        System.out.println(" Welcome to our program to begin please enter a 5 digit zip code to exit please enter zero ");
        zip = input.nextInt();
        
        // If zip is not equal to zero enter the loop . If it is exit.
        while (zip != 0) {
            if (zip <= maxZip) {
                System.out.println(" Please enter customers Age ");
                age = input.nextInt();
                
                // We need to weed out the age with a condition. Here I am using the inverse if age is larger than max age or smaller than minimum age it's the inverse of what I am looking for but bring it thru into our program.
                while (age > maxAge || age < minAge) {
                    System.out.println(" You need to enter an age between 10 and 110 years. Please reenter customers Age ");
                    age = input.nextInt();
                }
                ageTotal = age + ageTotal;
                System.out.println(" Please enter customer order ");
                custOrder = input.nextInt();
                attemptCount = 0;
                while ((custOrder > orderMax || custOrder < orderMIn) && attemptCount < attemptMax) {
                    System.out.println(" Your order needs to be more than one item but not larger than twelve Please re-enter your order");
                    custOrder = input.nextInt();
                    attemptCount = attemptCount + 1;
                }
                if (custOrder < 0 && attemptCount == 2) {
                    System.out.println("You have error");
                } else {
                    System.out.println("Your order is " + custOrder + " your zip is " + zip);
                }
                if (zip == zipCoffeeShop) {
                    shopZipAccumulator = shopZipAccumulator + 1;
                } else {
                    otherZipAccumulator = otherZipAccumulator + 1;
                }
                countLoop = countLoop + 1;
                avgCustAge = (double) ageTotal / countLoop;
                if (age > 30) {
                    System.out.println("Customers over the age of 30 put in " + custOrder + " orders.");
                } else {
                    System.out.println("Customers under the age of 30 put in " + custOrder + " orders.");
                }
            } else {
                System.out.println(" Please enter a zip code that is less than 5 digits");
            }
            System.out.println("The total count for zip that are not the stores zip code is " + otherZipAccumulator + " the zipcodes that are a the same as the cofee shop is " + shopZipAccumulator);
            System.out.println("The customer average age is  " + avgCustAge);
            System.out.println(" To use the program again Please enter a 5 digit zip code to exit please enter zero ");
            zip = input.nextInt();
        }
        System.out.println("This concludes our program have a good day");
    }
}
