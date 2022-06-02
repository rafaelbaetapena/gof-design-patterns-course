public class MinhaApp {

    public static void main(String[] args) {
        ChatMediator salaChat = new ChatMediator();

        Participante joao = new ParticipanteImpl("João", salaChat);
        Participante maria = new ParticipanteImpl("Maria", salaChat);
        Participante carlos = new ParticipanteImpl("Carlos", salaChat);
        Participante renato = new ParticipanteImpl("Renato", salaChat);

        salaChat.registraParticipante(joao);
        salaChat.registraParticipante(maria);
        salaChat.registraParticipante(carlos);
        salaChat.registraParticipante(renato);

        joao.enviaMensagem("Maria", "Olá Maria, tudo bem ?");
        maria.enviaMensagem("João", "Oi tudo! E com você ?");
        carlos.enviaMensagem("Renato", "Renato, você é um @!xxx.");
        joao.enviaMensagem("Maria", "Você está no trabalho agora ?");
    }

}