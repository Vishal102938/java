class BookTheatreSeats {
    int total_seats = 10;
    void book_seats(int seats)
    {
        if(total_seats>=seats){
            System.out.println("Seats books");
            total_seats = total_seats-seats;
            System.out.println("Seat_left"+total_seats);
        }
        else{
            System.out.println("seats can't booked");
            System.out.println("Seats_left-"+total_seats);
        }  
    }
}
class MovieBookApp extends Thread
{
    static BookTheatreSeats b;
    int seats;
    public void run()
    {

        b.book_seats(seats);
    }
    public static void main(String[] args) {
        b = new BookTheatreSeats();

        MovieBookApp deepak = new MovieBookApp();
        deepak.seats=7;
        deepak.start();
    }
}
