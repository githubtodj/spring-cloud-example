package com.xt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@SpringBootApplication
@EnableHystrixDashboard
@EnableTurbine
public class DashboardApplication {

	//多服务监控 http://localhost:8001/hystrix
	public static void main(String[] args) {
		SpringApplication.run(DashboardApplication.class, args);
	}
}
