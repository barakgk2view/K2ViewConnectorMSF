package com.mulesoft.connectors.fabricrestapi.internal.metadata;

import com.mulesoft.connectivity.rest.commons.api.datasense.metadata.output.JsonOutputMetadataResolver;

public class GetLuLuNameOutputMetadataResolver extends JsonOutputMetadataResolver {
  @Override
  public String getSchemaPath() {
    return "/schemas/get-common-output-schema.json";
  }

  @Override
  public String getCategoryName() {
    return "get-lu-lu-name-type-resolver";
  }
}
