package com.mulesoft.connectors.fabricrestapi.internal.metadata;

import com.mulesoft.connectivity.rest.commons.api.datasense.metadata.input.JsonInputMetadataResolver;

public class PostCommonTableInputMetadataResolver extends JsonInputMetadataResolver {
  @Override
  public String getSchemaPath() {
    return "/schemas/post-common-table-input-schema.json";
  }

  @Override
  public String getCategoryName() {
    return "post-common-table-type-resolver";
  }
}
