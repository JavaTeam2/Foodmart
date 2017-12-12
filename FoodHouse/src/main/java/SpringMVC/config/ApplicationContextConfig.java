package SpringMVC.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.env.Environment;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;
@Configuration
@ComponentScan("SpringMVC.*")
@EnableWebMvc
@EnableTransactionManagement
//Load to Environment.
@PropertySources({ @PropertySource("classpath:ds/datasource-cfg.properties") })
//@Import({SecurityConfig.class })
public class ApplicationContextConfig { 
  
	@Autowired
	private Environment env;
	
    @Bean(name = "viewResolver")
    public InternalResourceViewResolver getViewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/pages/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }
  
    @Bean(name = "dataSource")
    public DataSource getDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
  
        // See: datasouce-cfg.properties
        dataSource.setDriverClassName(env.getProperty("ds.database-driver"));
        dataSource.setUrl(env.getProperty("ds.url"));
        dataSource.setUsername(env.getProperty("ds.username"));
        dataSource.setPassword(env.getProperty("ds.password"));
  
        System.out.println("## getDataSource: " + dataSource);
  
        return dataSource;
    }
  
    @Bean(name = "sessionFactory")
    public SessionFactory sessionFactory() {
    	LocalSessionFactoryBuilder  sessionFactoryBuilder = new LocalSessionFactoryBuilder(getDataSource());
    	sessionFactoryBuilder.scanPackages(env.getProperty("entitymanager.packages.to.scan"));
    	sessionFactoryBuilder.addProperties(hibProperties());
        return sessionFactoryBuilder.buildSessionFactory();
    }
    
    private Properties hibProperties() {
        Properties properties = new Properties();
        properties.put("hibernate.dialect", env.getProperty("hibernate.dialect"));
        properties.put("hibernate.show_sql", env.getProperty("hibernate.show_sql"));
        return properties;  
    }
    
    @Bean(name = "transactionManager")
    public DataSourceTransactionManager getTransactionManager() {
        DataSourceTransactionManager txManager = new DataSourceTransactionManager();
  
        DataSource dataSource = this.getDataSource();
        txManager.setDataSource(dataSource);
  
        return txManager;
    }
}
