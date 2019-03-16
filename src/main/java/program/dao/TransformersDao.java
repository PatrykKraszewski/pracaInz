package program.dao;

import java.util.List;
import program.model.Transformers;

public interface TransformersDao {
  List<Transformers> findAll();
  Transformers findByName(String name);
  void save(Transformers transformer);
  void delete(Transformers transformer);
}
