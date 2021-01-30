package com.mashibing.springboot.controller.rest;

import com.mashibing.springboot.service.ITestService;
import org.apache.commons.lang3.RandomUtils;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mashibing.springboot.service.IRoleService;

/**
 * restful风格URI的controller
 * 只和用户交换JSON数据
 * @author Administrator
 *
 */

@RestController
@RequestMapping("/api/v1/test")
public class TestManagerRestController {
	
	@Reference(version = "1.0.0")
	IRoleService roleSrv;
	@Reference(version = "1.0.0",actives = 1)
	ITestService testSrv;
	  
	@RequestMapping("/role")
	public int permissionadd() {

		return testSrv.getPort();

		//insert into role_permission (role_id,permission_id) values (6,1)
		/*long startTime = System.currentTimeMillis();    //获取开始时间
		System.out.println("action--");
		int port=0;
		try {
			
			//port = testSrv.getPort(RandomUtils.nextInt() +" hehe");
			port = testSrv.getPort();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		long endTime = System.currentTimeMillis();    //获取结束时间

		System.out.println("程序运行时间：" + (endTime - startTime) + "ms");    //输出程序运行时间
		return port;*/
	}
	
	
}
