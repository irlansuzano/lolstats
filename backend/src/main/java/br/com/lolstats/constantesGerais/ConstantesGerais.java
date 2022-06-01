package br.com.lolstats.constantesGerais;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

public class ConstantesGerais {
    /**
     * Chave de acesso da API do lol esports
     */
    public static final String X_API_KEY = "x-api-value";
    public static final String X_API_KEY_VALUE = "0TvQnueqKa5mxJntVWt0w4LpLfEkrV1Ta8rQBb9Z";

    /**
     * constantes da api de get tournament leagues
     */
    public static final String URL_GET_TOURNAMENT_LEAGUES = "https://esports-api.lolesports.com/persisted/gw/getTournamentsForLeague";
    public static final String PARAM_HL = "hl";
    public static final String PARAM_HL_VALUE = "pt-BR";
    public static final String LEAGUE_ID = "leagueId";
    public static final String LEC_ID = "98767991302996019";

}


