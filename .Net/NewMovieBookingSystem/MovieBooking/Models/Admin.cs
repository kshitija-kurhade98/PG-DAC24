namespace MovieBooking.Models
{
    public class Admin
    {
        public string username { get; set; }
        public string password { get; set; }

        public Admin()
        {

        }

        public Admin(string username, string password)
        {
            this.username = username;
            this.password = password;
        }
    }
}
