package com.sortingData;

public class Main {

    public String returnString(double stay) throws ParkingExceptionHandler {


        String charge;

        if((stay > 0) || (stay < 24)){
            throw new ParkingExceptionHandler("Incorrect values entered");
        }else{
            if((stay >= 3){
                charge ="3 euro";
            }else if(stay >=4){
                charge = "3.50 euro";
            }else if(stay >=5){
                charge = "4 euro";
            }else if(stay >=6){
                charge = "4.50 euro";
            }else if(stay >=7){
                charge = "5 euro";
            }else if(stay >=8){
                charge = "5.50 euro";
            }else if(stay >=9){
                charge = "6 euro";
            }else if(stay >=10){
                charge = "6.50 euro";
            }else if(stay >=11){
                charge = "7 euro";
            }else if(stay >=12){
                charge = "7.50 euro";
            }else if(stay >=13){
                charge = "8 euro";
            }else if(stay >=14){
                charge = "8.50 euro";
            }else if(stay >=15){
                charge = "9 euro";
            }else if(stay >=16){
                charge = "9.50 euro";
            }else if(stay >=17){
                charge = "10 euro";
            }else if(stay >=18){
                charge = "10.50 euro";
            }else if(stay >=19){
                charge = "11 euro";
            }else if(stay >=20){
                charge = "11.50 euro";
            }else if(stay >=21){
                charge = "12 euro";
            }else if(stay >=22){
                charge = "12.50 euro";
            }else if(stay >=23){
                charge = "13 euro";
            }else {
                charge = "13.50 euro";
            }
            return charge;
        }


    }
}
