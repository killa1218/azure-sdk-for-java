/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.storage.v2019_06_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.storage.v2019_06_01.TableServices;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.management.storage.v2019_06_01.ListTableServices;
import com.microsoft.azure.management.storage.v2019_06_01.TableServiceProperties;

class TableServicesImpl extends WrapperImpl<TableServicesInner> implements TableServices {
    private final StorageManager manager;

    TableServicesImpl(StorageManager manager) {
        super(manager.inner().tableServices());
        this.manager = manager;
    }

    public StorageManager manager() {
        return this.manager;
    }

    @Override
    public TableServicePropertiesImpl define(String name) {
        return wrapModel(name);
    }

    private TableServicePropertiesImpl wrapModel(TableServicePropertiesInner inner) {
        return  new TableServicePropertiesImpl(inner, manager());
    }

    private TableServicePropertiesImpl wrapModel(String name) {
        return new TableServicePropertiesImpl(name, this.manager());
    }

    @Override
    public Observable<ListTableServices> listAsync(String resourceGroupName, String accountName) {
        TableServicesInner client = this.inner();
        return client.listAsync(resourceGroupName, accountName)
        .map(new Func1<ListTableServicesInner, ListTableServices>() {
            @Override
            public ListTableServices call(ListTableServicesInner inner) {
                return new ListTableServicesImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<TableServiceProperties> getServicePropertiesAsync(String resourceGroupName, String accountName) {
        TableServicesInner client = this.inner();
        return client.getServicePropertiesAsync(resourceGroupName, accountName)
        .flatMap(new Func1<TableServicePropertiesInner, Observable<TableServiceProperties>>() {
            @Override
            public Observable<TableServiceProperties> call(TableServicePropertiesInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((TableServiceProperties)wrapModel(inner));
                }
            }
       });
    }

}
