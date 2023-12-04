﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.EntityFrameworkCore;

namespace SalesWebMvc.Models
{
    public class SalesWebMvcContext : DbContext
    {
        public SalesWebMvcContext (DbContextOptions<SalesWebMvcContext> options)
            : base(options)
        {
        }

        public DbSet<Department> Departamento { get; set; }
        public DbSet<Seller> Seller { get; set; }
        public DbSet<Product> Product { get; set; }
        public DbSet<SalesRecord> SalesRecord { get; set; }

    }
}
