package org.arthycode.dateAPI;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Calendar;

public class App {

    public void verificar(int version) {
        if(version == 7) {
            Calendar fecha = Calendar.getInstance();
            Calendar fecha2 = Calendar.getInstance();
            fecha.set(1994, Calendar.APRIL, 21);
            System.out.println(fecha.after(fecha2));
        } else if (version == 8) {
            LocalDate fecha1 = LocalDate.of(1994, 04, 5);
            LocalDate fecha2 = LocalDate.now();

            System.out.println(fecha1.isAfter(fecha2));

            LocalTime hora1 = LocalTime.of(5, 0, 0);
            LocalTime hora2 = LocalTime.now();

            System.out.println(hora1.isAfter(hora2));

            LocalDateTime fh1 = LocalDateTime.of(1994, Month.APRIL, 5, 5, 0, 0);
            LocalDateTime fh2 = LocalDateTime.now();

            System.out.println(fh1.isBefore(fh2));
        }
    }

    public static void main(String[] args) {
        App app = new App();
        app.verificar(8);
    }
}
