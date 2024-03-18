package firstlevelcache.chache1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class App 
{
    public static void main( String[] args )
    {
     // Obtain a Hibernate SessionFactory
        SessionFactory factory = HibernateUtil.getSessionFactory();
        // Open a new session
        Session session = factory.openSession();
        // Begin a transaction
        Transaction t = session.beginTransaction();
    User user=new User();
    user.setName("navya");
    
    
    session.save(user);
    try {
        // Load an entity from the database using session.load
        User user1 = session.load(User.class, 1);
        System.out.println("First retrieval: " + user1);
        
        // Load the same entity again
        User userAgain = session.load(User.class, 1);
        System.out.println("Second retrieval: " + userAgain);
        
        // Modify the entity
        user.setName("Updated Name");
        
        // Commit the transaction
        t.commit();
    } catch (Exception e) {
        // Rollback transaction if there's an exception
        if (t != null) {
            t.rollback();
        }
        e.printStackTrace();
    } finally {
        // Close the session and session factory
        session.close();
       factory.close();
    }
}
  
    }





