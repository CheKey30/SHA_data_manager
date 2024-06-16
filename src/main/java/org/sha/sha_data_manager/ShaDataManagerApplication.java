package org.sha.sha_data_manager;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("org.sha.sha_data_manager.dao")
@SpringBootApplication
public class ShaDataManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShaDataManagerApplication.class, args);
    }

}
