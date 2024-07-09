namespace MovieBooking.Models
{
    public class Movie
    {
        public int id { get; set; }
        public string? name { get; set; }
        public int rating { get; set; }
        public int price { get; set; }

        public Movie()
        {

        }
        public Movie(int id, string name, int rating, int price)
        {
            this.id = id;
            this.name = name;
            this.rating = rating;
            this.price = price;
        }
    }
}

