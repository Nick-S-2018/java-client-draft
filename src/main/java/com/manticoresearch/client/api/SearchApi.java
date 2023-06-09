package com.manticoresearch.client.api;

import com.manticoresearch.client.ApiException;
import com.manticoresearch.client.ApiClient;
import com.manticoresearch.client.ApiResponse;
import com.manticoresearch.client.Configuration;
import com.manticoresearch.client.Pair;

import javax.ws.rs.core.GenericType;

import com.manticoresearch.client.model.ErrorResponse;
import com.manticoresearch.client.model.PercolateRequest;
import com.manticoresearch.client.model.SearchRequest;
import com.manticoresearch.client.model.SearchResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-17T15:53:07.663175Z[Etc/UTC]")
public class SearchApi {
  private ApiClient apiClient;

  public SearchApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SearchApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get the API client
   *
   * @return API client
   */
  public ApiClient getApiClient() {
    return apiClient;
  }

  /**
   * Set the API client
   *
   * @param apiClient an instance of API client
   */
  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Perform reverse search on a percolate index
   * Performs a percolate search.  This method must be used only on percolate indexes.  Expects two parameters: the index name and an object with array of documents to be tested. An example of the documents object:    &#x60;&#x60;&#x60;   {\&quot;query\&quot;:{\&quot;percolate\&quot;:{\&quot;document\&quot;:{\&quot;content\&quot;:\&quot;sample content\&quot;}}}}   &#x60;&#x60;&#x60;  Responds with an object with matched stored queries:     &#x60;&#x60;&#x60;   {&#39;timed_out&#39;:false,&#39;hits&#39;:{&#39;total&#39;:2,&#39;max_score&#39;:1,&#39;hits&#39;:[{&#39;_index&#39;:&#39;idx_pq_1&#39;,&#39;_type&#39;:&#39;doc&#39;,&#39;_id&#39;:&#39;2&#39;,&#39;_score&#39;:&#39;1&#39;,&#39;_source&#39;:{&#39;query&#39;:{&#39;match&#39;:{&#39;title&#39;:&#39;some&#39;},}}},{&#39;_index&#39;:&#39;idx_pq_1&#39;,&#39;_type&#39;:&#39;doc&#39;,&#39;_id&#39;:&#39;5&#39;,&#39;_score&#39;:&#39;1&#39;,&#39;_source&#39;:{&#39;query&#39;:{&#39;ql&#39;:&#39;some | none&#39;}}}]}}   &#x60;&#x60;&#x60; 
   * @param index Name of the percolate index (required)
   * @param percolateRequest  (required)
   * @return SearchResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> items found </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> error </td><td>  -  </td></tr>
     </table>
   * 
   * @see <a href="https://manual.manticoresearch.com/Updating_documents/UPDATE">Perform reverse search on a percolate index Documentation</a>
   */
  public SearchResponse percolate(String index, PercolateRequest percolateRequest) throws ApiException {
    return percolateWithHttpInfo(index, percolateRequest).getData();
  }

