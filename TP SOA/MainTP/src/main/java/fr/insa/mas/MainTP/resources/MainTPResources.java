package fr.insa.mas.MainTP.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import fr.insa.mas.MainTP.model.*;


@RestController
@RequestMapping("/Main")
public class MainTPResources {
	
	List<MainTPModel> roomList=Arrays.asList( 
			new MainTPModel(0,"GEI13",0.0,false),
			new MainTPModel(1,"GEI15",0.0,false),
			new MainTPModel(2,"GEI213",0.0,false)
			);
	
	@GetMapping("/{idRoom}")
	public MainTPModel getRoomStatus(@PathVariable("idRoom") int idRoom) {
	return roomList.get(idRoom);
	}
	
	@GetMapping("/Status")
	public List<MainTPModel> getAllRooms() {
	
		RestTemplate restTemplate = new RestTemplate();
		
		
		int i=0;
		while (i<roomList.size()) {
			TempModel temp=restTemplate.getForObject("http:localhost:8086/Temp/"+i, TempModel.class);
			HeatModel heat=restTemplate.getForObject("http:localhost:8087/Heat/"+i, HeatModel.class);
			
			MainTPModel newRoom=roomList.get(i);
			newRoom.setTemp(temp.getTemp());
			newRoom.setHeat(heat.isHeat());
			roomList.set(i,newRoom);
			i++;	
		}
		
		return roomList;
	}
	
	
}
