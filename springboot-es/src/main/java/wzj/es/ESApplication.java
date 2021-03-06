package wzj.es;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @ClassName ESApplication
 * @Description
 * @Author wzj
 * @Date 2020/12/13 16:18
 **/

/**
 SpringBoot默认支持两种方式和ES进行交互
 1、Jest(默认不生效)
 需要导入Jest的工具包(io.searchbox.client.JestClient)

 2、SpringData ElasticSearch【es版本可能不合适】
 如果版本不适配：升级springBoot版本或者安装对应版本的es
 1)、client节点信息clusterNode,clusterName
 2)、ElasticsearchTemplate操作es
 3)、编写一个ElasticsearchRepository的子接口来操作es
 两种用法: https://github.com/spring-projects/spring-data-elasticsearch
 1)、编写一个ElasticsearchRepository

 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class ESApplication {
    public static void main(String[] args) {
        SpringApplication.run(ESApplication.class);
    }
}
