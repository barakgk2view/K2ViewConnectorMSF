package com.mulesoft.connectors.fabricrestapi.internal.metadata;

import com.mulesoft.connectivity.rest.commons.api.datasense.metadata.output.JsonOutputMetadataResolver;

public class DeleteLuLuNameIidTableOutputMetadataResolver extends JsonOutputMetadataResolver {
  @Override
  public String getSchemaPath() {
    return "/schemas/put-common-table-output-schema.json";
  }

  @Override
  public String getCategoryName() {
    return "delete-lu-lu-name-iid-table-type-resolver";
  }
}
