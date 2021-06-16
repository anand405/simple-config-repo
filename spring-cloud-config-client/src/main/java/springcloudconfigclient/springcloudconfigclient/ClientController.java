package springcloudconfigclient.springcloudconfigclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

	@Autowired
	private EnvConfiguration configuration;
	
	@GetMapping(value="/limits",produces = "application/json")
	public  EnvConfiguration retriveConfigValues() {
		return  configuration;
	}
}
