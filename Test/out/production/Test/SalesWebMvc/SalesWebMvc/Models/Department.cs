﻿using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Threading.Tasks;

namespace SalesWebMvc.Models
{
    public class Department
    {
        public int Id { get; set; }
        
        [Display(Name = "Name")]
        public string Nome { get; set; }
        public ICollection<Seller> Sellers { get; set; } = new List<Seller>();
        public ICollection<Product> Products { get; set; } = new List<Product>();

        public Department()
        { 
        }

        public Department(int id, string nome)
        {
            Id = id;
            Nome = nome;
        }

        public void AddSeller (Seller seller)
        {
            Sellers.Add(seller);
        }
        
        public void AddProduct (Product product)
        {
            Products.Add(product);
        }

        public double TotalSales (DateTime initial, DateTime final)
        {
            return Products.Sum(x => x.TotalSales(initial, final));
        }
    }
}
