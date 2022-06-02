import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class ChatMediator extends Mediator {

    private Hashtable<String, Participante> participantes = new Hashtable<>();

    private List<String> palavrasProibidas = new ArrayList<>();

    public ChatMediator() {
        palavrasProibidas.add("xxxxx");
        palavrasProibidas.add("@!xxx");
        palavrasProibidas.add("###@!");
    }

    public void registraParticipante(Participante p) {
        if(!participantes.containsKey(p.getNome())){
            participantes.put(p.getNome(), p);
        }
        else{
            System.out.println("Usuário já cadastrado.");
        }
    }

    public void enviaMensagem(String remetente, String destinatario, String mensagem) {
        //Verifica se o remetente e o destinatario estão na sala de chat.
        if(participantes.containsKey(remetente) && participantes.containsKey(destinatario)){
            Participante pRemetente = participantes.get(remetente);
            Participante pDestinatario = participantes.get(destinatario);

            for(String proibido : palavrasProibidas){
                if(mensagem.contains(proibido)){
                    pRemetente.recebeMensagem("Mediador", "Você escreveu uma mensagem contendo palavras impróprias.");
                    return;
                }
            }

            pDestinatario.recebeMensagem(remetente, mensagem);
        }
    }

}