package com.klu.skill3;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

    public static void main(String[] args) {

        Configuration config = new Configuration();
        config.configure("hibernate.cfg.xml");

        SessionFactory factory = config.buildSessionFactory();
        Session session = factory.openSession();

        /* ================= INSERT ================= */
        Transaction tx = session.beginTransaction();

        Product p = new Product();
        p.setId(111);
        p.setName("Laptop");
        p.setCategory("Electronics");
        p.setPrice(55000);
        p.setQuantity(10);

        session.persist(p);
        tx.commit();
        System.out.println("Product Inserted Successfully");

        /* ================= RETRIEVE ================= */
        /*Product p1 = session.find(Product.class, 111);
        if (p1 != null)
            System.out.println("Retrieved: " + p1.getName());

        /* ================= UPDATE ================= */
        /*Transaction tx2 = session.beginTransaction();
        p1.setPrice(52000);
        p1.setQuantity(12);
        tx2.commit();
        System.out.println("Product Updated Successfully");

        /* ================= DELETE ================= */
       /* Transaction tx3 = session.beginTransaction();
        Product p3 = session.find(Product.class, 105);
        if (p3 != null)
            session.remove(p3);
        tx3.commit();
        System.out.println("Delete Operation Completed");

        /* ================= ORDER BY ================= */
        /*List<Product> ascList =
                session.createQuery("FROM Product p ORDER BY p.name ASC", Product.class).list();

        System.out.println("Ascending Order:");
        for (Product pr : ascList) {
            System.out.println(pr.getId() + " " + pr.getName());
        }

        /* ================= PAGINATION ================= */
        /*Query<Product> query =
                session.createQuery("FROM Product", Product.class);
        query.setFirstResult(0);
        query.setMaxResults(3);

        System.out.println("First 3 Products:");
        for (Product pr : query.list()) {
            System.out.println(pr.getName());
        }

        /* ================= AGGREGATE FUNCTIONS ================= */
        /*Long total =
                session.createQuery("select count(p.id) from Product p", Long.class)
                        .uniqueResult();
        System.out.println("Total Products: " + total);

        Object[] minMax =
                session.createQuery("select min(p.price), max(p.price) from Product p",
                        Object[].class).uniqueResult();

        System.out.println("Min Price: " + minMax[0]);
        System.out.println("Max Price: " + minMax[1]);

        /* ================= GROUP BY ================= */
       /* List<Object[]> groupList =
                session.createQuery(
                        "select p.category, count(p.id) from Product p group by p.category",
                        Object[].class).list();

        for (Object[] row : groupList) {
            System.out.println("Category: " + row[0] + " Count: " + row[1]);
        }

        /* ================= LIKE ================= */
        /*List<Product> likeList =
                session.createQuery(
                        "from Product p where p.name like 'L%'", Product.class).list();

        for (Product pr : likeList) {
            System.out.println("Starts with L: " + pr.getName());
        }
*/
        factory.close();
        session.close();
    }
}