  /**
   * Perform reverse search on a percolate index
   * Performs a percolate search.  This method must be used only on percolate indexes.  Expects two parameters: the index name and an object with array of documents to be tested. An example of the documents object:    &#x60;&#x60;&#x60;   {\&quot;query\&quot;:{\&quot;percolate\&quot;:{\&quot;document\&quot;:{\&quot;content\&quot;:\&quot;sample content\&quot;}}}}   &#x60;&#x60;&#x60;  Responds with an object with matched stored queries:     &#x60;&#x60;&#x60;   {&#39;timed_out&#39;:false,&#39;hits&#39;:{&#39;total&#39;:2,&#39;max_score&#39;:1,&#39;hits&#39;:[{&#39;_index&#39;:&#39;idx_pq_1&#39;,&#39;_type&#39;:&#39;doc&#39;,&#39;_id&#39;:&#39;2&#39;,&#39;_score&#39;:&#39;1&#39;,&#39;_source&#39;:{&#39;query&#39;:{&#39;match&#39;:{&#39;title&#39;:&#39;some&#39;},}}},{&#39;_index&#39;:&#39;idx_pq_1&#39;,&#39;_type&#39;:&#39;doc&#39;,&#39;_id&#39;:&#39;5&#39;,&#39;_score&#39;:&#39;1&#39;,&#39;_source&#39;:{&#39;query&#39;:{&#39;ql&#39;:&#39;some | none&#39;}}}]}}   &#x60;&#x60;&#x60; 
   * @param index Name of the percolate index (required)
   * @param percolateRequest  (required)
   * @return ApiResponse&lt;SearchResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> items found </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> error </td><td>  -  </td></tr>
     </table>
   * 
   * @see <a href="https://manual.manticoresearch.com/Updating_documents/UPDATE">Perform reverse search on a percolate index Documentation</a>
   */
  public ApiResponse<SearchResponse> percolateWithHttpInfo(String index, PercolateRequest percolateRequest) throws ApiException {
    // Check required parameters
    if (index == null) {
      throw new ApiException(400, "Missing the required parameter 'index' when calling percolate");
    }
    if (percolateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'percolateRequest' when calling percolate");
    }
    

    // Path parameters
    String localVarPath = "/json/pq/{index}/search"
            .replaceAll("\\{index}", apiClient.escapeString(index));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<SearchResponse> localVarReturnType = new GenericType<SearchResponse>() {};
    return apiClient.invokeAPI("SearchApi.percolate", localVarPath, "POST", new ArrayList<>(), percolateRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Performs a search
   *  Expects an object with mandatory properties: * the index name * the match query object Example :    &#x60;&#x60;&#x60;   {&#39;index&#39;:&#39;movies&#39;,&#39;query&#39;:{&#39;bool&#39;:{&#39;must&#39;:[{&#39;query_string&#39;:&#39; movie&#39;}]}},&#39;script_fields&#39;:{&#39;myexpr&#39;:{&#39;script&#39;:{&#39;inline&#39;:&#39;IF(rating&gt;8,1,0)&#39;}}},&#39;sort&#39;:[{&#39;myexpr&#39;:&#39;desc&#39;},{&#39;_score&#39;:&#39;desc&#39;}],&#39;profile&#39;:true}   &#x60;&#x60;&#x60;  It responds with an object with: - time of execution - if the query is timed out - an array with hits (matched documents) found - if profiling is enabled, an additional array with profiling information attached     &#x60;&#x60;&#x60;   {&#39;took&#39;:10,&#39;timed_out&#39;:false,&#39;hits&#39;:{&#39;total&#39;:2,&#39;hits&#39;:[{&#39;_id&#39;:&#39;1&#39;,&#39;_score&#39;:1,&#39;_source&#39;:{&#39;gid&#39;:11}},{&#39;_id&#39;:&#39;2&#39;,&#39;_score&#39;:1,&#39;_source&#39;:{&#39;gid&#39;:12}}]}}   &#x60;&#x60;&#x60;  Alternatively, you can use auxiliary query objects to build your search queries as it&#39;s shown in the example below. For more information about the match query syntax and additional parameters that can be added to  request and response, please check: https://manual.manticoresearch.com/Searching/Full_text_matching/Basic_usage#HTTP. 
   * @param searchRequest  (required)
   * @return SearchResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> error </td><td>  -  </td></tr>
     </table>
   * 
   * @see <a href="https://manual.manticoresearch.com/Searching/Full_text_matching/Basic_usage#HTTP">Performs a search Documentation</a>
   */
  public SearchResponse search(SearchRequest searchRequest) throws ApiException {
    return searchWithHttpInfo(searchRequest).getData();
  }

  /**
   * Performs a search
   *  Expects an object with mandatory properties: * the index name * the match query object Example :    &#x60;&#x60;&#x60;   {&#39;index&#39;:&#39;movies&#39;,&#39;query&#39;:{&#39;bool&#39;:{&#39;must&#39;:[{&#39;query_string&#39;:&#39; movie&#39;}]}},&#39;script_fields&#39;:{&#39;myexpr&#39;:{&#39;script&#39;:{&#39;inline&#39;:&#39;IF(rating&gt;8,1,0)&#39;}}},&#39;sort&#39;:[{&#39;myexpr&#39;:&#39;desc&#39;},{&#39;_score&#39;:&#39;desc&#39;}],&#39;profile&#39;:true}   &#x60;&#x60;&#x60;  It responds with an object with: - time of execution - if the query is timed out - an array with hits (matched documents) found - if profiling is enabled, an additional array with profiling information attached     &#x60;&#x60;&#x60;   {&#39;took&#39;:10,&#39;timed_out&#39;:false,&#39;hits&#39;:{&#39;total&#39;:2,&#39;hits&#39;:[{&#39;_id&#39;:&#39;1&#39;,&#39;_score&#39;:1,&#39;_source&#39;:{&#39;gid&#39;:11}},{&#39;_id&#39;:&#39;2&#39;,&#39;_score&#39;:1,&#39;_source&#39;:{&#39;gid&#39;:12}}]}}   &#x60;&#x60;&#x60;  Alternatively, you can use auxiliary query objects to build your search queries as it&#39;s shown in the example below. For more information about the match query syntax and additional parameters that can be added to  request and response, please check: https://manual.manticoresearch.com/Searching/Full_text_matching/Basic_usage#HTTP. 
   * @param searchRequest  (required)
   * @return ApiResponse&lt;SearchResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> error </td><td>  -  </td></tr>
     </table>
   * 
   * @see <a href="https://manual.manticoresearch.com/Searching/Full_text_matching/Basic_usage#HTTP">Performs a search Documentation</a>
   */
  public ApiResponse<SearchResponse> searchWithHttpInfo(SearchRequest searchRequest) throws ApiException {
    // Check required parameters
    if (searchRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'searchRequest' when calling search");
    }
    

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<SearchResponse> localVarReturnType = new GenericType<SearchResponse>() {};
    return apiClient.invokeAPI("SearchApi.search", "/json/search", "POST", new ArrayList<>(), searchRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
}
