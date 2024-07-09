using KiddohubMvc.Models;

namespace KiddohubMvc.Repository
{
    public interface IProductRepository
    {
        List<Product> getAllProducts();
        List<Product> GetProduct(string name);

        bool insert(Product product);

        bool update(Product product);

        bool delete(int id);
        List<Product> SortProductsByName();
    }
}
