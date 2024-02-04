package pradeeptest;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;

public class PradeepTestTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDateFormat sf = new java.text.SimpleDateFormat("dd/MM/yyyy HH:mm");
		System.out.println(LocalDateTime.now());
		System.out.println(sf.format(LocalDateTime.now()));
		
	}

}
