import org.json.JSONObject;

public class JSONTestes {
    public static void main(String[] args) {
        String retorno = "{'solicitacao': '{\"pessoas\": {\"titular\": {\"cpf\": \"43775766820\", \"nome\": \"Patrick Rizzo Correa Caetano\", \"email\": \"caetanopatrick2@gmail.com\"}, \"responsavel\": {\"cpf\": \"43775766820\", \"nome\": \"\", \"email\": \"caetanopatrick2@gmail.com\"}, \"representante_legal\": {\"cpf\": \"\", \"nome\": \"\", \"email\": \"caetanopatrick2@gmail.com\"}, \"outras_pessoas_envolvidas\": {\"cpf\": \"\", \"nome\": \"\"}}, \"solicitacao\": {\"cpf\": \"43775766820\", \"nome\": \"Patrick Rizzo Correa Caetano\", \"codigo\": \"11DE2206136A517B\", \"origem\": \"Videoconferência\", \"perfil\": \"F\", \"produto\": \"Soluti ACS Bird ID Trial V5\", \"unidade\": \"DEFAULT\", \"usuario\": \"DEFAULT\", \"situacao\": \"6\", \"ext_pedido\": \"9002412912\", \"id_usuario\": \"\", \"ext_produto\": \"2970\", \"unidade_ext\": \"\"," +
                " \"data_criacao\": \"2022-06-13 17:01\", \"data_emissao\": \"\", \"data_agendada\": \"2022-06-21 11:45:00\", \"ext_sequencia\": \"1\", \"data_aprovacao\": \"0000-00-00 00:00:00\", \"data_expiracao\": \"0000-00-00 00:00:00\", \"url_origem_emissao\": \"\"}}'}";
        JSONObject jsonObject = new JSONObject(retorno);
        JSONObject solicitacao = new JSONObject(jsonObject.getString("solicitacao"));
        System.out.println(solicitacao);
    }
    private static JSONObject consultaDadosSolicitacaoRetorno() {
        JSONObject retorno = new JSONObject();
        JSONObject solicitacao = new JSONObject();
        JSONObject pessoas = new JSONObject();
        JSONObject titular = new JSONObject();
        JSONObject responsavel = new JSONObject();
        JSONObject representanteLegal = new JSONObject();
        JSONObject outrasPessoasEnvolvidas = new JSONObject();
        JSONObject zero = new JSONObject();

        outrasPessoasEnvolvidas.put("nome", "");
        outrasPessoasEnvolvidas.put("cpf", "");

        representanteLegal.put("nome", "");
        representanteLegal.put("email", "cliente.teste@gmail.com");
        representanteLegal.put("cpf", "");

        responsavel.put("nome", "");
        responsavel.put("email", "cliente.teste@gmail.com");
        responsavel.put("cpf", "53228563073");

        titular.put("nome", "CLIENTE DE TESTE");
        titular.put("email", "cliente.teste@gmail.com");
        titular.put("cpf", "53228563073");

        pessoas.put("titular", titular);
        pessoas.put("responsavel", responsavel);
        pessoas.put("representante_legal", representanteLegal);
        pessoas.put("outras_pessoas_envolvidas", outrasPessoasEnvolvidas);

        solicitacao.put("codigo", "186721081135570A");
        solicitacao.put("data_criacao", "2021-09-23 13:18:20");
        solicitacao.put("data_aprovacao", "0000-00-00 00:00:00");
        solicitacao.put("data_expiracao", "2022-09-23 16:33:46");
        solicitacao.put("situacao", "6");
        solicitacao.put("unidade", "MATRIZ");
        solicitacao.put("produto", "ACS PF A1");
        solicitacao.put("ext_produto", "2859");
        solicitacao.put("ext_pedido", "9000220658");
        solicitacao.put("nome", "CLIENTE DE TESTE");
        solicitacao.put("cpf", "97562575045");
        solicitacao.put("perfil", "F");
        solicitacao.put("unidade_ext", "10003001");
        solicitacao.put("id_usuario", "429");
        solicitacao.put("usuario", "Felipe Neves");
        solicitacao.put("origem", "Videoconfer\u00eancia");
        solicitacao.put("data_agendada", "2021-09-23 14:00:00");

        zero.put("solicitacao", solicitacao);
//        zero.put("pessoas", pessoas);

        retorno.put("status", "success");
        retorno.put("message", "Resposta carregada com sucesso.");
        retorno.put("0", zero);

        System.out.println(zero);
        return zero;
    }
}
