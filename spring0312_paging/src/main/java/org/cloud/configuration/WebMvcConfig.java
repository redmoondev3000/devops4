package org.cloud.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // AWS 서버 연계 시 이 경로는 나중에 리눅스 경로로 수정될 예정입니다.
        registry.addResourceHandler("/upload/**")
                .addResourceLocations("file:///C:/upload/")
                .setCachePeriod(3600);
    }

    // [수정] 컨트롤러의 @CrossOrigin과 충돌을 피하기 위해 
    // 전역 CORS 설정인 addCorsMappings는 여기서 제거하거나 주석 처리합니다.
}