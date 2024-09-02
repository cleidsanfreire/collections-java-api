package map.operacoesbasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    //attributes
    private Map<String, Integer> agendaContatosMap;

    public AgendaContatos() {
        this.agendaContatosMap = new HashMap<>();
    }

    public void addContact(String name, Integer telephone) {
        agendaContatosMap.put(name, telephone);
    }

    public void removeContact(String name) {
        if (!agendaContatosMap.isEmpty()) {
            agendaContatosMap.remove(name);
        }
    }

    public void displayContact() {
        System.out.println(agendaContatosMap);
    }

    public Integer searchingForName(String name) {
        Integer numberForContact = null;
        if (!agendaContatosMap.isEmpty()) {
            numberForContact = agendaContatosMap.get(name);
        }
        return numberForContact;
    }

    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();
        agenda.displayContact();

        agenda.addContact("Eu",619197124);
        agenda.addContact("Eu",7124);
        agenda.addContact("Es",6191124);
        agenda.addContact("Ex",6191971);
        agenda.addContact("Er",6197124);

        agenda.displayContact();
        agenda.removeContact("Eu");
        agenda.displayContact();

        System.out.println(agenda.searchingForName("Ex"));;
    }
}
