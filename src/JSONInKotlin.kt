import org.json.JSONArray

fun main() {
    val resposta =
        "[{\"nome\":\"teste1\",\"urlBannerDesktop\":\"buscarUrlBanner(bannerObject.nome)\",\"urlBannerMobile\":\"buscarUrlBanner(bannerObject.nome.plus(MOBILE))\",\"slot\":\"\",\"linkRedirect\":null,\"acaoMixpanel\":\"\",\"variaveisHubspot\":\"\",\"tela\":\"home\"},{\"nome\":\"teste3\",\"urlBannerDesktop\":\"buscarUrlBanner(bannerObject.nome)\",\"urlBannerMobile\":\"buscarUrlBanner(bannerObject.nome.plus(MOBILE))\",\"slot\":\"\",\"linkRedirect\":null,\"acaoMixpanel\":\"\",\"variaveisHubspot\":\"\",\"tela\":\"home\"},{\"nome\":\"teste4\",\"urlBannerDesktop\":\"buscarUrlBanner(bannerObject.nome)\",\"urlBannerMobile\":\"buscarUrlBanner(bannerObject.nome.plus(MOBILE))\",\"slot\":\"header\",\"linkRedirect\":null,\"acaoMixpanel\":\"\",\"variaveisHubspot\":\"\",\"tela\":\"contato\"}]"
    val body = JSONArray(resposta).get(0)
    println(resposta)
    println(body)
}