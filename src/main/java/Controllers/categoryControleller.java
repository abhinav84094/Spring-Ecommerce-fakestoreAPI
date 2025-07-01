package Controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/category")
public class categoryControleller {
	
	@GetMapping
	public String getCategory() {
		return "Electornics";
	}
	
	@GetMapping("/count")
	public int getCategoryCount() {
		return 5;
	}
	
	@DeleteMapping
	public String deleteCategory() {
		return "Deleted" ;
	}

}
