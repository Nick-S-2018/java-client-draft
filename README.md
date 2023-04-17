# manticoresearch

Manticore Search Client

- API version: 1.0.0

- Build date: 2023-04-17T15:23:31.423902Z[Etc/UTC]

Low-level client for Manticore Search.


  For more information, please visit [https://manticoresearch.com/contact-us/](https://manticoresearch.com/contact-us/)

*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.manticoresearch</groupId>
  <artifactId>manticoresearch</artifactId>
  <version>3.2.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'manticoresearch' jar has been published to maven central.
    mavenLocal()       // Needed if the 'manticoresearch' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "com.manticoresearch:manticoresearch:3.2.0"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

- `target/manticoresearch-3.2.0.jar`
- `target/lib/*.jar`

## Usage

To add a HTTP proxy for the API client, use `ClientConfig`:
```java

import org.glassfish.jersey.apache.connector.ApacheConnectorProvider;
import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.client.ClientProperties;
import com.manticoresearch.client.*;
import com.manticoresearch.client.api.IndexApi;

...

ApiClient defaultClient = Configuration.getDefaultApiClient();
ClientConfig clientConfig = defaultClient.getClientConfig();
clientConfig.connectorProvider(new ApacheConnectorProvider());
clientConfig.property(ClientProperties.PROXY_URI, "http://proxy_url_here");
clientConfig.property(ClientProperties.PROXY_USERNAME, "proxy_username");
clientConfig.property(ClientProperties.PROXY_PASSWORD, "proxy_password");
defaultClient.setClientConfig(clientConfig);

IndexApi apiInstance = new IndexApi(defaultClient);

```

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.manticoresearch.client.*;
import com.manticoresearch.client.auth.*;
import com.manticoresearch.client.model.*;
import com.manticoresearch.client.api.IndexApi;

public class IndexApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://127.0.0.1:9308");
        
        IndexApi apiInstance = new IndexApi(defaultClient);
        String body = ["'{\"insert\": {\"index\": \"test\", \"id\": 1, \"doc\": {\"title\": \"Title 1\"}}},\\n{\"insert\": {\"index\": \"test\", \"id\": 2, \"doc\": {\"title\": \"Title 2\"}}}'"]; // String | 
        try {
            BulkResponse result = apiInstance.bulk(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IndexApi#bulk");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://127.0.0.1:9308*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*IndexApi* | [**bulk**](docs/IndexApi.md#bulk) | **POST** /json/bulk | Bulk index operations
*IndexApi* | [**delete**](docs/IndexApi.md#delete) | **POST** /json/delete | Delete a document in an index
*IndexApi* | [**insert**](docs/IndexApi.md#insert) | **POST** /json/insert | Create a new document in an index
*IndexApi* | [**replace**](docs/IndexApi.md#replace) | **POST** /json/replace | Replace new document in an index
*IndexApi* | [**update**](docs/IndexApi.md#update) | **POST** /json/update | Update a document in an index
*SearchApi* | [**percolate**](docs/SearchApi.md#percolate) | **POST** /json/pq/{index}/search | Perform reverse search on a percolate index
*SearchApi* | [**search**](docs/SearchApi.md#search) | **POST** /json/search | Performs a search
*UtilsApi* | [**sql**](docs/UtilsApi.md#sql) | **POST** /sql | Perform SQL requests


## Documentation for Models

 - [Aggregation](docs/Aggregation.md)
 - [BoolFilter](docs/BoolFilter.md)
 - [BulkResponse](docs/BulkResponse.md)
 - [DeleteDocumentRequest](docs/DeleteDocumentRequest.md)
 - [DeleteResponse](docs/DeleteResponse.md)
 - [EqualsFilter](docs/EqualsFilter.md)
 - [ErrorResponse](docs/ErrorResponse.md)
 - [Facet](docs/Facet.md)
 - [FilterBoolean](docs/FilterBoolean.md)
 - [FilterNumber](docs/FilterNumber.md)
 - [FilterString](docs/FilterString.md)
 - [GeoDistanceFilter](docs/GeoDistanceFilter.md)
 - [GeoDistanceFilterLocationAnchor](docs/GeoDistanceFilterLocationAnchor.md)
 - [Highlight](docs/Highlight.md)
 - [HighlightField](docs/HighlightField.md)
 - [InFilter](docs/InFilter.md)
 - [InsertDocumentRequest](docs/InsertDocumentRequest.md)
 - [MatchFilter](docs/MatchFilter.md)
 - [MatchOp](docs/MatchOp.md)
 - [MatchOpFilter](docs/MatchOpFilter.md)
 - [MatchPhraseFilter](docs/MatchPhraseFilter.md)
 - [NotFilterBoolean](docs/NotFilterBoolean.md)
 - [NotFilterNumber](docs/NotFilterNumber.md)
 - [NotFilterString](docs/NotFilterString.md)
 - [PercolateRequest](docs/PercolateRequest.md)
 - [PercolateRequestQuery](docs/PercolateRequestQuery.md)
 - [QueryFilter](docs/QueryFilter.md)
 - [RangeFilter](docs/RangeFilter.md)
 - [SearchRequest](docs/SearchRequest.md)
 - [SearchResponse](docs/SearchResponse.md)
 - [SearchResponseHits](docs/SearchResponseHits.md)
 - [SortMVA](docs/SortMVA.md)
 - [SortMultiple](docs/SortMultiple.md)
 - [SortOrder](docs/SortOrder.md)
 - [SourceByRules](docs/SourceByRules.md)
 - [SuccessResponse](docs/SuccessResponse.md)
 - [UpdateDocumentRequest](docs/UpdateDocumentRequest.md)
 - [UpdateResponse](docs/UpdateResponse.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

info@manticoresearch.com
