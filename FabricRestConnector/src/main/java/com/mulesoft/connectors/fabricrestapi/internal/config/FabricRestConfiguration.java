package com.mulesoft.connectors.fabricrestapi.internal.config;

import com.mulesoft.connectivity.rest.commons.api.configuration.RestConfiguration;
import com.mulesoft.connectors.fabricrestapi.internal.connection.provider.BearerConnectionProvider;
import com.mulesoft.connectors.fabricrestapi.internal.operation.DeleteCommonTableOperation;
import com.mulesoft.connectors.fabricrestapi.internal.operation.DeleteLuLuNameIidOperation;
import com.mulesoft.connectors.fabricrestapi.internal.operation.DeleteLuLuNameIidTableOperation;
import com.mulesoft.connectors.fabricrestapi.internal.operation.GetCommonOperation;
import com.mulesoft.connectors.fabricrestapi.internal.operation.GetCommonTableOperation;
import com.mulesoft.connectors.fabricrestapi.internal.operation.GetIsAliveOperation;
import com.mulesoft.connectors.fabricrestapi.internal.operation.GetLuLuNameIidOperation;
import com.mulesoft.connectors.fabricrestapi.internal.operation.GetLuLuNameIidTableOperation;
import com.mulesoft.connectors.fabricrestapi.internal.operation.GetLuLuNameOperation;
import com.mulesoft.connectors.fabricrestapi.internal.operation.GetStatusOperation;
import com.mulesoft.connectors.fabricrestapi.internal.operation.PostAuthenticateOperation;
import com.mulesoft.connectors.fabricrestapi.internal.operation.PostCommonTableOperation;
import com.mulesoft.connectors.fabricrestapi.internal.operation.PostLuLuNameIidOperation;
import com.mulesoft.connectors.fabricrestapi.internal.operation.PostLuLuNameIidTableOperation;
import com.mulesoft.connectors.fabricrestapi.internal.operation.PutCommonTableOperation;
import com.mulesoft.connectors.fabricrestapi.internal.operation.PutLuLuNameIidTableOperation;
import org.mule.runtime.extension.api.annotation.Configuration;
import org.mule.runtime.extension.api.annotation.Operations;
import org.mule.runtime.extension.api.annotation.connectivity.ConnectionProviders;

@Configuration
@Operations({
  PostAuthenticateOperation.class,
  GetCommonOperation.class,
  GetCommonTableOperation.class,
  PutCommonTableOperation.class,
  PostCommonTableOperation.class,
  DeleteCommonTableOperation.class,
  GetIsAliveOperation.class,
  GetLuLuNameOperation.class,
  GetLuLuNameIidOperation.class,
  PostLuLuNameIidOperation.class,
  DeleteLuLuNameIidOperation.class,
  GetLuLuNameIidTableOperation.class,
  PutLuLuNameIidTableOperation.class,
  PostLuLuNameIidTableOperation.class,
  DeleteLuLuNameIidTableOperation.class,
  GetStatusOperation.class
})
@ConnectionProviders({BearerConnectionProvider.class})
public class FabricRestConfiguration extends RestConfiguration {}
