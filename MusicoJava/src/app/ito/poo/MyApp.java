package app.ito.poo;
import java.time.LocalDate;

import Musico.ito.poo.intrumento;
public class MyApp {
	static void run() {
     intrumento obj=new intrumento("gitarra","cuerda",5,"Pablo Alboran",LocalDate.of(2021, 2, 18));
     System.out.println(obj);
 	 obj.agregarMusicoFecha("Pablo Alboran",LocalDate.of(2020, 3, 18));
     System.out.println(obj);
     obj=new intrumento("Piano","teclas",4,"Robero Carlos",LocalDate.of(2020, 6, 20));
     System.out.println(obj);
     obj.agregarMusicoFecha("Robero Carlos",LocalDate.of(2020, 3, 18));
     System.out.println(obj);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     run();
	}

}
