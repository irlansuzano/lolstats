package br.com.lolstats.api.controller;

import br.com.lolstats.api.model.LolEsportsLeague;
import br.com.lolstats.constantesGerais.ConstantesGerais;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/leagues")
public class ApiController {

    @GetMapping("/lec")
    public ResponseEntity<LolEsportsLeague> getLec(@RequestHeader(ConstantesGerais.X_API_KEY) String xApiKey){
        xApiKey = "0TvQnueqKa5mxJntVWt0w4LpLfEkrV1Ta8rQBb9Z";
        RestTemplate restTemplate = new RestTemplate();

        StringBuilder stringBuilder = new StringBuilder();
        String response = stringBuilder
                .append(ConstantesGerais.URL_GET_TOURNAMENT_LEAGUES)
                .append("?" + ConstantesGerais.PARAM_HL)
                .append("=" + ConstantesGerais.PARAM_HL_VALUE)
                .append("&" + ConstantesGerais.LEAGUE_ID)
                .append("=" + ConstantesGerais.LEC_ID).toString();

        return restTemplate.getForEntity(response, LolEsportsLeague.class);
    }

}
