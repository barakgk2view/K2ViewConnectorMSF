package com.mulesoft.connectors.fabricrestapi.internal.metadata;

import com.mulesoft.connectivity.rest.commons.api.datasense.metadata.input.JsonInputMetadataResolver;

public class PutLuLuNameIidTableInputMetadataResolver extends JsonInputMetadataResolver {
  @Override
  public String getSchemaPath() {
    return "/schemas/put-common-table-input-schema.json";
  }

  @Override
  public String getCategoryName() {
    return "put-lu-lu-name-iid-table-type-resolver";
  }
}
