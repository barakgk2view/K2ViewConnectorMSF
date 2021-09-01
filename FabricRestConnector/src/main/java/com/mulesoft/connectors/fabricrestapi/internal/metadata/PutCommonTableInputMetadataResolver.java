package com.mulesoft.connectors.fabricrestapi.internal.metadata;

import com.mulesoft.connectivity.rest.commons.api.datasense.metadata.input.JsonInputMetadataResolver;

public class PutCommonTableInputMetadataResolver extends JsonInputMetadataResolver {
  @Override
  public String getSchemaPath() {
    return "/schemas/put-common-table-input-schema.json";
  }

  @Override
  public String getCategoryName() {
    return "put-common-table-type-resolver";
  }
}
