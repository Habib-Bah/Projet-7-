package com.oc.ws.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@ComponentScans(value = { @ComponentScan("com.oc.ws.dao"),
      @ComponentScan("com.oc.ws.service") })
public class AppConfig {

   @Bean
   public LocalEntityManagerFactoryBean geEntityManagerFactoryBean() {
      System.out.println("---->>>> geEntityManagerFactoryBean");
      LocalEntityManagerFactoryBean factoryBean = new LocalEntityManagerFactoryBean();
      factoryBean.setPersistenceUnitName("LOCAL_PERSISTENCE");

      System.out.println("----> return LOCAL_PERSISTENCE");
      return factoryBean;
   }

   @Bean
   public JpaTransactionManager geJpaTransactionManager() {
      System.out.println("---->>>> geJpaTransactionManager");
      JpaTransactionManager transactionManager = new JpaTransactionManager();
      transactionManager.setEntityManagerFactory(geEntityManagerFactoryBean().getObject());
      return transactionManager;
   }
}
