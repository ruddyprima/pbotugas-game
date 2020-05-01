public class car {


    String username;
    String namecar;
    int pocition;
    int score;
    int maxSpeed;
    int fuelCapacity;
    double Racingtime;

    void carplay(){
        System.out.println("brem brem brem");
    }
    void carfinish(){
        System.out.println("Im winner");
    }
    void carothers(car car){
        pocition = 1;
        maxSpeed += 5000;
        fuelCapacity = 4;
        score += 500;

    }
}
