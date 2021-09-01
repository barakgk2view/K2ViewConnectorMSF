package com.mulesoft.connectors.fabricrestapi.internal.metadata;

import com.mulesoft.connectivity.rest.commons.api.datasense.metadata.output.JsonOutputMetadataResolver;

public class GetIsAliveOutputMetadataResolver extends JsonOutputMetadataResolver {
  @Override
  public String getSchemaPath() {
    return "/schemas/get-is-alive-output-schema.json";
  }

  @Override
  public String getCategoryName() {
    return "get-is-alive-type-resolver";
  }
}
