package map.ordenacaoMap;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEventos {
    private Map<LocalDate,Evento> eventoMap;

    public AgendaEventos() {
        this.eventoMap = new HashMap<>();
    }

    public void addEvent(LocalDate data, String nome, String atracao){
        Evento evento = new Evento(nome,atracao);
        eventoMap.put(data,evento);
    }

    public void exibirAgenda(){
        Map<LocalDate,Evento> event = new TreeMap<>(eventoMap);
        System.out.println(event);
    }

    public void obterProximoEvento() {
        /*Set<LocalDate> dateSet = eventoMap.keySet();
        Collection<Evento> values = eventoMap.values();*/
        // eventosMap.get();

        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate, Evento> event = new TreeMap<>(eventoMap);
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        for (Map.Entry<LocalDate, Evento> entry : event.entrySet()) {
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O Proximo evento " + proximoEvento + " Acontecerar no dia: " + proximaData);
                break;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Hoje e: " + LocalDate.now());
        AgendaEventos agenda = new AgendaEventos();
        agenda.addEvent(LocalDate.of(2024, Month.SEPTEMBER,2),"Evento 1","Atracao 1");
        agenda.addEvent(LocalDate.of(2024, Month.DECEMBER,10),"Evento 3","Atracao 3");
        agenda.addEvent(LocalDate.of(2024, Month.NOVEMBER,22),"Evento 4","Atracao 4");
        agenda.addEvent(LocalDate.of(2024, Month.SEPTEMBER,23),"Evento 2","Atracao 2");

        agenda.exibirAgenda();

        agenda.obterProximoEvento();
    }
}
