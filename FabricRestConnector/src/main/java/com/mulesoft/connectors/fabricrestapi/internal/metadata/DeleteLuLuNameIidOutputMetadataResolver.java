package com.mulesoft.connectors.fabricrestapi.internal.metadata;

import com.mulesoft.connectivity.rest.commons.api.datasense.metadata.output.JsonOutputMetadataResolver;

public class DeleteLuLuNameIidOutputMetadataResolver extends JsonOutputMetadataResolver {
  @Override
  public String getSchemaPath() {
    return "/schemas/delete-lu-lu-name-iid-output-schema.json";
  }

  @Override
  public String getCategoryName() {
    return "delete-lu-lu-name-iid-type-resolver";
  }
}
