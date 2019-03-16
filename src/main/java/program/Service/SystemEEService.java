package program.Service;

import java.util.List;
import program.model.SystemEE;

public interface SystemEEService {
  List<SystemEE> findAll();
  SystemEE findByName(String name);
  void save(SystemEE system);
  void delete(SystemEE system);
}
