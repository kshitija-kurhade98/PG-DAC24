
using KiddohubMvc.Models;
namespace KiddohubMvc.Services

{
    public interface IProductService
    {
        List<Product> getAllProducts();
        List<Product> GetProduct(string name);

        bool insert(Product product);

        bool update(Product product);

        bool delete(int id);
        List<Product> SortProductsByName();

    }
}
