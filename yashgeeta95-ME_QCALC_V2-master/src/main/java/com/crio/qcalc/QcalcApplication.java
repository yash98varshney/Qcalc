package com.crio.qcalc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QcalcApplication {

	public static void main(String[] args) {
		SpringApplication.run(QcalcApplication.class, args);
		//StandardCalculator calc=new StandardCalculator();
		//calc.add(Double.MAX_VALUE,Double.MAX_VALUE);
		ScientificCalculator scalc=new ScientificCalculator();
		scalc.add(10,20);
		scalc.printResult();
		LogicCalculator lcalc=new LogicCalculator();
		lcalc.AND(8,8);
		lcalc.printResult();
		//System.out.println("Hello");
	}

}
