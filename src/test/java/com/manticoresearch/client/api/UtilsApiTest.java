/*
 * Manticore Search Client
 * Low-level client for Manticore Search. 
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: info@manticoresearch.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.manticoresearch.client.api;

import com.manticoresearch.client.*;
import com.manticoresearch.client.auth.*;
import com.manticoresearch.client.model.ErrorResponse;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UtilsApi
 */
public class UtilsApiTest {

    private final UtilsApi api = new UtilsApi();

    /**
     * Perform SQL requests
     *
     * Run a query in SQL format. Expects a query string passed through &#x60;body&#x60; parameter and optional &#x60;raw_response&#x60; parameter that defines a format of response. &#x60;raw_response&#x60; can be set to &#x60;False&#x60; for Select queries only, e.g., &#x60;SELECT * FROM myindex&#x60; The query string must stay as it is, no URL encoding is needed. The response object depends on the query executed. In select mode the response has same format as &#x60;/search&#x60; operation. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void sqlTest() throws ApiException {
        //String body = null;
        //Boolean rawResponse = null;
        //List<Object> response = api.sql(body, rawResponse);
        // TODO: test validations
    }

}