package com.openclassrooms.safetyNetAlerts;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.apache.logging.log4j.LogManager;

import com.openclassrooms.safetyNetAlerts.model.MedicalRecord;

public class AgeCalculator {

	private static final org.apache.logging.log4j.Logger logger = LogManager.getLogger(AgeCalculator.class);

	private LocalDate currentDate = LocalDate.now();
	private MedicalRecord medicalrecord = new MedicalRecord();
	private Date birthDate = medicalrecord.getBirthdate();
	private int age;

	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
	Date date = birthDate;

	public AgeCalculator(int localDate) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static int calculateAge(LocalDate localDate, LocalDate currentDate) {
		if ((localDate != null) && (currentDate != null)) {
			return Period.between(localDate, currentDate).getYears();
		} else {
			return 0;
		}
	}
}
