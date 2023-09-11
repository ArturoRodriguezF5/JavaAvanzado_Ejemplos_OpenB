package org.arthycode.dateAPI;

import java.time.*;
import java.time.format.DateTimeFormatter;
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
    public void instant(int version) throws InterruptedException {
        if (version == 7) {
            long ini = System.currentTimeMillis();
            Thread.sleep(5000);
            long fin = System.currentTimeMillis();
            System.out.println(ini - fin);
        } else if (version == 8) {
            Instant ini = Instant.now();
            Thread.sleep(5000);
            Instant fin = Instant.now();
            System.out.println(Duration.between(ini, fin).toMillis());
        }
    }
    public void converter() {
        String fecha = "05/04/1994";
        DateTimeFormatter fomateador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaNac = LocalDate.parse(fecha, fomateador);
        System.out.println(fechaNac);
        System.out.println(fomateador.format(fechaNac));
    }

    public static void main(String[] args) throws InterruptedException {
        App app = new App();
        //app.verificar(8);
        //app.instant(8);
        app.converter();
    }
}
