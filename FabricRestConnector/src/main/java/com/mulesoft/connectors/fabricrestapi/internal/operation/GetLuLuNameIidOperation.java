package com.mulesoft.connectors.fabricrestapi.internal.operation;

import static com.mulesoft.connectivity.rest.commons.internal.RestConstants.CONNECTOR_OVERRIDES;
import static com.mulesoft.connectivity.rest.commons.internal.RestConstants.REQUEST_PARAMETERS_GROUP_NAME;
import static java.util.regex.Pattern.compile;

import com.mulesoft.connectivity.rest.commons.api.configuration.RestConfiguration;
import com.mulesoft.connectivity.rest.commons.api.connection.RestConnection;
import com.mulesoft.connectivity.rest.commons.api.error.RequestErrorTypeProvider;
import com.mulesoft.connectivity.rest.commons.api.operation.BaseRestOperation;
import com.mulesoft.connectivity.rest.commons.api.operation.ConfigurationOverrides;
import com.mulesoft.connectivity.rest.commons.api.operation.HttpResponseAttributes;
import com.mulesoft.connectivity.rest.commons.api.operation.NonEntityRequestParameters;
import com.mulesoft.connectivity.rest.commons.internal.util.RestRequestBuilder;
import com.mulesoft.connectors.fabricrestapi.internal.metadata.GetLuLuNameIidOutputMetadataResolver;
import java.io.InputStream;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import org.mule.runtime.extension.api.annotation.error.Throws;
import org.mule.runtime.extension.api.annotation.metadata.OutputResolver;
import org.mule.runtime.extension.api.annotation.param.Config;
import org.mule.runtime.extension.api.annotation.param.Connection;
import org.mule.runtime.extension.api.annotation.param.MediaType;
import org.mule.runtime.extension.api.annotation.param.NullSafe;
import org.mule.runtime.extension.api.annotation.param.Optional;
import org.mule.runtime.extension.api.annotation.param.ParameterGroup;
import org.mule.runtime.extension.api.annotation.param.display.DisplayName;
import org.mule.runtime.extension.api.annotation.param.display.Summary;
import org.mule.runtime.extension.api.runtime.process.CompletionCallback;
import org.mule.runtime.extension.api.runtime.streaming.StreamingHelper;
import org.mule.runtime.http.api.HttpConstants;

public class GetLuLuNameIidOperation extends BaseRestOperation {
  private static final Pattern LU_NAME_URI_PARAM_PATTERN = compile("\\{luName}");

  private static final Pattern IID_URI_PARAM_PATTERN = compile("\\{iid}");

  private static final RestRequestBuilder.QueryParamFormat QUERY_PARAM_FORMAT =
      RestRequestBuilder.QueryParamFormat.MULTIMAP;

  public GetLuLuNameIidOperation() {}

  /**
   * Get lu by lu name iid
   *
   * <p>This operation makes an HTTP GET request to the /lu/{luName}/{iid} endpoint
   *
   * @param config the configuration to use
   * @param connection the connection to use
   * @param luNameUriParam LU name
   * @param iidUriParam iid to read
   * @param queryQueryParam SQL query
   * @param setQueryParams set session cope
   * @param limitQueryParam result rows limit
   * @param parameters the {@link NonEntityRequestParameters}
   * @param overrides the {@link ConfigurationOverrides}
   * @param streamingHelper the {@link StreamingHelper}
   * @param callback the operation's {@link CompletionCallback}
   */
  @Throws(RequestErrorTypeProvider.class)
  @DisplayName("Get lu by lu name iid")
  @MediaType("application/json")
  @OutputResolver(output = GetLuLuNameIidOutputMetadataResolver.class)
  public void getLuLuNameIid(
      @Config RestConfiguration config,
      @Connection RestConnection connection,
      @DisplayName("Lu Name") @Summary("LU name") String luNameUriParam,
      @DisplayName("iid") @Summary("iid to read") String iidUriParam,
      @Optional @DisplayName("query") @Summary("SQL query") String queryQueryParam,
      @Optional @NullSafe @DisplayName("set") @Summary("set session cope")
          List<String> setQueryParams,
      @Optional @DisplayName("limit") @Summary("result rows limit") Integer limitQueryParam,
      @ParameterGroup(name = REQUEST_PARAMETERS_GROUP_NAME) NonEntityRequestParameters parameters,
      @ParameterGroup(name = CONNECTOR_OVERRIDES) ConfigurationOverrides overrides,
      StreamingHelper streamingHelper,
      CompletionCallback<InputStream, HttpResponseAttributes> callback) {
    String requestPath = "/lu/{luName}/{iid}";
    requestPath = LU_NAME_URI_PARAM_PATTERN.matcher(requestPath).replaceAll(luNameUriParam);
    requestPath = IID_URI_PARAM_PATTERN.matcher(requestPath).replaceAll(iidUriParam);
    RestRequestBuilder builder =
        new RestRequestBuilder(
                connection.getBaseUri(), requestPath, HttpConstants.Method.GET, parameters)
            .setQueryParamFormat(QUERY_PARAM_FORMAT)
            .addHeader("accept", "application/json")
            .addQueryParam("query", queryQueryParam)
            .addQueryParams(
                "set",
                setQueryParams.stream().filter(Objects::nonNull).collect(Collectors.toList()))
            .addQueryParam(
                "limit", limitQueryParam != null ? String.valueOf(limitQueryParam) : null);
    doRequest(
        config,
        connection,
        builder,
        overrides.getResponseTimeoutAsMillis(),
        streamingHelper,
        callback);
  }
}
