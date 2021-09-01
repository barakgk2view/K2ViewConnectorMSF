package com.mulesoft.connectors.fabricrestapi.internal.metadata;

import com.mulesoft.connectivity.rest.commons.api.datasense.metadata.input.JsonInputMetadataResolver;

public class PostAuthenticateInputMetadataResolver extends JsonInputMetadataResolver {
  @Override
  public String getSchemaPath() {
    return "/schemas/post-authenticate-input-schema.json";
  }

  @Override
  public String getCategoryName() {
    return "post-authenticate-type-resolver";
  }
}
