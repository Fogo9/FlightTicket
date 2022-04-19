import java.util.Scanner;

public class flightticket{
    public static void main(String[] args) {

        int km, age, trip;

        double perKm = 0.10, totalamount;


        Scanner input = new Scanner(System.in);

        System.out.print("Enter The Distance (KM) : ");

        km = input.nextInt();

        System.out.print("Enter The Age : ");

        age = input.nextInt();

        System.out.print("Choose Trip Type (1 = One Way Trip , 2 = Round Trip) : ");

        trip = input.nextInt();

        totalamount = km * perKm;


        if((km > 0 && age > 0) && (trip == 1 || trip == 2)){

            if(age < 12){

                if(trip == 1){

                    totalamount -= totalamount * 0.5;

                    System.out.print("Total Amount : " + totalamount + " TL ");

                }else{

                    totalamount -= totalamount * 0.5;
                    totalamount -= totalamount * 0.2;
                    totalamount *= 2;

                    System.out.print("Total Amount :" + totalamount + " TL ");

                }

            }else if(age >= 12 && age <= 24){

                if(trip == 1){

                    totalamount -= totalamount * 0.1;

                    System.out.print("Total Amount :" + totalamount + " TL ");

                } else {

                    totalamount -= totalamount * 0.1;
                    totalamount -= totalamount * 0.2;
                    totalamount *= 2;

                    System.out.print("Total Amount :" + totalamount + " TL ");

                }

            }else if(age > 65){

                if(trip == 1){

                    totalamount -= totalamount * 0.3;

                    System.out.print("Total Amount :" + totalamount + " TL ");

                }else{

                    totalamount -= totalamount * 0.3;
                    totalamount -= totalamount * 0.2;
                    totalamount *= 2;

                    System.out.print("Total Amount :" + totalamount + " TL ");

                }

            }else{

                if(trip == 1){

                    System.out.print("Total Amount :" + totalamount + " TL ");

                }else{

                    totalamount *= 2;

                    System.out.print("Total Amount :" + totalamount + " TL ");

                }
            }
        }else{

            System.out.println("You Entered Wrong Data !");
        }
    }
}
