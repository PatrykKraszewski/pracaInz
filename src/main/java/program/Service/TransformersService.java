package program.Service;

import java.util.List;
import program.model.Transformers;

public interface TransformersService {
  List<Transformers> findAll();
  Transformers findByName(String name);
  void save(Transformers transformer);
  void delete(Transformers transformer);
}
