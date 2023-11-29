    package com.pdaniel.springbootcapitolechallenge.prices.adapters.in.rest;

    import com.pdaniel.springbootcapitolechallenge.prices.application.ports.in.LoadPriceCommand;
    import com.pdaniel.springbootcapitolechallenge.prices.application.ports.in.LoadPricePort;
    import com.pdaniel.springbootcapitolechallenge.prices.application.ports.out.DataResponse;
    import com.pdaniel.springbootcapitolechallenge.prices.domain.exceptions.PriceRepositoryException;
    import org.apache.logging.log4j.LogManager;
    import org.apache.logging.log4j.Logger;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.http.HttpStatus;
    import org.springframework.http.ResponseEntity;
    import org.springframework.web.bind.annotation.*;

    import java.sql.Timestamp;
    import java.time.LocalDateTime;

    import static com.pdaniel.springbootcapitolechallenge.prices.domain.utils.ConstantsUtils.PATH_SEPARATOR;
    import static com.pdaniel.springbootcapitolechallenge.prices.domain.utils.ConstantsUtils.REQUEST_MAPPING_PRICES;

    @RestController
    @RequestMapping(PATH_SEPARATOR + REQUEST_MAPPING_PRICES )
    public class PriceRestController {

        private static final Logger log = LogManager.getLogger(PriceRestController.class);

        private final LoadPricePort loadPricePort;

        @Autowired
        public PriceRestController(LoadPricePort loadPricePort) {
            this.loadPricePort = loadPricePort;
        }

        @GetMapping("/{productId}/{brandId}")
        public ResponseEntity<DataResponse> getPrice(
                @PathVariable Long productId,
                @PathVariable Long brandId,
                @RequestParam(name = "applicationDate", required = true) LocalDateTime applicationDate
            ) throws PriceRepositoryException {

            log.info("Get Price for productID = {} brandID = {} ", productId, brandId);

            try {
                Timestamp timestampFromRequest = Timestamp.valueOf(applicationDate);
                LoadPriceCommand loadPriceCommand = new LoadPriceCommand(timestampFromRequest, productId, brandId);

                DataResponse dataResponse = loadPricePort.searchPrice(loadPriceCommand);

                return ResponseEntity.ok(dataResponse);
            } catch (Exception e) {
                log.error("Get Price for productID = {} brandID = {} applicationDate {}", productId, brandId,
                        applicationDate);

                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new DataResponse());
            }



        }


    }
