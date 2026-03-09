package com.sky.config;

import com.sky.properties.AliOssProperties;
import com.sky.utils.AliOssUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class OssConfiguration {
    //把对象创建出来交给 spring 容器
    @Bean
    @ConditionalOnMissingBean //保证只有一个对象
    public AliOssUtil aliOssUtil(AliOssProperties aliOssProperties) {
        log.info("AliOssProperties:{开始创建阿里云文件上传工具对象}", aliOssProperties);
        return new AliOssUtil(aliOssProperties.getEndpoint(),
                aliOssProperties.getAccessKeyId(),
                aliOssProperties.getAccessKeySecret(),
                aliOssProperties.getBucketName());
    };

}
