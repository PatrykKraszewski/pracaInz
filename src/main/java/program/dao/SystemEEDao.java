package program.dao;

import java.util.List;
import program.model.SystemEE;

public interface SystemEEDao {
  List<SystemEE> findAll();
  SystemEE findByName(String name);
  void save(SystemEE system);
  void delete(SystemEE system);
}
