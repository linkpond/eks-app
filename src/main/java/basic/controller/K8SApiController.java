package basic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class K8SApiController {
	
	@GetMapping(value = "/api/status")
	public String k8sApiTest() {
		log.info("k8sApiTest success");
		return "Status - k8s-app";
	}
	
	@GetMapping(value = "/api/status01")
	public String eksApiTest() {
		return "Status - eks-app";
	}
	
	@GetMapping(value = "/api/status02")
	public String eksApiTestPrivate() {
		return "Status - eks-app-private-test-2025/02/04";
	}
	
	@GetMapping(value = "/api/status03")
	public String eksApiTestActuator() {
		return "Status - eks-app-actuator-test-2025/02/04 13:43";
	}
}