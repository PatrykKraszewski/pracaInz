package program.dao;

import java.util.List;
import program.model.Transformators;

public interface TransformatorsDao {
  List<Transformators> findAll();
  Transformators findByName(String name);
  void save(Transformators transformator);
  void delete(Transformators transformator);
}
