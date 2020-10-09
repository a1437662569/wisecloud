#服务调用者：
    Openfeign接口404
    No qualifying bean of type 'org.springframework.boot.autoconfigure.http.HttpMessageConverters'
#解决：
    #手动导入
    @Bean
    @ConditionalOnMissingBean
    public HttpMessageConverters messageConverters(ObjectProvider<HttpMessageConverter<?>> converters) {
        return new HttpMessageConverters(converters.orderedStream().collect(Collectors.toList()));
    }