using KiddohubMvc.Models;
using KiddohubMvc.Repository;

namespace KiddohubMvc.Services
{
    public class ProductService : IProductService
    {
        public bool delete(int id)
        {
            return ProductRepository.delete(id);
        }

        public List<Product> getAllProducts()
        {
            return ProductRepository.getAllProducts();

        }

        public List<Product> GetProduct(string name)
        {
            return ProductRepository.GetProduct(name);
        }

        public bool insert(Product product)
        {
            return ProductRepository.insert(product);   
        }

        public bool update(Product product)
        {

            return ProductRepository.update(product);
        }
       public List<Product> SortProductsByName()
        {
            return ProductRepository.SortProductsByName();
        }
    }
}
