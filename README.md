# **FLIGHT TICKET**

# Information

* **Calculates discounted flight tickets by entering age and km information.**

# Technologies Used

* **JAVA**

# Contents

* perKM is defined with double because it is a decimal number.

* Scanner class is defined to get age, km and travel type information from the user.

* Discounts suitable for certain ages are reflected in the ticket price.

* Round-trip tickets are defined as 20% discount.

* No discount will be applied when age information is entered outside the specified ages.

<br />

```Java

        import java.util.Scanner;

        public class flightticket{

            public static void main(String[] args) {

            int km, age, trip;

            double perKm = 0.10, totalamount;


```

```Java

            Scanner input = new Scanner(System.in);

            System.out.print("Enter The Distance (KM) : ");

            km = input.nextInt();

            System.out.print("Enter The Age : ");

            age = input.nextInt();

            System.out.print("Choose Trip Type (1 = One Way Trip , 2 = Round Trip) : ");

            trip = input.nextInt();

            totalamount = km * perKm;

```
```Java

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
```

```bash

        Enter The Distance (KM) : 1500
        Enter The Age : 11
        Choose Trip Type (1 = One Way Trip , 2 = Round Trip) : 1
        Total Amount : 75.0 TL

```
```bash

        Enter The Distance (KM) : 1500
        Enter The Age : 11
        Choose Trip Type (1 = One Way Trip , 2 = Round Trip) : 2
        Total Amount :120.0 TL

```
```bash

        Enter The Distance (KM) : 1500
        Enter The Age : 13
        Choose Trip Type (1 = One Way Trip , 2 = Round Trip) : 1
        Total Amount :135.0 TL

```
```bash

        Enter The Distance (KM) : 1500
        Enter The Age : 24
        Choose Trip Type (1 = One Way Trip , 2 = Round Trip) : 2
        Total Amount :216.0 TL

```
```bash

        Enter The Distance (KM) : 1500
        Enter The Age : 70
        Choose Trip Type (1 = One Way Trip , 2 = Round Trip) : 1
        Total Amount :105.0 TL

```
```bash

        Enter The Distance (KM) : 1500
        Enter The Age : 70
        Choose Trip Type (1 = One Way Trip , 2 = Round Trip) : 2
        Total Amount :168.0 TL

```
```bash

        Enter The Distance (KM) : 1500
        Enter The Age : 25
        Choose Trip Type (1 = One Way Trip , 2 = Round Trip) : 1
        Total Amount :150.0 TL

```
```bash

        Enter The Distance (KM) : 1500
        Enter The Age : 25
        Choose Trip Type (1 = One Way Trip , 2 = Round Trip) : 2
        Total Amount :300.0 TL

```
```bash

        Enter The Distance (KM) : -1500
        Enter The Age : 20
        Choose Trip Type (1 = One Way Trip , 2 = Round Trip) : 1
        You Entered Wrong Data !

```

<br />

# LINK

* Click here https://github.com/Fogo9/FlightTicket.git to access the Github page for this project.

<br />

# LICENSE

* This software is licensed By Tuncay Demir under the MIT license.

<br />

>[Patika.dev](https://app.patika.dev/fogomurphy)

<br/>

| Name |  Email |
| ---- |  ----- |
| Tuncay | tuncaydemir682@gmail.com |
