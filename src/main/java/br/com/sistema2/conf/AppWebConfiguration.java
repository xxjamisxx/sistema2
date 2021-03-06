package br.com.sistema2.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import br.com.sistema2.controllers.HomeControllers;
import br.com.sistema2.dao.BusinessDao;
import br.com.sistema2.models.Business;
import br.com.sistema2.threads.Tarefa;

@EnableWebMvc
@ComponentScan(basePackageClasses={HomeControllers.class,BusinessDao.class,Tarefa.class})
public class AppWebConfiguration extends WebMvcConfigurerAdapter {

	
	@Bean
	public InternalResourceViewResolver internalResourceViewResolver(){
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		return resolver;
	}
	
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}
	
	
	
	
}
