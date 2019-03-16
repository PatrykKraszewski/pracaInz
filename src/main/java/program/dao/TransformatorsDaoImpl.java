package program.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import program.model.Transformators;

@Repository
public class TransformatorsDaoImpl implements TransformatorsDao {
  @Autowired
  private SessionFactory sessionFactory;

  @Override
  @SuppressWarnings("unchecked")
  public List<Transformators> findAll() {
    // Open a session
    Session session = sessionFactory.openSession();

    // Get all transformators with a Hibernate criteria
    List<Transformators> transformators = session.createCriteria(Transformators.class).list();

    // Close the session
    session.close();

    return transformators;
  }

  @Override
  public Transformators findByName(String name) {
    // Open a session
    Session session = sessionFactory.openSession();

    // Get transformer with a specific name
    Transformators trasnformer = session.get(Transformators.class, name);

    // close the session
    session.close();

    return trasnformer;
  }

  @Override
  public void save(Transformators transformator) {
    // Open a session
    Session session = sessionFactory.openSession();

    // Begin a transcation
    session.beginTransaction();

    // Save the category
    session.saveOrUpdate(transformator);

    // Commit the transactaion
    session.getTransaction().commit();

    // Close the session
    session.close();

  }

  @Override
  public void delete(Transformators transformator) {
    // OPen a session
    Session session = sessionFactory.openSession();

    // Begin a transcation
    session.beginTransaction();

    // Save the category
    session.delete(transformator);

    // Commit the transactaion
    session.getTransaction().commit();

    // Close the session
    session.close();

  }
}
