package com.mulesoft.connectors.fabricrestapi.internal.metadata;

import com.mulesoft.connectivity.rest.commons.api.datasense.metadata.input.JsonInputMetadataResolver;

public class PostLuLuNameIidInputMetadataResolver extends JsonInputMetadataResolver {
  @Override
  public String getSchemaPath() {
    return "/schemas/post-lu-lu-name-iid-input-schema.json";
  }

  @Override
  public String getCategoryName() {
    return "post-lu-lu-name-iid-type-resolver";
  }
}
