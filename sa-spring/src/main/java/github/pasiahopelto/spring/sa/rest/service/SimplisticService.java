package github.pasiahopelto.spring.sa.rest.service;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.collect.Lists;

import github.pasiahopelto.spring.sa.rest.Simplistic;

@RestController
public class SimplisticService {

	public SimplisticService() {
		System.out.println("SimplisticService.SimplisticService()");
	}
	
	@GetMapping("/simplistics")
	public List<Simplistic> getSimplistics() {
		return Lists.newArrayList(makeSimplistic(10, "ten"), makeSimplistic(20, "twenty"));
	}

	@PostMapping("/add")
	public void postSimplistics(@ModelAttribute String id, @ModelAttribute String name) {
		System.out.println("POST: " + id + " " + name);
	}

	private Simplistic makeSimplistic(int id, String name) {
		Simplistic result = new Simplistic();
		result.setId(id);
		result.setName(name);
		return result;
	}
	
}
