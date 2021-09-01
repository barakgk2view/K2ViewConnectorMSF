package com.mulesoft.connectors.fabricrestapi.internal.metadata;

import com.mulesoft.connectivity.rest.commons.api.datasense.metadata.output.JsonOutputMetadataResolver;

public class PutCommonTableOutputMetadataResolver extends JsonOutputMetadataResolver {
  @Override
  public String getSchemaPath() {
    return "/schemas/put-common-table-output-schema.json";
  }

  @Override
  public String getCategoryName() {
    return "put-common-table-type-resolver";
  }
}
