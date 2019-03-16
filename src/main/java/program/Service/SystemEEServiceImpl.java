package program.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import program.dao.SystemEEDao;
import program.model.SystemEE;

@Service
public class SystemEEServiceImpl implements SystemEEService {
  @Autowired
  private SystemEEDao systemEEDao;

  @Override
  public List<SystemEE> findAll() {
    return systemEEDao.findAll();
  }

  @Override
  public SystemEE findByName(String name) {
    return systemEEDao.findByName(name);
  }

  @Override
  public void save(SystemEE system) {
    systemEEDao.save(system);

  }

  @Override
  public void delete(SystemEE system) {
    systemEEDao.delete(system);
  }
}
