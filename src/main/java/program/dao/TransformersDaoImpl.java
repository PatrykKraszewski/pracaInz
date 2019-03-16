package program.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import program.model.Transformers;

@Repository
public class TransformersDaoImpl implements TransformersDao {
  @Autowired
  private SessionFactory sessionFactory;

  @Override
  @SuppressWarnings("unchecked")
  public List<Transformers> findAll() {
    // Open a session
    Session session = sessionFactory.openSession();

    // Get all transformators with a Hibernate criteria
    List<Transformers> transformators = session.createCriteria(Transformers.class).list();

    // Close the session
    session.close();

    return transformators;
  }

  @Override
  public Transformers findByName(String name) {
    // Open a session
    Session session = sessionFactory.openSession();

    // Get transformer with a specific name
    Transformers trasnformer = session.get(Transformers.class, name);

    // close the session
    session.close();

    return trasnformer;
  }

  @Override
  public void save(Transformers transformer) {
    // Open a session
    Session session = sessionFactory.openSession();

    // Begin a transcation
    session.beginTransaction();

    // Save the category
    session.saveOrUpdate(transformer);

    // Commit the transactaion
    session.getTransaction().commit();

    // Close the session
    session.close();

  }

  @Override
  public void delete(Transformers transformer) {
    // OPen a session
    Session session = sessionFactory.openSession();

    // Begin a transcation
    session.beginTransaction();

    // Save the category
    session.delete(transformer);

    // Commit the transactaion
    session.getTransaction().commit();

    // Close the session
    session.close();

  }
}
