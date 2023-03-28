package com.ait.main.Runner;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.ait.main.Entity.CustomerEntity;
import com.ait.main.Entity.OrderEntity;
import com.ait.main.Repository.CustomerEntityRepo;

@Component
public class MyRunner implements ApplicationRunner {

	@Autowired
      CustomerEntityRepo csrepo;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		CustomerEntity entity= new CustomerEntity();
		entity.setId(101);entity.setName("Ajay");

		 OrderEntity or1= new OrderEntity();
		 or1.setId(1);or1.setOrderdate(LocalDate.of(2022, 03, 01));or1.setStatus("Pendig");
		 OrderEntity or2= new OrderEntity();
		 or2.setId(2);or2.setOrderdate(LocalDate.of(2022, 03, 04));or2.setStatus("Assigned");
		 OrderEntity or3= new OrderEntity();
		 or3.setId(3);or3.setOrderdate(LocalDate.of(2022, 03, 03));or3.setStatus("on the way");
		 OrderEntity or4= new OrderEntity();
		 or4.setId(4);or4.setOrderdate(LocalDate.of(2022, 03, 02));or4.setStatus("Delivered");
		 
		 List<OrderEntity>lst= new ArrayList<OrderEntity>();
		 lst.add(or1);lst.add(or2);lst.add(or3);lst.add(or4);
		entity.setLstorders(lst);
          	csrepo.save(entity);
		
		Optional <CustomerEntity> opt=csrepo.findById(101);
		
		
		
		 
		 
		 
		 
              
	}

}
