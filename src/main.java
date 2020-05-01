public class main {
    public static void main(String[] args) {

        //instance
        car player1 = new car();
        car player2 = new car();
        car player3 = new car();
        car player4 = new car();

        player1.username = "Ruddy";
        player1.namecar = "lamborghini";
        player1.score = 5000;
        player1.fuelCapacity = 2;
        player1.maxSpeed= 8000;
        player2.username = "Randy";
        player2.namecar = "Ferary";
        player2.score = 3000;
        player2.fuelCapacity = 4;
        player2.maxSpeed= 5000;

        player1.carplay();
        System.out.println(player1.username);
        System.out.println(player1.namecar);
        System.out.println(player1.score);
        System.out.println(player1.fuelCapacity);
        System.out.println(player1.maxSpeed);
        player1.carfinish();
        System.out.println("                    ");
        player2.carplay();
        System.out.println(player2.username);
        System.out.println(player2.namecar);
        System.out.println(player2.score);
        System.out.println(player2.fuelCapacity);
        System.out.println(player2.maxSpeed);
        player1.carothers(player3);
        player1.carothers(player4);
        ;

    }
}

