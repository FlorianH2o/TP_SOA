package fr.insa.mas.HeatManagement.resources;


import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.insa.mas.HeatManagement.model.*;



@RestController
@RequestMapping("/Heat")
public class HeatResources {
	@GetMapping("/{idRoom}")
	public HeatModel getHeat(@PathVariable("idRoom") int idRoom) {
	
		
		List<HeatModel> heatList=Arrays.asList( 
				new HeatModel(0,false),
				new HeatModel(1,false),
				new HeatModel(2,false)
				);
				
		return heatList.get(idRoom);
	}
}
