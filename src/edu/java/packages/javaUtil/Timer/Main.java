package edu.java.packages.javaUtil.Timer;

import java.sql.Time;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class Main {

    public static void main(String[] args) {
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int counter = 10;
            @Override
            public void run() {
                if (counter>0){
                    System.out.println(counter + " seconds");
                    counter--;
                } else{
                    System.out.println("Bla");
                    timer.cancel();
                }
            }
        };
        Calendar date = Calendar.getInstance(); //Agendamento da tarefa
        date.set(Calendar.YEAR, 2024);
        date.set(Calendar.MONTH, Calendar.MAY); //criar um contador de mês
        date.set(Calendar.DAY_OF_MONTH, 3);
        date.set(Calendar.HOUR_OF_DAY,10);
        date.set(Calendar.MINUTE, 7);
        date.set(Calendar.SECOND, 0);
        date.set(Calendar.MILLISECOND, 0);


        //timer.schedule(task, date.getTime()); //Disparando no momento do agendamento
        //timer.schedule(task, 0); // executa a tarefa imediatamente
        timer.scheduleAtFixedRate(task, /*quando inicia */date.getTime(), /*frequencia */ 1000); //agenda tarefa com data e frequencia
        //aprender como gerar tarefa pra executar 1 vez por mês


    }
}
