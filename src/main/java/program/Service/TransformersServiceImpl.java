package program.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import program.dao.TransformersDao;
import program.model.Transformers;

@Service
public class TransformersServiceImpl implements TransformersService {
  @Autowired
  private TransformersDao transformersDao;

  @Override
  public List<Transformers> findAll() {
    return transformersDao.findAll();
  }

  @Override
  public Transformers findByName(String name) {
    return transformersDao.findByName(name);
  }

  @Override
  public void save(Transformers transformer) {
      transformersDao.save(transformer);
  }

  @Override
  public void delete(Transformers transformer) {
      transformersDao.delete(transformer);
  }
}
