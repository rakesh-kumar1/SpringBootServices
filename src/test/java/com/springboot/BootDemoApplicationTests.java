package com.springboot;

import java.util.Collections;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.springboot.empmgmt.services.EmployeeService;

@RunWith(SpringRunner.class)
@SpringBootTest(
		webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,
		classes = BootDemoApplication.class
		)

@AutoConfigureMockMvc
public class BootDemoApplicationTests {

	
	
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	EmployeeService employeeService; 
	
		
	@Test
	public void contextLoads() throws Exception {
		
		Mockito.when(employeeService.getAllEmployee()).thenReturn(Collections.emptyList());
		
		MvcResult mvcResult =	mockMvc.perform(MockMvcRequestBuilders.get("/empmgmt/employees")
				.accept(MediaType.APPLICATION_JSON)).andReturn();
		System.out.println("Response is : "+mvcResult.getResponse());
		
		Mockito.verify(employeeService).getAllEmployee();
	}
	
}
