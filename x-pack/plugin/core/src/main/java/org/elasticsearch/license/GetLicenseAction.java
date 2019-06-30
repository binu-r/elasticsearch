/*
 * Copyright Elasticsearch B.V. and/or licensed to Elasticsearch B.V. under one
 * or more contributor license agreements. Licensed under the Elastic License;
 * you may not use this file except in compliance with the Elastic License.
 */
package org.elasticsearch.license;

import org.elasticsearch.action.StreamableResponseActionType;

public class GetLicenseAction extends StreamableResponseActionType<GetLicenseResponse> {

    public static final GetLicenseAction INSTANCE = new GetLicenseAction();
    public static final String NAME = "cluster:monitor/xpack/license/get";

    private GetLicenseAction() {
        super(NAME);
    }

    @Override
    public GetLicenseResponse newResponse() {
        return new GetLicenseResponse();
    }
}
