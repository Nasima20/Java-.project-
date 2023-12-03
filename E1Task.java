package AllTask;

public class E1Task {
    public static void main(String[] args){
        int [] Tem = {87, 89, 54, 90, 80, 85, 76};


        int highestTemperature = Tem [0];
        int lowestTemperature = Tem [0];


        for (int temperature : Tem ) {
            if (temperature > highestTemperature) {
                highestTemperature = temperature;
            }

            if (temperature < lowestTemperature) {
                lowestTemperature = temperature;
            }
        }
        System.out.println("Highest temperature: " + highestTemperature);
        System.out.println("Lowest temperature: " + lowestTemperature);
    }
}




//Create a program that uses an array to store a list of temperatures for a week,
//and then uses a loop to find the highest and lowest temperature for the week./*
