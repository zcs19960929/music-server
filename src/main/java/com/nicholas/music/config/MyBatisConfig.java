package com.nicholas.music.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Description:
 * @date: 2022/01/09 16:31
 * @author:
 */

@Configuration
@MapperScan("org.example.admin.dal.mapper.*")
@MapperScan("com.nicholas.music.dao.mapper.*")
public class MyBatisConfig {

}