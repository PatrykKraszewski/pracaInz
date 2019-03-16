package program.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import program.model.SystemEE;
import program.model.Transformers;

@Repository
public class SystemEEDaoImpl implements SystemEEDao {
  @Autowired
  private SessionFactory sessionFactory;

  @Override
  @SuppressWarnings("unchecked")
  public List<SystemEE> findAll() {
    // Open a session
    Session session = sessionFactory.openSession();

    // Get all transformators with a Hibernate criteria
    List<SystemEE> systems = session.createCriteria(Transformers.class).list();

    // Close the session
    session.close();

    return systems;
  }


  @Override
  public SystemEE findByName(String name) {
    // Open a session
    Session session = sessionFactory.openSession();

    // Get transformer with a specific name
    SystemEE system = session.get(SystemEE.class, name);

    // close the session
    session.close();

    return system;
  }

  @Override
  public void save(SystemEE system) {
    // Open a session
    Session session = sessionFactory.openSession();

    // Begin a transcation
    session.beginTransaction();

    // Save the category
    session.saveOrUpdate(system);

    // Commit the transactaion
    session.getTransaction().commit();

    // Close the session
    session.close();

  }

  @Override
  public void delete(SystemEE system) {
    // OPen a session
    Session session = sessionFactory.openSession();

    // Begin a transcation
    session.beginTransaction();

    // Save the category
    session.delete(system);

    // Commit the transactaion
    session.getTransaction().commit();

    // Close the session
    session.close();

  }
}
