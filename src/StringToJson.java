import org.json.JSONObject;

public class StringToJson {
    public static void main(String[] args) {
        String teste = "{\"referer\":\"http://certificado.contabilizei.com/certificado/api/v1/certificado/gerar\",\"situacao\":\"EMITIDO\",\"mensagemContabilizei\":\"Ageraçãodocertificadofoiconcluída.\",\"dataUltimaVerificacao\":1626314981621,\"ip\":\"0.1.0.2\",\"userAgent\":\"AppEngine-Google;(+http://code.google.com/appengine)\",\"digitalTermHash\":\"302f300b060960864801650304020104200ab2e5d3defd15ffb5017d3728a9fef00a6e4c1e7e6835a97569b58d72736d74\",\"cnpj\":\"37427958000173\",\"message\":\"\",\"responseCode\":200,\"solicitacao\":\"11DE210702603FA037427958000173\",\"id\":5768254560665600,\"ultimaVerificacao\":1626314981621,\"status\":2,\"hmacRequest\":null}";
        JSONObject jsonObject = new JSONObject(teste);
        System.out.println(jsonObject);
    }

}
