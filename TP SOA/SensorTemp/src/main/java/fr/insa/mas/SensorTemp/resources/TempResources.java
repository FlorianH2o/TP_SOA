package fr.insa.mas.SensorTemp.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.insa.mas.SensorTemp.model.*;


@RestController
@RequestMapping("/Temp")
public class TempResources {
	@GetMapping("/{idRoom}")
	public TempModel getTemp(@PathVariable("idRoom") int idRoom) {
	
		//simulate the DB with a list that contains the marks of 4 students whose id are 0,1,2,3
		List<TempModel> tempList=Arrays.asList( 
				new TempModel(0,12.3),
				new TempModel(1,18.2),
				new TempModel(2,22.8)
				);
				
		return tempList.get(idRoom);
	}
}
