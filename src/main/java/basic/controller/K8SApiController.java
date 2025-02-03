package basic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class K8SApiController {
	
	@GetMapping(value = "/api/status")
	public String k8sApiTest() {
		return "Status - k8s-app";
	}

	@GetMapping(value = "/api/status01")
	public String eksApiTest() {
		return "Status - eks-app";
	}
}