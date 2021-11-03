package com.example.oauth2server.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.InMemoryTokenStore;
import org.springframework.security.oauth2.provider.token.store.redis.RedisTokenStore;

/**
 * Created by BobZhang on 2021/11/3
 */
@Configuration
public class TokenStoreConfig {

//    @Autowired
//    private RedisConnectionFactory redisConnectionFactory;

    //TODO 正式环境可以用RedisTokenStore
    @Bean
    public TokenStore tokenStore(){
        InMemoryTokenStore tokenStore = new InMemoryTokenStore();
        tokenStore.setFlushInterval(3600*12);
        return tokenStore;
//        return new RedisTokenStore(redisConnectionFactory);
    }

}
