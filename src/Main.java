import Day6.Challenge1.Book;
import Day6.Challenge1.FictionBook;
import Day6.Challenge1.Library;
import Day6.Challenge1.NoFictionBook;
import Day6.Challenge2.Bike;
import Day6.Challenge2.Car;
import Day6.Challenge2.RentalAgency;
import Day6.Challenge2.Vehicule;
import Day7.challenge1.CDPlayer;
import Day7.challenge1.MP3Player;
import Day7.challenge1.MusicLibrary;
import Day7.challenge2.CheckingAccount;
import Day7.challenge2.SavingsAccount;
import Day7.challenge2.TransactionManager;
import Day7.challenge3.DrawingBoard;
import Day7.challenge3.Square;
import Day7.challenge3.Triangle;

public class Main {
    public static void main(String[] args) throws Exception {


        /******************** Challenge 1: Library System ********************/

      Book fictionBook = new FictionBook("Totle1","hafssa",150034);
      Book noFictionBook = new NoFictionBook("Totle2","safae",1548484);
      Book fictionBook1 = new FictionBook("Totle3","Zineb",559534);
      Book noFictionBook1 = new NoFictionBook("Totle4","Amal",64834);

      Library library = new Library();
      library.addbook(fictionBook);
      library.addbook(noFictionBook);
      library.addbook(fictionBook1);
      library.addbook(noFictionBook1);
      library.displayBooks();

      /******************** Challenge 2: Vehicle Rental System *******************/
      System.out.println();
      System.out.println("/************************  Challenge 2: Vehicle Rental System *************************/");
      System.out.println();
      Vehicule car = new Car("ca1","model1",20.56);
      Vehicule car1 = new Car("ca2","model2",2050.56);
      Vehicule bike = new Bike("bike1","model1",30.506);
      Vehicule bike1 = new Car("bike2","model2",300.56);

      RentalAgency rentalAgency = new RentalAgency();
      rentalAgency.addVehicule(car);
      rentalAgency.addVehicule(car1);
      rentalAgency.addVehicule(bike);
      rentalAgency.addVehicule(bike1);

      rentalAgency.rentedVehicule(car);

      rentalAgency.displayVehicules();

      /******************** Day 7  *******************/
      /******************** Challenge 1: Music Player System *******************/
      System.out.println();
      System.out.println("/************************  Challenge 1: Music Player System *************************/");
      System.out.println();

      CDPlayer cdPlayer = new CDPlayer();
      MP3Player mp3Player = new MP3Player();
      MusicLibrary musicLibrary = new MusicLibrary();

      System.out.println("/************************  CD PLAYER *************************/");
      cdPlayer.player();
      cdPlayer.pause();
      cdPlayer.stop();

      System.out.println("/************************  MP3 PLAYER *************************/");
      mp3Player.player();
      mp3Player.pause();
      mp3Player.stop();

      System.out.println("/************************  MUSIC LIBRARY *************************/");
      musicLibrary.player();
      musicLibrary.pause();
      musicLibrary.stop();



      System.out.println("/************************  challenge 2 day 7 *************************/");

      SavingsAccount savingsAccount = new SavingsAccount("h58d699",20000.5);
      CheckingAccount checkingAccount = new CheckingAccount("d55z15",0.00);

      TransactionManager transactionManager = new TransactionManager();
      transactionManager.addAcount(savingsAccount);
      transactionManager.addAcount(checkingAccount);



     // transactionManager.diposit(savingsAccount, 500);
     // transactionManager.withdrawal(checkingAccount, 300);
     // transactionManager.displayInfo(savingsAccount);
     // transactionManager.displayInfo(checkingAccount);

      transactionManager.displayInfoHistory();

      transactionManager.trasfert(savingsAccount,checkingAccount,20000.5);
      transactionManager.displayInfo(savingsAccount);
      transactionManager.displayInfo(checkingAccount);


      System.out.println("/************************  challenge 3 day 7 *************************/");

      DrawingBoard drawingBoard = new DrawingBoard();

      drawingBoard.addShape(new Triangle());
      drawingBoard.addShape(new Square());

      drawingBoard.displayAllShapes();
      drawingBoard.drawAllShapes();

    }

}