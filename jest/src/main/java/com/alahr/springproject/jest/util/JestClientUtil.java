package com.alahr.springproject.jest.util;

import com.google.gson.GsonBuilder;
import io.searchbox.client.JestClient;
import io.searchbox.client.JestClientFactory;
import io.searchbox.client.config.HttpClientConfig;

public class JestClientUtil {
    private static JestClient client;

    private static JestClient build(String serverUrl) {
        JestClientFactory factory = new JestClientFactory();
        factory.setHttpClientConfig(new HttpClientConfig
                .Builder(serverUrl)
                .gson(new GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ss").create())
                .defaultMaxTotalConnectionPerRoute(2)
                .maxTotalConnection(50)  //最大连接数
                .multiThreaded(true)    //设置为多线程
                .connTimeout(10000)     //设置连接超时
                .readTimeout(10000)     //设置读取超时
                .build());
        return factory.getObject();
    }

    public static synchronized JestClient getClient(String serverUrl) {
        if (client == null) {
            client = build(serverUrl);
        }
        return client;
    }
}
