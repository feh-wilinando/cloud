package br.com.domineospring.cloud.turbine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * Created by nando on 26/05/17.
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableTurbine
@EnableHystrix
@EnableHystrixDashboard
public class TurbineBoot {


    public static void main(String[] args) {
        SpringApplication.run(TurbineBoot.class, args);
    }

//	@Bean
//	public TurbineProperties turbineProperties() {
//		return new TurbineProperties();
//	}
//
//	@Bean
//	public InstanceDiscovery instanceDiscovery() {
//		return new ConfigPropertyBasedDiscovery();
//	}

}
