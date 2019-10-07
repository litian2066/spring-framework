package com.px;

import com.px.config.AppConfig;
import com.px.dao.IndexDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppContext {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(AppConfig.class);
		IndexDao dao = (IndexDao) context.getBean("indexDao");
		dao.query();
	}
}
