package com.mulesoft.connectors.fabricrestapi.internal.metadata;

import com.mulesoft.connectivity.rest.commons.api.datasense.metadata.output.JsonOutputMetadataResolver;

public class DeleteCommonTableOutputMetadataResolver extends JsonOutputMetadataResolver {
  @Override
  public String getSchemaPath() {
    return "/schemas/put-common-table-output-schema.json";
  }

  @Override
  public String getCategoryName() {
    return "delete-common-table-type-resolver";
  }
}
