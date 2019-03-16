package program.config;

import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import javax.sql.DataSource;

@Configuration
@PropertySource("application.properties")
public class DataConfig {
  @Autowired
  private Environment env;

  @Bean
  public LocalSessionFactoryBean sessionFactory() {
    Resource config = new ClassPathResource("hibernate.cfg.xml");
    LocalSessionFactoryBean sessionFactoryBean = new LocalSessionFactoryBean();
    sessionFactoryBean.setConfigLocation(config);
    sessionFactoryBean.setPackagesToScan(env.getProperty("projekt.entity.package"));
    sessionFactoryBean.setDataSource(dataSource());
    return sessionFactoryBean;
  }

  @Bean
  public DataSource dataSource() {
    BasicDataSource ds = new BasicDataSource();
    ds.setDriverClassName(env.getProperty("projekt.db.driver"));
    ds.setUrl(env.getProperty("projekt.db.url"));
    ds.setUsername(env.getProperty("projekt.db.username"));
    ds.setPassword(env.getProperty("projekt.db.password"));
    return ds;
  }
}
